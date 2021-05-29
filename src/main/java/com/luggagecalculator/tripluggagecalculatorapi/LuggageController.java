package com.luggagecalculator.tripluggagecalculatorapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class LuggageController {


    @GetMapping("/luggage")
    public LuggageResponse Sample(@RequestParam int kilometers,
                            @RequestParam int days,
                            @RequestParam int nightsIndoors,
                            @RequestParam boolean inWinter,
                            @RequestParam boolean inSummer,
                            @RequestParam boolean inAutumn,
                            @RequestParam boolean inSpring){

        int check = 0;
        if (inAutumn) check++;
        if (inSpring) check++;
        if (inSummer) check++;
        if (inWinter) check++;

        if (check == 0 || check > 1) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "One time of the year must be chosen", null);
        }

        if (days < 1){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid number of days", null);
        }

        if (nightsIndoors >= days || nightsIndoors < 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid number of nights indoors", null);
        }

        if (kilometers <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid amount of kilometers", null);
        }

        Request request = new Request(kilometers, days, nightsIndoors, inWinter, inSummer, inAutumn, inSpring);

        return Processor.ProcessRequest(request);
    }
}

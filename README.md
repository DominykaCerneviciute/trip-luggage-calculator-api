# trip luggage calculator api

## endpoint dokumentacija
endpoint URL: GET http://localhost:8080/luggage
### endpoint parametrai: 
   - kilometers (int) - visos kelionės kilometrų skaičius
   - days (int) - kiek dienų truks kelionė
   - nightsIndoors (int) - kiek naktų planuojama miegoti patalpoje 
   - inWinter (boolean) - ar kelionė vyks žiemą
   - inSummer (boolean) - ar kelionė vyks vasarą
   - inAutumn (boolean) - ar kelionė vyks rudenį
   - inSpring (boolean) - ar kelionė vyks pavasarį
   
### endpoint užklausos pavyzdys:

http://localhost:8080/luggage?kilometers=100&days=3&nightsIndoors=0&inWinter=true&inSummer=false&inAutumn=false&inSpring=false

### endpint rezultatas
  - "name" - daikto pavadinimas
  - "totalAmount" - reikalingas kiekis visai kelionei
  - "perDay" - rezultatas null parodo, kad daikto kiekis skirtas visai kelionei bendrai, skaičius - koks daikto kiekis bus reikalingas vienai dienai, tačiau jo atsargos kasdien gali būti papildomos pvz.: visai kelionei reikalingi 9 litrai vandens (totalAmount), o vienai dienai reikalingi 3 litrai vandens, todėl nereikia vienu metu tempti 9 litrų vandens, jo atsargos trijų litrų taroje gali būti atnaujinamos kasdien


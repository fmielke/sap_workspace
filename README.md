# sap_workspace
RELEVANT FILES
--------------
Backup directory

# Changelog
no | date  | author | change
------------- | ------------- | ------------- | -------------
0 |  |  | initial
1 | 17.12.2015 | msmacco | added decision table "AufschlagBerechnen"
2 | 18.12.2015 | fmielke | "ArtikelVerfuegbarkeit" makes sense now, calculate "AnzahlFehlendeArtikelmenge" and give it to "Beschaffung", new UI "Kundenbestaetigung Aufschlag"
3 | 20.12.2015 | msmacco | "Hausnummer von Integer zu String"
4 | 07.01.2016 | msmacco | Aufschlagsbestätigung vor Artikel Beschaffung gesetzt, HändlerService angepasst damit unterschiedliche Preise und Liefertzage bei PI-DG und PI-GT
5 | 20.01.2016 | fmielke | "Aufschlag bestätigen" vor "Kunde akzeptiert Aufschlag?", Kunde kann Bestellung neu auslösen und neue Menge angeben
6 | 20.01.2016 | fmielke | Mail an Kunden im Fall Artikel versenden
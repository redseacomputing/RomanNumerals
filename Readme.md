# Roman Numerals


Schreibe eine Funktion, die Römische Zahlen in Dezimalzahlen übersetzt.

Beispiele:

„I“ -> 1
„II“ -> 2
„IV“ -> 4
„V“ -> 5
„IX“ -> 9
„XLII“ -> 42
„XCIX“ -> 99
„MMXIII“ -> 2013

Die Römischen Zahlen bewegen sich im Bereich von „I“ bis „MMM“.

## Überlegungen:

* Muss die einzelnen Symbole kennen ( I, C, V,....)
* Zusammen rechnen der Symbole ( II, III, MMXIII )
* Beachten der subtraktiven Form: Wenn eine kleinere röm. Zahl 
  vor einer größeren kommt, dann multipliziere die kleinere mal -1
* Kommt als String, iteriert über einzelne char's, konvertiert auf Dezimal und
  vergleiche mit vorherigen/nächsten, summieren
* Datenstrukturen: ? ---> HashMap
    
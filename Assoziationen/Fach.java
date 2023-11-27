/*
    Führen Sie bitte zunächst die beiden folgenden Klassen ein:
       Fach (Attribute: id, bezeichnung)
       Klausur (Attribute: id, note)
    Erzeugen Sie bitte die beiden folgenden Objekte vom Typ Fach:
       Java-Grundlagen
       Datenbankmodellierung und SQL
       (wählen Sie beliebige ID)
    Erzeugen Sie bitte die drei folgenden Objekte vom Typ Klausur:
       2 Klausuren im Fach Java
       1 Klausur im Fach DBM+SQL
       (wählen Sie beliebige ID und Noten)

    Sorgen Sie bitte für eine BIDIREKTIONALE Navigierbarkeit
    (Dazu müssen Sie weitere Klassenmember einfügen)

    Schreiben Sie ferner bitte das folgende Programm im Main:
       In einer Endlos-Schleife wird pro Durchlauf ...
         - vom User abgefragt, ob er ...
           (1) von Klausur zum Fach navigieren, oder
           (2) von Fach zur Klausur navigieren möchte
           (Wiederholung der Abfrage, wenn weder 1, noch 2 gewählt wurde)
         - Falls 1 gewählt wurde, so wird vom User eine Klausur-ID abgefragt
             Falls die Eingabe einen Format-Fehler hat, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber keine Klausur mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe der Fach-Bezeichnung
         - Falls 2 gewählt wurde, so wird vom User eine Fach-ID abgefragt
             Falls die Eingabe ein Format-Fehler, wird die Abfrage wiederholt
             Falls die Eingabe vom Format OK, aber kein Fach mit der gewählten ID existiert: Fehlermeldung + Wiederholung der Abfrage
             Falls Eingabe-Format OK UND ID existiert: Ausgabe aller Klausur-IDs und Noten der Klausuren zu diesem Fach
*/package Assoziationen;

public class Fach {
private  int id;
private String bezeichnung;
Fach(String bezeichnung,int id){
    this.bezeichnung=bezeichnung;
    this.id=id;
}
public String getBezeichnung(){
 return this.bezeichnung;
}
public int getId(){
    return this.id;
}
}














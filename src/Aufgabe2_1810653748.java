import javax.swing.*;

public class Aufgabe2_1810653748
{
    public static void main (String[]args)
    {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie bitte eine ganze Zahl ein")); //Die herausgefundene Zahl in einen INTEGER zu verwandeln, damit man später mit dieser rechnen kann
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie bitte eine weitere ganze Zahl ein"));

        int versuche = 0; // Versuche von 0 weckgezählt
        if (zahl1 == zahl2)     //wenn die Zahlen gleich sind wird .... ausgegebn
            {
            System.out.println("Ihre erste Zahl " +zahl1+ " == wie Ihre zweite Zahl" +zahl2); //sagen was die Konsole ausgeben soll
            }
        while (zahl1 != zahl2)  //wenn zahl1 UNGLEICH zahl zwei ist
            {
                versuche++;       //Durchlauf wiederholen
                if (zahl1 > zahl2) //wenn die erste Zahl größer als die zweite Zahl ist,
                {
                zahl2++;            //dann bei der kleineren, in diesem Fall Zahl2, solange inkrementieren bis sie gleich der ersten ist
                }                   // deshalb danach die ++ danach weil sonst das Ergebnis eines zu früh ausgeworfen wird
                if (zahl2 > zahl1) //wenn die zweite Zahl größer als die erste Zahl ist,
                {
                zahl1++;        //dann bei ersten Zahl so oft inkrementieren bis sie gleich der zweiten Zahl ist
                }
                if (zahl1 == zahl2) //wenn dann die Zahlen gleich sind,
                {
                System.out.println(zahl1); //die erste Zahl auf der Konsole auswerfen
                System.out.println("Es wurden " + versuche + " zusätzliche Schritte für das Ergebnis benötigt"); //und dazu schreiben wie viele Versuche/Durchgäng dafür benötigt wurden bis sie gleich waren
                }
            }
    }
}

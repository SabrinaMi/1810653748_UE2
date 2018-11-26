public class Aufgabe4_1810653748
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 11;i++) /* in der for-Schleife wird angegeben das es ab 1 (die null nicht ausgeben)- 11 Schritte weit gehen/ausgeben soll (also bis 10)
        ebenso wird klargestellt das es immer einen Schritt aufeinmal weit gehen soll*/
        {
            System.out.println("Der Schleifenzähler ist " + i); /*wird gesagt was die Konsole ausgeben soll, das i steht für wie oft*/
        }

        int whilezähler = 1; /* in er Schleife wird angegeben wie oft sich das ganze wiederholen soll*/
        while (whilezähler < 11)
        {
            System.out.println("Der Schleifenzähler ist " + whilezähler);
            whilezähler++;
        }

        whilezähler = 1;
        do
            {
            System.out.println("Der Schleifenzähler ist " + whilezähler);
            whilezähler++;
            }

        while(whilezähler < 11);

    }
}

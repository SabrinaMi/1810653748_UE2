import javax.swing.*;

public class Aufgabe5_1810653748
{
    public static void main(String[] args)
    {
        int forlauf1 = 10;
        int forlauf2 = 3;
        int userzahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl ein"));
        int userzahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine zweite Zahl ein"));
        forschleife(forlauf1);
        forschleife(forlauf2);
        whileschleife(forlauf1);
        whileschleife(forlauf2);
        nutzerschleife(userzahl1, userzahl2);

    }
    private static void forschleife(int durchlauf)
    {
        for(int i= 0; i<durchlauf; i++)
        {
            System.out.println("Der Schleifenzähler ist: "+ (i + 1));
        }
    }
    private static void whileschleife(int durchlauf)
    {
        int i = 1;
        while(i <= durchlauf)
        {
            if (i%2!=0)
            {
                i++;
            }
            else if (i<=durchlauf)
            {
                System.out.println("Der Schleifenzähler ist: "+(i++));
            }


        }
    }
    private static void nutzerschleife(int durchlauf1, int durchlauf2)
    {
        int durchlauf = 1;
        for (int i = 0; i < durchlauf1; i++)
        {
            for (int j = 0; j < durchlauf2; j++)
            {
                System.out.println("Das ist der " + durchlauf + ". Durchlauf der inneren Schleife!");
                durchlauf++;
            }
        }
    }
}
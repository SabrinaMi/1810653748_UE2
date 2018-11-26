import javax.swing.*;

public class Aufgabe3_1810653748
{
   public static void main (String []args)
   {
       String eingabe = JOptionPane.showInputDialog("geben Sie das Alter ein");
       /* String= Der Benutzer wird mit einem String nach seinem Alter gefragt,
       / Alter deshalb, um sie bei den darunter folgenden Variablen ausgeben zu können - ZAHL*/

       double alter = Double.parseDouble(eingabe);
       JOptionPane.showMessageDialog(null, alter);
       /* bei String wird angegeben was "eingabe" für einen wert hat, dieser wird bei jeder Variable wieder hergenommen,
       bei double wird mir das Alter in Kommawerten ausgegeben -Fließkommawert*/


       int intalter = Integer.parseInt(eingabe);
       JOptionPane.showMessageDialog(null, intalter);
       /* bei int wird die ganze Zahl ausgegeben*/

       boolean boolalter = Boolean.parseBoolean(eingabe);
       JOptionPane.showMessageDialog(null, boolalter);
       /*wird der Wahrheitswert der Zahl bzw. der eingabe ausgegeben*/

       long longalter = Long.parseLong(eingabe);
       JOptionPane.showMessageDialog(null, longalter);
       /**/

       char charalter = eingabe.charAt(0);
       JOptionPane.showMessageDialog(null, charalter);
       /**/

       byte alteer = Byte.parseByte(eingabe);
       JOptionPane.showMessageDialog(null, alteer);
       /**/

       short shortalter = Short.parseShort(eingabe);
       JOptionPane.showMessageDialog(null, shortalter);
       /**/

       float floatalter = Float.parseFloat(eingabe);
       JOptionPane.showMessageDialog(null, floatalter);
       /**/

       String newvar = String.valueOf(alter);
       JOptionPane.showMessageDialog(null, newvar);
       /**/

   }

}

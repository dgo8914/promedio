
package promedio5;

import javax.swing.JOptionPane;

public class Promedio5 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5, sumas;
 float prom;
 num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valor uno: "));
 num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valor dos: "));
 num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valor tres: "));
 num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valo cuatro: "));
 num5 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el valor cinco : "));
 sumas=(num1+num2+num3+num4+num5);

 prom = (sumas / 5);
 System.out.println ("el promedio del los 5 numeros es : " +prom );
 JOptionPane.showConfirmDialog(null, "el promedio de los numeros es : "+prom);
        
    
    }
    
}

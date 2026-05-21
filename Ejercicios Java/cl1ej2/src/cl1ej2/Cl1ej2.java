/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl1ej2;

import javax.swing.JOptionPane;

public class Cl1ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //mi prima en bici
//        System.out.println("Hola mundo!");
//        String text = input.nextLine();
//        System.out.println("Hola "+text+"!");
        String variable1;
        //no se puede tener el mismo nombre en dos variables
        //usar camelCase: ejemploCamelCase
        int variable2;
        variable1 = "Brandon";
        System.out.println("Hola " + variable1 + "!");
        double miData;
        miData = 0.0;
        JOptionPane.showMessageDialog(null, miData);
        //si no se declara la variable, dara error
        //alt+92 para backslash
        JOptionPane.showMessageDialog(null, "texto1" + "\ntexto2");
        
        int edad=0;
        String edadString="";
        edadString=JOptionPane.showInputDialog("Digite la edad para tomar alcohol: ");
        edad = Integer.parseInt(edadString);
        edad +=3;
        edadString +=3;
        JOptionPane.showInternalMessageDialog(null, edad);
        JOptionPane.showInternalMessageDialog(null, edadString);
    }
    
}

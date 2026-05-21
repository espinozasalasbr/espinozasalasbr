/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl2ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Cl2ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad=20;
        String nombre="Hosh";
        double salarios=0.0;
        String comodin="";
        int loteria=0;
        String imprimir=nombre+ "\n"
                +"Edad: "+edad+ "\n"
                +"Salario: "+salarios;
        JOptionPane.showMessageDialog(null, imprimir);
        comodin=JOptionPane.showInputDialog("Digite un numero: ");
        loteria=Integer.parseInt(comodin);
        loteria+=10;
        JOptionPane.showInternalMessageDialog(null, loteria);
    }
    
    
}


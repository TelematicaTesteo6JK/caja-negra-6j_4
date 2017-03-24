/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author 20115123
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double dinero ;
       double Resultado;
        Scanner entradaEscaner = new Scanner (System.in);
        
        System.out.println ("Inserte balance:");
        
        dinero = entradaEscaner.nextInt();
        
        Resultado = milibreria.obtiene_rendimiento(dinero);
        
        
        System.out.println ("El rendimiento de su cuenta es de: $" +Resultado);
        
        
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author 20115123
 */
public class milibreria {
    
    public static double obtiene_rendimiento(double a){
        double aux = 0;
        if(a < 1000){
            aux = a * .01;
            System.out.println ("El porcentaje de rendimiento de su cuenta es de: 1%" );
        }
        else if (a <= 10000){
        
            aux = a * .03; 
            System.out.println ("El porcentaje de rendimiento de su cuenta es de: 3%" );
        }
        else if (a > 10000) {
        
            aux = a * .05;
            System.out.println ("El porcentaje de rendimiento de su cuenta es de: 5%" );
        }
            
        
        return aux;
    }
    
}

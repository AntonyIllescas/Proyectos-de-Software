/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Antony
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	System.out.println("Suma: "+suma(2,4));
    	System.out.println("Resta: "+resta(10,5));
    }    
    public static int resta(int a, int b) {
    	return a-b;
    }
    }
    public static int suma(int a, int b){
    return a+b;
    }
}

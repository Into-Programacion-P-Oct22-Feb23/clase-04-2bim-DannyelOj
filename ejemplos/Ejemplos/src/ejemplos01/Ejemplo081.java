/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();
        
        if (numero == 1) {
        mensajeSuma = obtenerTablaSumar(10, 9); 
        System.out.printf("%s\n", mensajeSuma);// se invoca al método 
                                                       // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        }else{
            if (numero == 2) {
                mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
                System.out.printf("%s\n", mensajeSumaDos);
                }else{
                System.out.printf("error fuera de rango");}
        
            }


    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Felia
 */
public class ManejoVariablesTest {
        public static void main(String ... args){
            //declaracion de variables boolean
            boolean bool1;
            //inicializacion
            bool1 = true;
            //Declaración
            boolean bool2=false;
            System.out.println("el valor de bool1 es: " + bool1);
            System.out.println("el valor de bool2 es: " + bool2);
            System.out.println("");

            //Variables byte
            byte b1;
            b1= 10;
            //Literal en hexadecimal
            byte b2 = 0xa;
            System.out.println("el valor de b1 es: " + b1);
            System.out.println("el valor de b2 es: " + b2);
            System.out.println("");


            //Variables Short
            short s1= 2;
            System.out.println("el valor de s1 es: " + s1);
            System.out.println("");

            //variable char, declaracion e inicializacion en una sola linea
            //la primera inicializacion es un unicode

            char ch1 =65, ch2= 'A';
            System.out.println("Valor char1: " + ch1 );
            System.out.println("Valor char1: " + ch2);
            System.out.println("");

            //variables enteras
            int decimal =100;
            int octal = 0144; //los valores octales empiezan con 0
            int hexa = 0x64; // los valores hexadecimales empiezan con 0x
            
            while (decimal <103){
                decimal =  ++decimal;
                System.out.println("Valor int decimal:" + decimal);
                System.out.println("Valor int octal:" + octal);
                System.out.println("Valor int hexadecimal:" + hexa);
                System.out.println();
            }

            //variables long
            long long1 = 10, long2 = 20L;
            System.out.println("valor long1 : " + long1);
            System.out.println("Valor  lon2 : " + long2);
            System.out.println();
            
            //variables float 
            float f1= 15, f2 = 22.3F;
            System.out.println("Valor float f1 : " + f1);
            System.out.println("Valor float f2 : " + f2);
            System.out.println();
            
            //variables doubles
            double d1 = 11.0 , d2 = 30.15D;
            System.out.println("Valor double d1 : " + d1);
            System.out.println("Valor double d2 : " + d2);
            System.out.println();
        }
}
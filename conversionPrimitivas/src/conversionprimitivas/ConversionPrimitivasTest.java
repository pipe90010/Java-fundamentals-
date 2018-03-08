/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionprimitivas;

/**
 *
 * @author Felia
 */
public class ConversionPrimitivasTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean bool = true;// no puede ser convertido en ningun tipo desde ni hacia
        
        byte byte1 = 0b0000_0010;
        byte byte2 = 1;
        byte sum = (byte) (byte1 + byte2);
        System.out.println("ste valor de sum: " +  byte1 + " + " + byte2 + " = " + sum);
        
        
        double d = 6.02E23;//64 los numeros floating point son double por defecto 
        float f = 6.02e23f;//32 bits; si se quieres especificar como float se coloca f o F al final
        System.out.println("double: " + d + "\nfloat: " + f);
        
        
        double inf = 1.0/0.0; // infinito
        double neginf = -1.0/0.0; // menos Infinito
        double negzero = -1.0/inf; // cero negativo
        double NaN = 0.0/0.0; // No es un numero para verificarlo se puede usar los metodos
        // Float.isNaN() y Double.isNaN()
        System.out.println(NaN +" "+ negzero + " " + neginf + " " + inf);
        
        //cuando son irracionales los float solo tienen en cuenta los 6 primeros decimales
        //cuando son irracionales los double solo tienen en cuenta los 15 primeros decimales
        
        //Se pueden hacer dos tipos de conversiones
        // widening es cuando se pasa a un valor de un tipo se convierte
        //a un tipo mas aplio osea con un rango mayor  de valores legales
        
       byte b3 = 0x7f;//este es el maximo valor de byte osea 127 decimal y 0b0111_1111
       short s1 = b3;
       char c1 = (char) b3;
       int in1 = b3;
       long l1 = b3;
       float d1 = b3;
       
       System.out.println("");
       System.out.println("b3 : " + b3 + "\ns1: " + s1 +"\nc1: " + c1+ "\nin1: " 
       + in1 + "\nl1: " + l1 + "\nd1: " + d1);
       System.out.println("");
        
        /* cast se usa mas comunmente para converitr flotante a entero
        la parte fraccional se pierde
        sin embargo los metodos Math.round(), Math.floor(), y  Math.ceil()
        cumplen otro tipo de rounding
        */
        int i = 13;
        byte byte3 = (byte) i; // Force the int to be converted to a byte
        i = (int) 13.456; // Force this double literal to the int 13
        System.out.println( "valor de i: " +  i +" y  valor de byte3: " + byte3);
        
        short s = (short) 0xffff; // These bits represent the number -1
        char c = '\uffff'; // The same bits, as a Unicode character
        int i1 = s; // Converting the short to an int yields -1
        int i2 = c; // Converting the char to an int yields 65535
        System.out.println("el valor del short s: " + s);
        System.out.println("el valor del char c: " + c);
        System.out.println("el valor del entero i1: " + i1);
        System.out.println("el valor del entero i2: " + i2);

    }    
}

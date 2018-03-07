/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploenumeraciones;

/**
 *
 * @author Felia
 */
public class EjemploEnumeraciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Valores de la enumeracion
       System.out.println("Valor 1:" + Dias.LUNES);
       
       //Hacemos un test del día utilizando
       indicarDia(Dias.VIERNES);
       
       //utilizacmos la enumeracion de los paises
       System.out.println("continente numero 4:" + Continentes.AMERICA );
       System.out.println("paises en america:" + 
Continentes.AMERICA.getPaises());
       
       //Utilizamos la enumeracion de los paises
       System.out.println("");
       indicarPaises(Continentes.AFRICA);
       
       //imprimimos los continentes
       System.out.println("");
       imprimirContinentes();      
    }
    public static void indicarDia(Dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("tercer dia de la semana");
            case JUEVES:
                System.out.println("cuarto dia de la semana");
            case VIERNES:
                System.out.println("Quinto dia de la semana");
            case SABADO:
                System.out.println("Sexto dia de la semana");
            case DOMINGO:
                System.out.println("Septimo y ultimo dia de la semana");
            default:
                System.out.println("Ese no es un dia");
        }
    }
    public static void indicarPaises(Continentes continentes){
        switch (continentes) {
            case AFRICA:
                System.out.println("numero de paises en " + continentes + ":"+
                        continentes.getPaises());
                break;
            default:
                System.out.println("Y asi seguimos con los demÃ¡s contienentes");
        }       
    }
    public static void imprimirContinentes(){
        //utilizacmos un foreach
        for(Continentes c: Continentes.values()){
            System.out.println("Continente: " + c + " contiene " + c.getPaises()+ "paises");
        }
    }
    
}


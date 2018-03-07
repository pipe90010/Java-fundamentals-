/*
 derechos reservados global mentoring.com.mx
 */
package ejemplojavadoc;
import com.gm.javadoc.Aritmetica;
/**
 *
 * @author Felia
 */
public class EjemploJavaDoc {

    /**
     * Metodo que ejecuta  la prueba de la clase Aritmetica
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado = new  Aritmetica(3,2).sumar();
        System.out.println("Resultado:" + resultado);
        
    }
    
}

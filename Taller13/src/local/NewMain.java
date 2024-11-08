
package local;

/**
 *
 * @author Daniel
 */
public class NewMain {

    public static void main(String[] args) {
        
        //Ejercicio 1
        Ej1_Circulo circulo = new Ej1_Circulo(3.5);
        circulo.calcularArea();
        circulo.mostrarArea();
        
        Ej1_Rectangulo rectangulo = new Ej1_Rectangulo(3, 5);
        rectangulo.calcularArea();
        rectangulo.mostrarArea();
        
        //Ejercicio 2
        Ej2_Pato pato = new Ej2_Pato("Donald");
        pato.nadar();
        pato.volar();
    }
    
}

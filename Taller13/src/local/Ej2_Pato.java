
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Pato implements Ej2_Nadador, Ej2_Volador{
    private String nombre;

    public Ej2_Pato(String nombre) {
        this.nombre = nombre;
    }
    
    @Override public void nadar() {
        System.out.println("el pato " + nombre + " esta nadando");
    }

    @Override public void volar() {
        System.out.println("el pato " + nombre + " esta volando");
    }
    
}

package boletin30;

/**
 *
 * @author epastorizalorenzo
 */

public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
        System.out.println("Se seleccion un jugador");
    }
    
    public void concentrarse() {
        System.out.println("se concentra el seleccionador");
    }

    
    public void viajar() {
        System.out.println("Viaja el seleccionador");
    }

    
    public void entrenar() {
        System.out.println("Entrena el seleccionador");
    }

    
    public void jugarPartido() {
        System.out.println("El seleccionador juega un partido");
    }

    
    public String toString() {
        return "Seleccionador{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

}



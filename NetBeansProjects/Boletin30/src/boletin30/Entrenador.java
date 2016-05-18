package boletin30;

/**
 *
 * @author epastorizalorenzo
 */
public class Entrenador extends SeleccionFutbol {

    private int idFede;

    public Entrenador() {
    }

    public Entrenador(int idFede, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFede = idFede;
    }

    public int getIdFede() {
        return idFede;
    }

    public void setIdFede(int idFede) {
        this.idFede = idFede;
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificando entrenamiento");
    }

    public void concentrarse() {
        System.out.println("Se concentra el Entrenador");
    }

    public void viajar() {
        System.out.println("Viaja el entrenador");
    }

    public void entrenar() {
        System.out.println("Entrena el entrenador");
    }
    public void jugarPartido() {
        System.out.println("El entrenador juega un partido");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "idFede=" + idFede + '}';
    }

}

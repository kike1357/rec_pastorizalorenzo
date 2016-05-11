package exemplopolimorfismo;

/**
 *
 * @author epastorizalorenzo
 */
public interface Ianimal {
    public abstract void falar();
    //metodo default
    default public void moverse(){
        System.out.println("movese o animal");
    }
}


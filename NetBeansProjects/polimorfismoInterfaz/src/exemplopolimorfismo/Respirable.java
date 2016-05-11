package exemplopolimorfismo;

/**
 *
 * @author epastorizalorenzo
 */
    public interface Respirable {
    default public void respirar(){
        System.out.println("respiran dende a interfaz");
    }
    
}


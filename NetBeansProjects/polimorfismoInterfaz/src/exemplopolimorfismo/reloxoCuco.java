package exemplopolimorfismo;

/**
 *
 * @author epastorizalorenzo
 */
public class reloxoCuco extends reloxo{

    public reloxoCuco(String marca) {
        super(marca);
        
    }
    public reloxoCuco(){
        
    }
    
    @Override
    public void falar() {
        System.out.print("cucu cucu");
    }

}

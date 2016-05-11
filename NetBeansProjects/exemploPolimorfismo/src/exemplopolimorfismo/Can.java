package exemplopolimorfismo;

/**
 *
 * @author epastorizalorenzo
 */
public class Can extends Animal {
    
    String raza;
    
public Can(String nome, String raza){ 
    super(nome);
    this.raza=raza;  
    
}

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Can{" +"nome ="+getNome() +"raza=" + raza + '}';
    }
    

    @Override
    public void falar() {
        System.out.print("guau,guau,guau,guau,guaaauuuuuu");
    }
    
    public void andar(){
        System.out.println("anda o can");
    }
    } 


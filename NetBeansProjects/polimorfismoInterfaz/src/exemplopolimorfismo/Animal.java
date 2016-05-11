package exemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author epastorizalorenzo
 */
public abstract class Animal implements Ianimal {
        
private String nome;

public Animal(String nome){
       this.nome= nome;
}

public String getNome() {
        return nome;
    }

public abstract void falar();  
 
}
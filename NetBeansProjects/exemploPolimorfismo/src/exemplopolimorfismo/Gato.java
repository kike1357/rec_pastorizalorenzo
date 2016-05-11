package exemplopolimorfismo;

/**
 *
 * @author epastorizalorenzo
 */
public class Gato extends Animal {
  
    String cor;
    
public Gato(String nome, String cor){
    super(nome);
    this.cor=cor;
}

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" + "nome= "+getNome() + "cor=" + cor + '}';
    }


    @Override
    public void falar() {
        System.out.print("miau,miau,miau,miau,miau,miaaaaauuuuu");
    }
}
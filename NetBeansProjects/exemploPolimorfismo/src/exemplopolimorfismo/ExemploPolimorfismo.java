package exemplopolimorfismo;

import java.util.ArrayList;

/**
 *
 * @author epastorizalorenzo
 */
public class ExemploPolimorfismo {

    
    public static void main(String[] args) {
        
        ArrayList<Animal>listaAnimais=new ArrayList();
        Animal can = new Can("Brisa","palleiro");
        Animal gato = new Gato("Minino","branco");
        listaAnimais.add(can);
        listaAnimais.add(gato);
        for(Animal ani:listaAnimais)
            System.out.println(ani.toString());
        for(Animal ani:listaAnimais){
            ani.falar();
            if(ani instanceof Can)
            ((Can)ani).andar();
    }
    }
    //metodo con parametro xeralista
    public static void falarPolimorfico(Animal a){
        a.falar();
}
}
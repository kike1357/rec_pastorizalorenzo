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
            ani.moverse();
            if(ani instanceof Can)
            ((Can)ani).andar();
    }
        for(Animal ani:listaAnimais)
            falarPolimorfico(ani);
        reloxoCuco cuco = new reloxoCuco();
        Ianimal cuc = new reloxoCuco();
        falarPolimorfico(cuc);
        Ianimal canciño = new Can("tobi","pastor");
            System.out.println("************");
            falarPolimorfico(canciño);
            Cabalo cabalo = new Cabalo();
            cabalo.falar();
            cabalo.moverse();
            cabalo.respirar();
            
         //creamos arrayList de tipo Ianimal
            ArrayList<Ianimal>listaInterfaz= new ArrayList();
            listaInterfaz.add(can);
            listaInterfaz.add(gato);
            listaInterfaz.add(cuc);
      
            
    }
    //metodo con parametro xeralista
    public static void falarPolimorfico(Ianimal a){
        a.falar();
}
}
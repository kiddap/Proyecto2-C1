
package crudFrames.clases;

import java.util.HashSet;

/**
 *
 * @author Danix
 */
public class Categorias {
       protected int codigo;
    protected String name;
    protected HashSet<Categorias> catH=new HashSet<>();
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Categorias(int codigo, String name) {
        this.codigo = codigo;
        this.name = name;
      
    }

 

    @Override
    public String toString() {
        return "Categorias{" + "codigo=" + codigo + ", name=" + name + '}';
    }
    public void addCat(Categorias cat){
        if (catH.contains(cat)) {
            System.out.println("ya existe este elemento ");
         
        }else{
           catH.add(cat);
    }
    }
    public void deleteCat(Categorias cat){
        catH.remove(cat);
    }
    public void seeCat(){
        for(Categorias cc:catH){
            System.out.println(cc);
        }
    }
    public void updateCat(Categorias cat, Categorias catnueva){
        if (catH.contains(cat)) {
            catH.remove(cat);
            catH.add(cat);
        }
    }
    
}

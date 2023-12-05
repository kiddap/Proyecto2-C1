/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudFrames.clases;

import java.util.HashMap;

/**
 *
 * @author USUARIO
 */
public class Peliculas {
     protected int codigo;
    protected String name;
    protected String Categoria; 
    protected HashMap<Integer, Peliculas> hasPeli= new HashMap<>();
    
    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    public void addPeliH(Peliculas peli){
        if (hasPeli.containsKey(peli)) {
            System.out.println("ya se encuentra en uso ");
        }else{
        hasPeli.put(codigo, peli);
    }
    }
    
    public void deletePeli(Peliculas peli){
        hasPeli.remove(peli);
    }
}

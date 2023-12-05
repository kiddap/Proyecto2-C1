/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudFrames.clases;

import java.util.ArrayList;

/**
 *
 * @author Danix
 */
public class Prestamo {
   
    protected int numero;
    protected boolean estado;
    protected String fecha;
    protected Clientes cliente;
    protected Peliculas peliculas;
    protected ArrayList<Prestamo> presA=new ArrayList<>();
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Peliculas getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Peliculas peliculas) {
        this.peliculas = peliculas;
    }

    public Prestamo(int numero, boolean estado, String fecha, Clientes cliente, Peliculas peliculas) {
        this.numero = numero;
        this.estado = estado;
        this.fecha = fecha;
        this.cliente = cliente;
        this.peliculas = peliculas;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numero=" + numero + ", estado=" + estado + ", fecha=" + fecha + ", cliente=" + cliente + ", peliculas=" + peliculas + '}';
    }
    public void addPrestamo(Prestamo presta){
        presA.add(numero, presta);
    }
    public void seePresta(){
        for(Prestamo pp:presA){
            System.out.println(pp);
        }
    }
    public void deletePresta(Prestamo presta){
        presA.remove(numero);
    }
    public void updateP(Prestamo presta,Prestamo nuevoPres){
        if (presA.contains(presta)) {
            presA.remove(presta);
            presA.add(numero, nuevoPres);
        }
    }
}



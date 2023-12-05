
package crudFrames.clases;

import java.util.ArrayList;

/**
 *
 * @author Danix
 */
public class Clientes {
     protected int cedula;
    protected int telefono;
    protected String name;
    protected String fNacimiento;
    protected String correo;
    protected String direccion;
   protected ArrayList<Clientes> Clist; 
   
   
   
   public void addCliente(Clientes cli){
       if (Clist.contains(cli)) {
           System.out.println("ya existe ");
       }else{
           
      Clist.add(cedula, cli);
   }
       
   }
   
   public void deleteCliente(Clientes cli){
       Clist.remove(cedula);
   }
   public void readCliente(){
       for(Clientes c :Clist){
           System.out.println(Clist);
       }
       
   }
    public void updateCliente(Clientes cli, Clientes nuevoCliente) {
        if (Clist.contains(cli)) {
            Clist.remove(cli);
            Clist.add(nuevoCliente);
        }  
        
    }
    
    
    
    public int getCodigo() {
        return cedula;
    }

    public void setCodigo(int codigo) {
        this.cedula = codigo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Clientes(int cedula, int telefono, String name, String fNacimiento, String correo, String direccion) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.name = name;
        this.fNacimiento = fNacimiento;
        this.correo = correo;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + cedula + ", telefono=" + telefono + ", name=" + name + ", fNacimiento=" + fNacimiento + ", correo=" + correo + ", direccion=" + direccion + '}';
    }
    
}

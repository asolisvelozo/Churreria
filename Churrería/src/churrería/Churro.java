package churrería;

import java.util.Scanner;

public class Churro extends Producto {
    
    private int tipoChurro;
    private int precioDelBanio;
    
      public Churro(int tipoChurro, int codigo, double precio, int cantidad, int precioDelBanio) {
        super(codigo, precio, cantidad);
        this.tipoChurro = tipoChurro;
        this.precioDelBanio=10;
    }
      
      

    public int getTipoChurro() {
        return tipoChurro;
    }

    public void setTipoChurro(int tipoChurro) {
        this.tipoChurro = tipoChurro;
    }
     public int getPrecioDelBanio() {
        return precioDelBanio;
    }

    public void setPrecioDelBanio(int precioDelBanio) {
        this.precioDelBanio = precioDelBanio;
    }
    
    public String getStringInsert(){
    
        String instruccion= "insert into producto(codigo, precio, cantidad, tipochurro, precioBanio) values(" + getCodigo() + ", '" + getPrecio() + "',"+getCantidad()+", '"+getTipoChurro()+"' ,"+getPrecioDelBanio()+")";
    
    return instruccion;
    }

  public double calcularPrecio(){
      
      
      System.out.println("Este es el valor por el momento\n"+(this.getPrecio()+this.precioDelBanio)*this.cantidad);
  
      return (this.getPrecio()+this.precioDelBanio)*this.cantidad;
  }
        

 
   
}
    
    
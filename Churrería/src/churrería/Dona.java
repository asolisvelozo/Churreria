package churrería;

import java.util.Scanner;

public class Dona extends Producto {
    
    private int tipoDona;
    private int precioRelleno;
    
      public Dona(int tipoDona, int codigo, double precio, int cantidad, int precioRelleno) {
        super(codigo, precio, cantidad);
        this.tipoDona = tipoDona;
        this.precioRelleno=10;
    }

    

    public int getTipoDona() {
        return tipoDona;
    }

    public void setTipoDona(int tipoDona) {
        this.tipoDona = tipoDona;
    }
     public int getprecioRelleno() {
        return precioRelleno;
    }

    public void setprecioRelleno(int precioRelleno) {
        this.precioRelleno = precioRelleno;
        
    }
    
    public String getStringInsert(){
    
        String instruccion = "insert into producto(codigo, precio, cantidad, tipoDona, preciorelleno) values(" + getCodigo() + ", '" + getPrecio() + "',"+getCantidad()+", '"+getTipoDona()+"' ,"+getprecioRelleno()+")";
    
    return instruccion;
    }

   
  public double calcularPrecio(){
      
        System.out.println("Este es el valor por el momento\n"+(this.getPrecio()+this.precioRelleno)*this.cantidad);

  
        return (this.getPrecio()+this.precioRelleno)*this.cantidad;
      
  }
        
        
 
   
}
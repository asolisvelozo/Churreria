package churrería;

import java.util.ArrayList;

public abstract class Producto {
   
    
    private int codigo;
    
    double precio;
    
    int cantidad;
    
    int tipo;

    public Producto(int codigo, double precio, int cantidad) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = cantidad;
    }
    

  public abstract double calcularPrecio();

    public int getCodigo() {
        return codigo;
    }
    
    public abstract String getStringInsert();
    
    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


    

    
    
}



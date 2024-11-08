package churrería;

import java.util.ArrayList;

public class Ventas {
    
private ArrayList<Producto> Ventas ;

private AccesoADatos a = new AccesoADatos();

public Ventas(){
    
  Ventas = new ArrayList();
  
    
} 
public void agregarVentas(Producto producto){
    

    Ventas.add(producto);
    a.insertar(producto);
    
 }

public void mostrarVentas(){
    for(Producto producto:Ventas){
        
        System.out.println("\nEste es el código:"+producto.getCodigo()+
                "\n Este es la cantidad:"+producto.getCantidad()+
                "\n Este es el precio:"+producto.getPrecio()*+producto.getCantidad()+
                "\n Este es el tipo:"+producto.getTipo());
    }
    
    
}

}
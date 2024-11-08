package churrería;

import java.util.Scanner;


public class Delivery extends Empleado {
    
    public int cantpedidos;
    
    public Delivery(String t, int c, String tel, String p, double s, double sh) {
        
        
        super(t, c, tel, p, s, sh);
        
        
    }
    
        public double calcularSueldo(){
        
        Scanner teclado=new Scanner(System.in);

        sueldoporh=0;
        
        sueldo=0;
        
        cantpedidos=0;
        
        System.out.println("Ingrese su sueldo por envío");
        
        sueldoporh=teclado.nextDouble();
        
        System.out.println("Ingrese su cantidad de pedidos realizados");
        
        cantpedidos=teclado.nextInt();
        
        sueldo = sueldoporh*cantpedidos; 
        
        System.out.println("Este es su sueldo\n"+sueldo);
        
        return sueldo;
    }
    
    
}

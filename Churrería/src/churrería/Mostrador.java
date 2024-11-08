package churrería;

import java.util.Scanner;


public class Mostrador extends Empleado {
    
    public int horasT;
    
    public Mostrador(String t, int c, String tel, String p, double s, double sh) {
        super(t, c, tel, p, s, sh);
    }
    
    public double calcularSueldo(){
       
        Scanner teclado=new Scanner(System.in);

        sueldoporh=0;
        
        sueldo=0;
        
        horasT=0;
        
        System.out.println("Ingrese su sueldo por hora");
        
        sueldoporh=teclado.nextDouble();
        
        System.out.println("Ingrese sus horas de trabajo");
        
        horasT=teclado.nextInt();
        

        sueldo = sueldoporh*horasT; 
        
        System.out.println("Este es su sueldo:\n " +sueldo);
        
        return sueldo;
       
    }
    
}

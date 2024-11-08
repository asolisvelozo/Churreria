package churrería;


public class Empleado {
    
    public String tipo;
    
    public int codigo;
    
    public String telefono;
    
    public String puesto;
    
    public double sueldo;
    
    public double sueldoporh;
  
    public Empleado(String t, int c, String tel, String p, double s, double sh){
     
        this.tipo=t;
        this.codigo=c;
        this.telefono=tel;
        this.puesto=p;
        this.sueldo=s;
        this.sueldoporh=sh;
        
    }

    
}

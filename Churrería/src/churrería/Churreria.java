 package churrería;

import java.util.Scanner;


public class Churreria {
  
    
public static void main(String[] args) {
    
    int n;
    
    int nro;
    
    Scanner teclado = new Scanner (System.in);    

    String termino="no";
    
     int c=0;
    
     int prB=0;
     
     int codigod=0;
     
     int prRelleno=0;
     
     int t=0; 
    
    double p=0; 
    
    int cant = 0;
         
    int cant2=0;
    
    Ventas venta= new Ventas();
    
    while(termino.equals("no")){
        
    System.out.println(" Ingrese 1 si desea un churro\n ingrese 2 si desea una dona\n ingrese 3 si desea consultar su sueldo y es del mostrador\n ingrese 4 si desea consultar su sueldo y es de la cocina\n ingrese 5 si desea consultar su sueldo y es de delivery\n Ingrese 6 si desea ver su factura");
    
    n= teclado.nextInt();
    
     
         


        switch(n){

            case 1: 
                
                System.out.println("ingrese el codigo del producto\n");

                c= teclado.nextInt();

                prB=0;
                
                System.out.println("Ingrese el precio del churro");
                
                p= teclado.nextInt();

                System.out.println("Ingrese la cantidad de churros");
                
                
                cant= teclado.nextInt();

                Churro churro= new Churro(t,c,p,cant,prB);
                
                churro.calcularPrecio();
                venta.agregarVentas(churro);
                
         
                break;

            case 2:
                
                System.out.println("ingrese el codigo del producto\n");
                
                codigod= teclado.nextInt();
      
                prRelleno=0;
                
                System.out.println("Ingrese el precio de la dona");
                
                p= teclado.nextInt();
                
                System.out.println("Ingrese la cantidad de donas");
                
                cant2=teclado.nextInt();
                

                Dona dona= new Dona(t, codigod, p, cant2, prRelleno);

                
                dona.calcularPrecio();
                
                venta.agregarVentas(dona);
                                
                break;
               

            case 3:
                String tm = null;
                int cm = 0;
                String tel = null;
                String pm = null;
                double sm = 0;
                double sh = 0;

                Mostrador mostra= new Mostrador(tm,cm,tel,pm,sm,sh);

                mostra.calcularSueldo();

                break;

            case 4: 
                int ht=0;
                String tc = null;
                int cc = 0;
                String telc = null;
                String pc = null;
                double sc = 0;
                double shc = 0;

                Cocina coci= new Cocina(ht,tc,cc,telc,pc,sc,shc);

                coci.calcularSueldo();

                break;

            case 5:
               String tde = null; 
               int cde = 0;
               String telde = null;
               String pde = null;
               double sde = 0;
               double shde = 0;
               Delivery deli= new Delivery(tde,cde,telde,pde,sde,shde);

                deli.calcularSueldo();

                break;
             
            case 6:
                 
                 venta.mostrarVentas();
                 
                 break;
           
        }
        System.out.println("Termino su compra: ");
        termino=teclado.next();
        
      

        
    }
    
    }
   
}




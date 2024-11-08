package churrería;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoADatos {
   
    private Connection miConexion;
    private Statement comandos;
    private ResultSet tabla;
    
    public AccesoADatos(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost/churreria", "root", "");
            comandos=miConexion.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoADatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoADatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void insertar(Producto p) {
        try {
            comandos.execute(p.getStringInsert());
        } catch (SQLException ex) {
            Logger.getLogger(AccesoADatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public ArrayList<Producto> dameListaVentas(){
        
         ArrayList<Producto> listAux= new ArrayList();
            
            String sql="select * from producto";
        try {
            tabla=comandos.executeQuery(sql);
            while(tabla.next()){
                int codigo=tabla.getInt("codigo");
                double precio=tabla.getDouble("precio");
                int cantidad=tabla.getInt("cantidad");
                if((tabla.getString("tipoChurro")==null)){
                    String tipoDona=tabla.getString("tipoDona");
                    int precioRelleno=tabla.getInt("precioRelleno");
                    Dona unaDona=new Dona(2,codigo,precio,cantidad,precioRelleno);
                    listAux.add(unaDona);
                }else{
                    String tipochurro=tabla.getString("tipoChurro");
                    int precioBanio=tabla.getByte("precioBanio");
                    Churro unChurro=new Churro(2,codigo,precio,cantidad,precioBanio);
                    listAux.add(unChurro);                 
                  
                }
               
            } 
        } catch (SQLException ex) {
            Logger.getLogger(AccesoADatos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return listAux;
       
    }
   
    
   
}


    
    
    
  
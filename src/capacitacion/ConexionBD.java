/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitacion;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author AULAFISI
 */
public class ConexionBD {
    private String url="jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";
    private String user="root";
    private String password="root";
    Connection c;
    public void conectar(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
             c=DriverManager.getConnection(url, user, password);
            System.out.println("EXITO");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("F");
        }
    }
    
    public void cerrarConexion(){
        try{
            c.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    

    
}

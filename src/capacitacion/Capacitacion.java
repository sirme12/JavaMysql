/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitacion;

/**
 *
 * @author AULAFISI
 */
public class Capacitacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD con=new ConexionBD();
        RepositorioPais pr=new RepositorioPais();
        System.out.println(pr.mostrarTodo());
        //con.conectar();
    }
    
}

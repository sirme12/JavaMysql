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
public class Pais {
    private int id;
    private String nombre;
    private String codigoPostal;

    public Pais(int id, String nombre, String codigoPostal) {
        this.id = id;
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", codigoPostal=" + codigoPostal + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Adapter;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Adaptador {
    private Nombre objetoNombre;
    private String nombre;
    private String apellido;

    public Adaptador(Nombre n) {
        this.objetoNombre = n;
        setNombre(objetoNombre.getNombreCompuesto().split(" ")[0]);
        setApellido(objetoNombre.getNombreCompuesto().split(" ")[1]);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}

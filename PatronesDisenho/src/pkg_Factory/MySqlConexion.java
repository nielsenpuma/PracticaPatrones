/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Factory;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class MySqlConexion extends Conexion{

    //Constructor vacío
    public MySqlConexion() {
    }
     
    //Se sobreescribe el método descripción
    @Override
    public String descripcion(){
        return "Conexión MySql";
    }
}

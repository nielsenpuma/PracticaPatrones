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
public class OracleConexion extends Conexion{
    //Constructor vacío
    public OracleConexion(){
        
    }
    
    //Se sobrescribe el método desripción
    @Override
    public String descripcion(){
        return "Conexión Oracle";
    }
}

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
public class Fabrica {

    //Nombre del tipo de conexión
    protected String tipo;
    
    /*Constructor que recibe el
    el nombre del tipo de conexión
    */
    public Fabrica(String t) {
        tipo = t;
    }
    
    /*Método que retorna el objeto
    conexion específico
    */
    public Conexion creaConexion(){
        if(tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();
        }else if(tipo.equalsIgnoreCase("SQLServer")){
            return new SqlServerConexion();
        }else if(tipo.equalsIgnoreCase("MySql")){
            return new MySqlConexion();
        }else{
            return new PostgresqlConexion();
        }
    }
    
}

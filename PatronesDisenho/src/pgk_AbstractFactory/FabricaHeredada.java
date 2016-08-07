/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_AbstractFactory;

import pkg_Factory.Conexion;
import pkg_Factory.MySqlConexion;
import pkg_Factory.OracleConexion;
import pkg_Factory.PostgresqlConexion;
import pkg_Factory.SqlServerConexion;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class FabricaHeredada extends FabricaAbstracta{

    //Se implementa el método en esta Fábrica específica.
    @Override
    protected Conexion creaConexion(String tipo) {
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_AbstractFactory;

import pkg_Factory.Conexion;

/**
 *
 * @author nielsenpumajihuallanca
 */
public abstract class FabricaAbstracta {

    //Constructor vacío
    public FabricaAbstracta() {
    }
    
    /*Método que será implementado por
    cada clase hija, y que será específico
    */
    protected abstract Conexion creaConexion(String tipo);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Builder;

import java.util.List;

/**
 *
 * @author nielsenpumajihuallanca
 */
public interface Robot {
    //Método que pone a trabajar al robot
    public void trabajar();
    /*
    Método que cargará las acciones
    solicitadas por el builder
    en tiempo de ejecución
    */
    public void cargarAcciones(List<Integer> accion);
}

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
public class RobotHamburguesa implements Robot{

    //Lista de acciones a realizar
    List<Integer> acciones;
    
    //Constructor vacío
    public RobotHamburguesa() {
        
    }
    
    //Inicia el proceso
    private void iniciar(){
        System.out.println("Iniciando la Hamburguesa");
    }
    
    //Busca los ingredientes
    private void getIngredientes(){
        System.out.println("Buscando: Pan, Hamburguesa, Salsa");
    }
    
    //Arma la Hamburguesa
    private void armar(){
        System.out.println("Armando la Hamburguesa");
    }
    
    //Revisa el proceso
    private void revisar(){
       System.out.println("Revisando el proceso");
    }
    
    //Termina el proceso
    private void terminar(){
        System.out.println("Proceso terminado");
    }
    
    /*
    Método sobrescrito encargado de cargar
    las acciones solicitadas por el builder
    en tiempo de ejecución.
    */

    @Override
    public void trabajar() {
        iniciar();
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getIngredientes();
                    break;
                case 2:
                    armar();
                    break;
                case 3:
                    revisar();
                    break;
                default:
                    System.out.println("Esa acción no la puedo hacer");
            }
        }//Fin For
        terminar();
    }

    @Override
    public void cargarAcciones(List<Integer> accion) {
        this.acciones = accion;
    }
    
}

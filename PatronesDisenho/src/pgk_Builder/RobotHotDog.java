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
public class RobotHotDog implements Robot{

    //Lista de acciones a realizar
    List<Integer> acciones;
    
    //Constructor vacío
    
    public RobotHotDog() {
    }
    
    //Inicia el proceso
    private void start(){
        System.out.println("Iniciando el HotDog");
    }
    
    //Busca los ingredientes
    private void getParts(){
        System.out.println("Buscando: Pan, Salchicha, Salsas");
    }
    
    //Arma el HotDog
    private void build(){
        System.out.println("Armando el HotDog");
    }
    
    //Revisa el proceso
    private void check(){
        System.out.println("Revisando el proceso");
    }
    
    //Termina el proceso
    private void finish(){
        System.out.println("Proceso terminado");
    }

    @Override
    public void trabajar() {
        start();
        for(Integer i:acciones){
            switch(i){
                case 1:
                    getParts();
                    break;
                case 2:
                    build();
                    break;
                case 3:
                    check();
                    break;
                    default:
                        System.out.println("Esa acción no la puedo hacer");
            }
        }//fin for
        finish();
    }

    @Override
    public void cargarAcciones(List<Integer> accion) {
        this.acciones = accion;
    }
    
}

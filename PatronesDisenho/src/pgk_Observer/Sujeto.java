/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Observer;

import java.util.ArrayList;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Sujeto {
    private ArrayList<Observador> observadores;
    private String accion;
    private String lugar;

    public Sujeto() {
        observadores = new ArrayList<Observador>();
    }
    
    public void registrarObs(Observador o){
        observadores.add(o);
    }
    
    public void retirarObs(Observador o){
        observadores.remove(o);
    }
    
    public void ejecutarAccion(String a, String l){
        this.accion = a;
        this.lugar = l;
        notificar();
    }
    
    public void notificar(){
        for(Observador o: observadores){
            o.actualizar(this.accion, this.lugar);
        }
    }
}

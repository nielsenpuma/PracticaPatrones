/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Strategy;

/**
 *
 * @author nielsenpumajihuallanca
 */
public abstract class Avion {
    private Algoritmo miAlgoritmo;
    
    public void setAlgortimo(Algoritmo a){
        this.miAlgoritmo = a;
    }
    
    public void mover(){
        this.miAlgoritmo.moverse();
    }
}

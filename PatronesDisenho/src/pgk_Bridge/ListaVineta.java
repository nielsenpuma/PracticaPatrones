/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Bridge;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class ListaVineta extends ListasBase{
    
    private char tipoVineta;
    
    public void setTipoItem(char nuevoTipo){
        if(nuevoTipo > ' '){
            tipoVineta = nuevoTipo;
        }else{
            tipoVineta = '+';
        }
    }
    
    public String obtenerItem(int index){
        return tipoVineta + " " + super.obtenerItem(index);
    }
}

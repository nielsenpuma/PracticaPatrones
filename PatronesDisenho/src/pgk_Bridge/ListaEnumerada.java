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
public class ListaEnumerada extends ListasBase{
    @Override
    public String obtenerItem(int index){
        return (index + 1) + ". " + super.obtenerItem(index);
    }
}

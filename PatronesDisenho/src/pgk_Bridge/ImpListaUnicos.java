/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Bridge;

import java.util.ArrayList;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class ImpListaUnicos implements I_ImplLista{
    private ArrayList<String> listaItems = new ArrayList<String>();

    @Override
    public void addItem(String item) {
        if(!listaItems.contains(item)){
            listaItems.add(item);
        }
    }

    @Override
    public void remItem(String item) {
        if(listaItems.contains(item)){
            listaItems.remove(listaItems.indexOf(item));
        }
    }

    @Override
    public int getCantidadDeItems() {
        return listaItems.size();
    }

    @Override
    public String getItem(int index) {
        if(index < listaItems.size()){
            return (String) listaItems.get(index);
        }
        return null;
    }

    @Override
    public boolean soportaRepetidos() {
        return false;
    }
}

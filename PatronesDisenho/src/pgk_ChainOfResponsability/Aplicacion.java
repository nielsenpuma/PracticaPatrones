/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_ChainOfResponsability;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Aplicacion implements InterfaceAyuda{

    private final int TIPO_AYUDA = 3;

    public Aplicacion() {
    }
    
    @Override
    public void getAyuda(int tipoAyuda) {
        System.out.println("\t-- Ayuda BASE DE LA APLICACIÓN.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Observer;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Correo implements Observador{

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Enviando correo, Acción; "+accion+", Lugar: "+lugar);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_State;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Mantenimiento implements Estado{

    @Override
    public void ejecutarAccion() {
        System.out.println("Estado en mantenimiento: No atento");
        System.out.println("Enviar correo para informar el estado");
    }
    
}

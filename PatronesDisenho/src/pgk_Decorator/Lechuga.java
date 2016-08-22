/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Decorator;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Lechuga extends DecoradorHamburguesa{
    private Hamburguesa hamburguesa;

    public Lechuga(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + lechuga";
    }
    
    
}

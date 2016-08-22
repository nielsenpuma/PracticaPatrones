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
public class Queso extends DecoradorHamburguesa{
    private Hamburguesa hamburguesa;

    public Queso(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" + Queso";
    }
    
}

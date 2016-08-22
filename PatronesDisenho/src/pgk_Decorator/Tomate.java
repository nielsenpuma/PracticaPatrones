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
public class Tomate extends DecoradorHamburguesa{
    private Hamburguesa hamburguesa;

    public Tomate(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    @Override
    public String getDescripcion() {
        return hamburguesa.getDescripcion()+" +  Tomate";
    }
    
    
}

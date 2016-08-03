/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_JuegoMarcianosSingleton;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Computadora {
    private Marcianos marcianos = Marcianos.getMarcianos();

    public Computadora() {
    }
    
    public void crearMarcianos(){
        marcianos.crearMarcianos();
    }
    
}

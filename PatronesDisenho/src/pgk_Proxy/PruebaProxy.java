/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Proxy;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PruebaProxy {
    PersonaProxy persona;

    public PruebaProxy() {
        persona = new PersonaProxy();
        persona.saludar();
        persona.decirEstado();
        persona.despedirse();
    }
    
    public static void main(String[] args) {
        PruebaProxy pp = new PruebaProxy();
    }
}

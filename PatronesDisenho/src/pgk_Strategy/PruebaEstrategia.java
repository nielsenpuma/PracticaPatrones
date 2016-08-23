/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Strategy;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PruebaEstrategia {
    public static void main(String[] args) {
        AvionComercial avionComercial = new AvionComercial();
        AvionRapido avionRapido = new AvionRapido();
        
        System.out.println("Primero el avión comercial...");
        avionComercial.setAlgortimo(new EnTierra());
        avionComercial.mover();
        avionComercial.setAlgortimo(new EnAire());
        avionComercial.mover();
        System.out.println();
        
        System.out.println("Ahora el avión rápido...");
        avionRapido.setAlgortimo(new EnTierra());
        avionRapido.mover();
        avionRapido.setAlgortimo(new EnAireVeloz());
        avionRapido.mover();
        System.out.println();
        
        System.out.println("El avión comercial veloz...");
        avionComercial.setAlgortimo(new EnAireVeloz());
        avionComercial.mover();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Prototipo;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();
        
        circulo.setNombre("Mi Círculo");
        circulo.mover(12, 34);
        
        cuadrado.setNombre("Mi Cuadrado");
        cuadrado.mover(200, 200);
        
        System.out.println("Estas son las figuras originales:");
        System.out.println("Círculo: "+circulo.getNombre());
        System.out.println("Cuadrado: "+cuadrado.getNombre());
        System.out.println("Estas son las posiciones originales:");
        circulo.getPosicion();
        cuadrado.getPosicion();
    }
}

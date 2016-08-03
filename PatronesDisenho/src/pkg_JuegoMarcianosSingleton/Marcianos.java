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
public final class Marcianos {
    private static final Marcianos marcianos = new Marcianos();
    private static int cantidad;

    private Marcianos() {
        cantidad = 10;
    }
    
    public static Marcianos getMarcianos(){
        return marcianos;
    }
    
    public static void derribarMarcianos(){
        System.out.println("Soy el bueno, derribe un marciano");
        if(cantidad > 0) cantidad--;
    }
    
    public static void crearMarcianos(){
        System.out.println("Soy el malo, cree un marciano");
        if(cantidad > 0) cantidad++;
    }
    
    public static void cuantosQuedan(){
        if(cantidad > 0){
            System.out.println("Quedan en el juego: " + cantidad + "marcianos");
        }else{
            System.out.println("Felicidades, has ganado!!");
        }
    }
}

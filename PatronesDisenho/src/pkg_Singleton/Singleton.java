/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Singleton;

/**
 *
 * @author nielsenpumajihuallanca
 */
public final class Singleton {
    private static final Singleton singleton = new Singleton();
    private static int cantidad;

    private Singleton() {
        System.out.println("HOla, he sido creado una sola vez!!");
    }
    
    public static Singleton obtenerSingleton(){
        cantidad++;
        return singleton;
    }
    
    public static void vecesLLamado(){
        System.out.println("Se ha llamado el método: " + cantidad + "veces");
    }
    
}

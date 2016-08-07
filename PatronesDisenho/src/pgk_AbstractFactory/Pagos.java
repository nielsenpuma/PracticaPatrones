/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_AbstractFactory;

import java.util.Scanner;
import pkg_Factory.Conexion;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Pagos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FabricaHeredada miFabrica;
        Conexion miConexion;
        
        System.out.print("Digite la BD: ");
        String tipo = sc.nextLine();
        
        miFabrica = new FabricaHeredada();
        miConexion = miFabrica.creaConexion(tipo);
        
        String salida = "Está conectado con: "+
                miConexion.descripcion();
        
        System.out.println(salida);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Adapter;

import java.util.Scanner;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PruebaAdaptador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nombre objetoNombre = new Nombre();
        
        System.out.println();
        System.out.println();
        System.out.print("Digite su nombre y apellidos: ");
        objetoNombre.setNombreCompuesto(sc.nextLine());
        
        Adaptador adaptador = new Adaptador(objetoNombre);
        
        System.out.println();
        System.out.println();
        System.out.println("Tu nombre es: "+adaptador.getNombre());
        System.out.println("Tu apellido es: "+adaptador.getApellido());
    }
}

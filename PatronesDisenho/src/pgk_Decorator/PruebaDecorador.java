/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Decorator;

import java.util.Scanner;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PruebaDecorador {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("******************************");
        System.out.println("Bienvenido a Comidas Rápidas");
        System.out.println("******************************");
        System.out.println();
        
        Hamburguesa hamburguesa = new Hamburguesa();
        
        int opcion = 0;
        
        do {            
            System.out.println("Con su hamburguesa, selcecione su adición:");
            System.out.println("1=Lechuga, 2=Tomate, 3=Queso, 0=Terminar");
            opcion = sc.nextInt();
            switch(opcion){
                case 0:
                break;
                case 1:
                    hamburguesa = new Lechuga(hamburguesa);
                    break;
                case 2:
                    hamburguesa = new Tomate(hamburguesa);
                    break;
                case 3:
                    hamburguesa = new Queso(hamburguesa);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion!=0);
        
        System.out.println();
        System.out.println("Entregando...");
        System.out.println(hamburguesa.getDescripcion());
        System.out.println("Disfrute su pedido!!");
    }
}

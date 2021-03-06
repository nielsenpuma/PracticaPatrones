/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Observer;

import java.util.Scanner;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Prueba {
    Sujeto sujeto;
    Correo correo;
    Auditor auditor;
    Informador informador;
    
    public void ejecutaPrueba(){
        sujeto = new Sujeto();
        correo = new Correo();
        auditor = new Auditor();
        informador = new Informador();
        String accion = "", lugar = "";
        int opAccion, opRegistra;
        Scanner sc = new Scanner(System.in);
        
        do {
            escribeMenu();
            opAccion = sc.nextInt();
            sc = new Scanner(System.in);
            switch(opAccion){
                case 1:
                    System.out.print("Escribe la acción; ");
                    accion = sc.nextLine();
                    System.out.print("Escribe el lugar: ");
                    lugar = sc.nextLine();
                    sujeto.ejecutarAccion(accion, lugar);
                    System.out.println("\n\n");
                    break;
                case 2:
                    escribeSeleccion();
                    agregaObservador(sc.nextInt());
                    break;
                case 3:
                    escribeSeleccion();
                    agregaObservador(sc.nextInt());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción Errada!!");
            }
            
        } while (opAccion!=0);
    }
    
    public void escribeMenu(){
        System.out.println("**************************");
        System.out.println("* ESCOGE UNA OPCIÓN      *");
        System.out.println("* 1. Realizar acción.    *");
        System.out.println("* 2. Agregar observador. *");
        System.out.println("* 3. Retirar observador. *");
        System.out.println("* 0. Salir.              *");
        System.out.println("**************************");
    }
    
    public void escribeSeleccion(){
        System.out.println("***************************");
        System.out.println("* ESCOGE UNA OPCIÓN       *");
        System.out.println("* 1. Enviar Correo.       *");
        System.out.println("* 2. Registrar Auditoria. *");
        System.out.println("* 3. Informar al jefe     *");
        System.out.println("***************************");
    }
    
    public void agregaObservador(int o){
        boolean ok = true;
        switch(o){
            case 1:
                sujeto.registrarObs(correo);
                break;
            case 2:
                sujeto.registrarObs(auditor);
                break;
            case 3:
                sujeto.registrarObs(informador);
                break;
                default:
                    ok = false;
                    System.out.println("Opción Errada!!");
        }
        if(ok)
            System.out.println("Observador agregado");
    }
    
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.ejecutaPrueba();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Facade;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class ClienteSinFachada {
    private Cpu miCPU;

    public ClienteSinFachada() {
        miCPU = new Cpu();
    }
    
    public void encenderCPU(){
        miCPU.enviarVoltaje(220);
        miCPU.enviaEnergiaADispositivos();
        miCPU.resetearContadores();
        miCPU.revisaBIOS();
        miCPU.revisaHardware();
        miCPU.asignaCanales();
        miCPU.revisaMemoria();
        miCPU.revisaEntradas();
        miCPU.buscaSectorArranque();
        miCPU.cargaBoot();
        miCPU.cargaSistemaOperativo();
        
        if(miCPU.cpuLista()){
            System.out.println("\n");
            System.out.println("CPU Encendida y lista para trabajar!!!");
        }
    }
    
    public void trabajar(){
        System.out.println("Comienzo a trabajar!!!");
    }
    
    public static void main(String[] args) {
        ClienteSinFachada csf = new ClienteSinFachada();
        csf.encenderCPU();
        csf.trabajar();
    }
}

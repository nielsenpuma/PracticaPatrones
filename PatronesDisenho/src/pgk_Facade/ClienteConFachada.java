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
public class ClienteConFachada {
    private Fachada miFachada;

    public ClienteConFachada() {
        miFachada = new Fachada();
    }
    
    public void encenderCPU(){
        miFachada.encenderCPU();
        System.out.println("Comienzo a trabajar");
    }
    
    public static void main(String[] args) {
        ClienteConFachada ccf = new ClienteConFachada();
        ccf.encenderCPU();
    }
}

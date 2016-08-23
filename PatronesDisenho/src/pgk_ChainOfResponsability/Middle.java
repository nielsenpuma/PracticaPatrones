/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_ChainOfResponsability;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class Middle implements InterfaceAyuda{

    private final int TIPO_AYUDA = 2;
    private InterfaceAyuda susesor;

    public Middle(InterfaceAyuda susesor) {
        this.susesor = susesor;
    }
    
    @Override
    public void getAyuda(int tipoAyuda) {
        if(tipoAyuda == TIPO_AYUDA){
            System.out.println("\t++ Ayuda desde el Middle.");
        }else{
            susesor.getAyuda(tipoAyuda);
        }
    }
    
}

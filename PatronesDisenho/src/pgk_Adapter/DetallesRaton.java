/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Adapter;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class DetallesRaton extends JFrame{
    //Variables que contendrán la posición del clic
    private int xPos, yPos;
    
    //Constructor que llamará la clase del Adaptador

    public DetallesRaton() {
        super("Muestra de MouseAdapter");
        addMouseListener(new ManejadorRaton());
        setSize(400, 200);
        setVisible(true);
    }
    
    //Dibujará donde se hizo clic
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Se hizo clic en: ["+xPos+","+yPos+"]", xPos, yPos);
    }
    
    public static void main(String[] args) {
        DetallesRaton dr = new DetallesRaton();
        dr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //Se crea una clase interna para el Adaptador
    class ManejadorRaton extends MouseAdapter{
        //Se sobrescribe el método mouseClicked
        @Override
        public void mouseClicked(MouseEvent evento){
            xPos = evento.getX();
            yPos = evento.getY();
            repaint();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PersonaRemota implements Runnable{

    private Thread thread;
    ServerSocket socket;
    PrintWriter salida;
    Socket comunicationSocket;

    public PersonaRemota() {
        try {
            socket = new ServerSocket(45454);
            comunicationSocket = socket.accept();
            salida = new PrintWriter(comunicationSocket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error: "+ex.getMessage());
        }
    }
    
    @Override
    public void run() {
        String textoEntrada;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader
                (comunicationSocket.getInputStream()));
            while ((textoEntrada = in.readLine()) != null) {
                if(textoEntrada.equals("Saludar"))
                    saludar();
                else if(textoEntrada.equals("decirEstado"))
                    decirEstado();
                else if(textoEntrada.equals("despedirse"))
                    despedirse();
                
            }
        } catch (IOException ex) {
            System.out.println("Error general: "+ex.getMessage());
        }
    }
    
    public void saludar(){
        salida.println("Hola!!");
    }
    
    public void decirEstado(){
        salida.println("Estoy contento");
    }
    
    public void despedirse(){
        salida.println("Chao!!");
    }
    
    public static void main(String[] args) {
        PersonaRemota pr = new PersonaRemota();
    }
    
}

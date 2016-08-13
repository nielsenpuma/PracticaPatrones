/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgk_Proxy;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author nielsenpumajihuallanca
 */
public class PersonaProxy implements Runnable{
    private Thread thread;
    Socket socket;
    InputStream in;
    PrintWriter salida;
    int character;

    public PersonaProxy() {
        try {
            socket = new Socket("127.0.0.1", 45454);
            System.out.println("Conectando...");
            in = socket.getInputStream();
            salida = new PrintWriter(socket.getOutputStream(), true);
            thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            System.err.println("Error al conectarse: "+e.getMessage());
        }catch(Exception ex){
            System.err.println("Erro general: "+ex.getMessage());
        }
        
        if(socket != null && socket.isConnected()){
            System.out.println("Conectado!!!");
        }
    }

    @Override
    public void run() {
        try {
            while((character = in.read()) != -1){
                System.out.print((char) character);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void saludar(){
        salida.println("saludar");
    }
    
    public void decirEstado(){
        salida.println("decirEstado");
    }
    
    public void despedirse(){
        salida.println("despedirse");
    }
    
}

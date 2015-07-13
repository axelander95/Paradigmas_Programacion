package Sockets.Chat;

import Utilities.General;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main (String [] args){
        try {
            General.print("El chat ha comenzado...");
            Socket cliente = new Socket("localhost" , 8083);
            SocketStream socket = new SocketStream(cliente);
            Thread sender = new Thread(new SendingThread(socket));
            Thread receiver = new Thread(new ReceivingThread(socket));
            receiver.start();
            sender.start();
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

package Sockets.Chat;

import Utilities.General;
import java.io.IOException;
import java.net.ServerSocket;
public class Servidor {
    public static void main (String [] args){
        try {
            General.print("El chat ha comenzado...");
            ServerSocket server = new ServerSocket(8083);
            SocketStream socket = new SocketStream(server.accept());
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

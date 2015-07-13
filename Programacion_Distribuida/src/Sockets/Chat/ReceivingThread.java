package Sockets.Chat;

import Utilities.General;
import java.io.IOException;
public class ReceivingThread implements Runnable{
    private SocketStream socket;
    public ReceivingThread (SocketStream socket){
        this.socket = socket;
    }
    public void run (){
        try{
            while (true)
                General.print("Receptor dice: " + socket.receive());
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

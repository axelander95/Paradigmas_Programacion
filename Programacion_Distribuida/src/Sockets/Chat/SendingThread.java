package Sockets.Chat;

import Utilities.General;
import java.io.IOException;

public class SendingThread implements Runnable {
    private SocketStream socket;
    public SendingThread (SocketStream socket){
        this.socket = socket;
    }
    public void run (){
        try{
            while(true)
                socket.send(General.type());
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

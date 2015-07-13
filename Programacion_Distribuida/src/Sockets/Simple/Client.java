package Sockets.Simple;
import Utilities.General;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
public class Client {
    public static void main(String [] args){
        try {
            Socket client = new Socket(InetAddress.getByName("localhost"), 8083);
            SocketStream socket = new SocketStream(client);
            General.print("Se estableció la conexión con el servidor.");
            General.print(socket.receive());
            General.print("El servidor ha envíado un mensaje, envía tu respuesta:");
            socket.send();
            client.close();
            General.print("Se cerró la conexión.");
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

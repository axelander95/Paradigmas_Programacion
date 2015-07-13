package Sockets.Simple;
import Utilities.General;
import java.io.IOException;
import java.net.ServerSocket;
public class Server {
    public static void main(String [] args){
        try {
            ServerSocket server = new ServerSocket(8083);
            General.print("Se recibe conexiones a través del puerto " + server.getLocalPort());
            SocketStream socket = new SocketStream(server.accept());
            General.print("Se estableció la conexión con un cliente, envía un mensaje:");
            socket.send();
            General.print("El mensaje fue enviado, esperando respuesta...");
            General.print("Mensaje recibido: " + socket.receive());
            server.close();
            General.print("Se ha cerrado la conexión.");
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

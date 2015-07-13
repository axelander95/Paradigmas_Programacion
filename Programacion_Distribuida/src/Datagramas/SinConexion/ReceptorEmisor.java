package Datagramas.SinConexion;
import Utilities.General;
import java.io.*;
public class ReceptorEmisor {
    public static void main(String[] args){
        try {
            SocketDatagrama socket = new SocketDatagrama(8083);
            General.print("Bienvenido al programa ReceptorEmisor, esperando mensaje del emmisor...");
            General.print("Mensaje recibido, Emisor dice: " + socket.receive());
            General.print("Escribe tu respuesta:");
            socket.send("localhost", 8084, General.type());
            General.print("Mensaje enviado, cerrando la conexión...");
            socket.close();
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

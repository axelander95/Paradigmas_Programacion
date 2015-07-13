package Datagramas.SinConexion;
import Utilities.General;
import java.io.*;
public class EmisorReceptor {
    public static void main(String[] args){
        try {
            SocketDatagrama socket = new SocketDatagrama(8084);
            General.print("Bienvenido al programa EmisorReceptor, escribe tu mensaje: ");
            socket.send("localhost", 8083, General.type());
            General.print("Tu mensaje fue enviado.\nEsperando mensaje del receptor...");
            General.print("Mensaje recibido, Receptor dice: " + socket.receive());
            socket.close();
            General.print("Conexión cerrada.");
        }
        catch (IOException e){
            General.print("Error: " + e.getMessage());
        }
    }
}

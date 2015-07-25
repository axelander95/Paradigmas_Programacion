import java.io.IOException;
import java.net.*;
public class Servidor {
    private final ServerSocket server;
    public Servidor() throws IOException {
        server = new ServerSocket(8083);
    }
    private void atender() throws IOException {
        while (true){
            HiloCliente hilo = new HiloCliente(server.accept());
            hilo.start();
        }
    }
    private void cerrar() throws IOException {
        server.close();
    }
    public static void main(String [] args){
        try{
            Servidor servidor = new Servidor();
            servidor.atender();
            servidor.cerrar();
        }
        catch (IOException e){
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}

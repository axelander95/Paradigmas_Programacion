import java.io.IOException;
import java.net.*;
public class Cliente {
    private final Socket cliente;
    public Cliente() throws IOException {
        cliente = new Socket("localhost", 8083);
    }
    public static void main(String [] args){
        try{
            new Cliente();
        }
        catch (IOException e){
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}

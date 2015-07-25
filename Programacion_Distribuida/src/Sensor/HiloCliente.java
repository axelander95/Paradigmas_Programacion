import java.io.IOException;
import java.net.*;
public class HiloCliente extends Thread {
    private final Socket cliente;
    public HiloCliente(Socket cliente){
        this.cliente = cliente;
    }
    @Override
    public void run (){
        ProtocolSensor protocol = new ProtocolSensor();
        try {
            protocol.atenderCliente(cliente.getInputStream(), cliente.getOutputStream());
        }
        catch (IOException e){
            System.out.println("Error:"  + e.getMessage());
        }
    }
}

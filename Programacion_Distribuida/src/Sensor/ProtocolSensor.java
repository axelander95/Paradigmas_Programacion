import java.io.*;
public class ProtocolSensor {
    private InputStream entrada;
    private OutputStream salida;
    public void atenderCliente(InputStream entrada, OutputStream salida){
        this.entrada = entrada;
        this.salida = salida;
        try {
            send("He solicitado una conexión.");
            System.out.println("Cliente: " + receive());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    private void send(String message) throws IOException {
        try (DataOutputStream output = new DataOutputStream(salida)) {
            output.writeUTF(message);
            output.flush();
        }
    }
    private String receive() throws IOException {
        DataInputStream input = new DataInputStream(entrada);
        return input.readUTF();
    }
}

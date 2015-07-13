package Sockets.Chat;
import java.net.*;
import java.io.*;
public class SocketStream {
    private final Socket socket;
    public SocketStream (Socket socket) {
        this.socket = socket;
    }
    public void send(String message) throws IOException {
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF(message);
        output.flush();
    }
    public String receive() throws IOException {
        DataInputStream input = new DataInputStream(socket.getInputStream());
        return input.readUTF();
    }
}

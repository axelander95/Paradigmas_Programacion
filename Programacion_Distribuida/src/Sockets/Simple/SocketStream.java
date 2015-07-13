package Sockets.Simple;
import Utilities.General;
import java.net.*;
import java.io.*;
public class SocketStream {
    private Socket socket;
    public SocketStream (Socket socket) {
        this.socket = socket;
    }
    public void send () throws IOException {
        OutputStream output = socket.getOutputStream();
        PrintWriter out = new PrintWriter(new OutputStreamWriter(output));
        out.println(General.type());
        out.flush();
    }
    public String receive() throws IOException {
        InputStream input = socket.getInputStream();
        BufferedReader in = new BufferedReader(new InputStreamReader(input));
        return in.readLine();
    }
}

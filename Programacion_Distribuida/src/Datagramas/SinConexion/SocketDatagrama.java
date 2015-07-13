package Datagramas.SinConexion;
import java.net.*;
import java.io.*;
public class SocketDatagrama extends DatagramSocket {
    public SocketDatagrama (int port) throws IOException {
        super(port);
    }
    public void send(String hostname, int port, String message) throws IOException {
        byte[] data = message.getBytes();
        DatagramPacket datagram = new DatagramPacket(data, data.length, InetAddress.getByName(hostname), port);
        send(datagram);
    }
    public String receive() throws IOException {
        byte[] data = new byte[Byte.MAX_VALUE];
        DatagramPacket datagram = new DatagramPacket(data, data.length);
        receive(datagram);
        return new String(data);
    }
}

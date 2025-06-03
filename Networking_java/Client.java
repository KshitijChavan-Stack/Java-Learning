package Networking_java;

import java.io.*;
import java.net.Socket;

public class Client {

    Socket socket = null;
    DataInputStream in = null;
    DataOutputStream out = null;
    DataInputStream in2 = null;

    public Client(String addr, int port) throws IOException {

         socket = new Socket(addr,port);
        System.out.println("Connected");

        in = new DataInputStream(System.in);
        out = new DataOutputStream(socket.getOutputStream());
        in2 = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

        String Line = "";
        String Client2_msg = "";

        while (!Line.equals("Over")){

            Line = in.readLine();
            out.writeUTF(Line);

            Client2_msg = in2.readUTF();
            System.out.println(Client2_msg);

        }

        in.close();
        out.close();
        socket.close();


    }

    public static void main(String[] args) throws IOException {

        Client client = new Client("127.0.0.1",5000);

    }


}

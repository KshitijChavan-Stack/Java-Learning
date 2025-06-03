package Networking_java;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client2 {

    Socket sk = null;
    ServerSocket ss = null;
    DataInputStream in = null;
    DataOutputStream out = null;
    DataInputStream in1 = null;

    public Client2(int Port) throws IOException {

        ss = new ServerSocket(Port);
        System.out.println("Server Started !");

        System.out.println("Waiting for client Request !");

        sk = ss.accept();
        System.out.println("Client Request Accpted");

        in = new DataInputStream(new BufferedInputStream(sk.getInputStream()));
        out = new DataOutputStream(sk.getOutputStream());
        in1 = new DataInputStream(System.in);

        String Line = "";
        String Clinet2_msg = "";

      while (!Line.equals("Over")){
          Line = in.readUTF();
          System.out.println(Line);

          Clinet2_msg = in1.readLine();
          out.writeUTF(Clinet2_msg);
      }

        System.out.println("Loose connection");

        sk.close();
        in.close();

    }

    public static void main(String[] args) throws IOException {
        Client2 client2= new Client2(5000);
    }

}

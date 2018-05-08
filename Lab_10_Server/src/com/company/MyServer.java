package com.company;


import java.io.*;
import java.net.*;

class MyServer {
    public static void main(String args[]) throws Exception {

        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = "", str2 = "";

        while (!str1.contains("*")) {
            str1 = din.readUTF();
            System.out.println("CLIENT: " + str1);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        din.close();
        s.close();
        ss.close();

    }
}

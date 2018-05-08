package com.company;

import java.io.*;
import java.net.*;

class MyClient {
    public static void main(String args[]) throws Exception {

        Socket s = new Socket("localhost", 9999);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "", str2 = "";


            while (!str1.equals("*")) { //infinite loop will keep the program running as long as the "*" character isn't summoned
                str1 = str1 + br.readLine();

                while (str1.endsWith(".")) {//another infinite loop will hold the string data and only send it over to the
                    //server once the special character is presented "."-period.
                    dout.writeUTF(str1);
                    dout.flush();
                    str2 = din.readUTF();
                    System.out.println("SERVER: " + str2);
                    str1 = "";

                }
            }


        dout.close();
        s.close();

    }
}
package com.pramod.java.java8.multithreading.virtualThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {

        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);

        try {

            ServerSocket serverSocket = new ServerSocket(portNumber);
           Socket socket = serverSocket.accept();

            Thread.ofVirtual().start(()->{
                try {
                    PrintWriter out =
                            new PrintWriter(socket.getOutputStream(), true);

                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream()));

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        System.out.println(inputLine);
                        out.println(inputLine);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

package com.ttp.servlet;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomWebApplicationServer {

    private final int port; // Port

    public CustomWebApplicationServer(int port) {
        this.port = port;
    }


    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            log.info("Server is started and listening on port {}", port);

            log.info("Waiting for client connection...");

            Socket clientSocket;

            while ((clientSocket = serverSocket.accept()) != null) {
                log.info("Client connected: {}", clientSocket.getInetAddress());

                try (InputStream in = clientSocket.getInputStream(); OutputStream out = clientSocket.getOutputStream()) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(in,
                        StandardCharsets.UTF_8));
                    DataOutputStream dos = new DataOutputStream(out);
                    String line = br.readLine();
                    while (line != null && !line.isEmpty()) {
                        log.info(line);
                        line = br.readLine();

                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



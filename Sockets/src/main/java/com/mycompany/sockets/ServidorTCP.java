/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



package com.mycompany.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Erick López
 */
public class ServidorTCP {

    public static void main(String[] args) {
        int puerto = 5000;

        try (ServerSocket escucha = new ServerSocket(puerto)) {

            System.out.println("Servidor TCP corriendo en el puerto " + puerto);

            while (true) {
                System.out.println("Esperando cliente...");

                try (Socket conexion = escucha.accept();
                     BufferedReader entrada = new BufferedReader(
                             new InputStreamReader(
                                     conexion.getInputStream(),
                                     StandardCharsets.UTF_8
                             )
                     );
                     PrintWriter salida = new PrintWriter(
                             new OutputStreamWriter(
                                     conexion.getOutputStream(),
                                     StandardCharsets.UTF_8
                             ),
                             true
                     )) {

                    String linea;

                    while ((linea = entrada.readLine()) != null) {
                        System.out.println(linea);
                        salida.println(linea);
                    }

                } catch (IOException e) {
                    System.err.println("Error en la conexión: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Error al iniciar el servidor: " + e.getMessage());
        }
    }
}


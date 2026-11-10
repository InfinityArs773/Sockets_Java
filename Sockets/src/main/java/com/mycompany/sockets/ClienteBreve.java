/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sockets;

import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Erick López
 */
public class ClienteBreve {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5000);
        PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        salida.println("hola");
        System.out.println("Conectado desde el puerto " + socket.getLocalPort() + ". Espero 15 segundos...");
        Thread.sleep(15000);
        socket.close();
        System.out.println("Cliente cerrado");
    }
}

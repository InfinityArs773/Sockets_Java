/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sockets;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Erick López
 */
public class ServidorEspera {
    public static void main(String[] args) throws Exception {
        ServerSocket servidor = new ServerSocket(5000);
        System.out.println("Servidor esperando en el puerto 5000...");
        Socket cliente = servidor.accept();
        Scanner entrada = new Scanner(cliente.getInputStream());
        System.out.println("Recibi: " + entrada.nextLine());
        System.out.println("Espero 30 segundos antes de cerrar...");
        Thread.sleep(30000);                                // el cliente cierra primero
        cliente.close();
        servidor.close();
        System.out.println("Servidor cerrado");
    }
}

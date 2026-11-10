/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Erick López
 */
package com.mycompany.sockets;

import java.nio.charset.StandardCharsets;

public class CuentaBytes {
    public static void main(String[] args) {
        String[] palabras = {"hola", "año", "canción", "piñata"};
        for (String p : palabras) {
            int bytes = p.getBytes(StandardCharsets.UTF_8).length;
            System.out.println(p + ": " + p.length() + " caracteres, " + bytes + " bytes");
        }
    }
}

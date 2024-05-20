/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Propietario
 */
public class pruebaRegex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra = "hola mundo !! estoy en Colombia !";
        String regex = "[a-zA-Z0-9!]+";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabra);
        
        while(matcher.find()){
            String match = matcher.group();
            System.out.println("Coincidencia es: " + match);
        }
    }
    
}

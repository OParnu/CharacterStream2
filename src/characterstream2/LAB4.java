/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name: ");
            String name = input.readLine();
            System.out.println("Hello "+ name);
            System.out.print("Enter your Weight: ");
            String w = input.readLine();
            System.out.print("Enter your Height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(h)*Double.parseDouble(w)/2);
            
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

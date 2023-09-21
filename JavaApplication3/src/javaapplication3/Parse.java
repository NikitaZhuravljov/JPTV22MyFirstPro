/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Parse {
    
    private final Scanner scanner;
    
    public Parse(Scanner scanner) {
        this.scanner = scanner;
    }
    public void parse() {
        
        System.out.println("Give me a 1-4 digit number");
        int mainNumber = scanner.nextInt();
        
        if (mainNumber >= 1 && mainNumber <= 9999){
            
            int ones = mainNumber % 10;
            int tens = mainNumber % 100 / 10;
            int hundreds = mainNumber % 1000 / 100;
            int thousands = mainNumber % 10000 / 1000;
            
            System.out.println("Ones - " + ones);
            System.out.println("Tens - " + tens);
            System.out.println("Hundreds - " + hundreds);
            System.out.println("Thousands - " + thousands);
            
        }
        else {
            System.out.println("Number lenght cant be bigger than 4!");
        }      
    }  
}

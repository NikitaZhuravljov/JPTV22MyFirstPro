/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Divide {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
               
        System.out.println("Give me a one, two or three digit number: ");
        int a = scan.nextInt();
        
        if (a >= 1 && a <= 999){

            int firstNumber = a % 10;
            int secondNumber = a % 100 / 10;
            int thirdNumber = a % 1000 / 100;

            int sum = firstNumber + secondNumber + thirdNumber;

            System.out.println("ones - " + firstNumber);
            System.out.println("tens - " + secondNumber);
            System.out.println("hundreds - " + thirdNumber);
            System.out.println();
            System.out.println("Sum = " + sum);
        }
        else {
            System.out.println("It can't be bigger than three digit number");
        }
    }
    
}

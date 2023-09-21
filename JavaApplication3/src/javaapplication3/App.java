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
public class App {
    private Scanner scanner;
    
    public App() {
    this.scanner = new Scanner(System.in);
    }
    public void run(){
        boolean repeat = true;
        Converter convert = new Converter(scanner);
        do{
            System.out.println("+++++++++++++++++++++++++++++++++"
                                + "\n+ [Choose action from the list] +"
                                + "\n+++++++++++++++++++++++++++++++++");
            System.out.println("1. Exit");
            System.out.println("2. Celsius - Fahrenheit");
            System.out.println("3. Fahrenheit - Celsius");
            System.out.println("Action number: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            
            switch (task) {
                case 1:
                    System.out.println("You've chosen [Exit]. BYE!");
                    repeat = false;
                    break;
                case 2:
                    System.out.println("You've chosen [Celsius - Fahrenheit]. LETS CONVERT!");
                    convert.fahrenheit();
                    break;
                case 3:
                    System.out.println("You've chosen [Fahrenheit - Celsius]. LETS CONVERT!");
                    convert.celsius();
                    break;
                default: System.out.println("There's no such option!");
            }
            
        }while (repeat);  
        System.out.println();
    }    
    public void runTwo() {
        Parse parseNumber = new Parse(scanner);
        boolean repeat = true;
        do {
            System.out.println("+++++++++++++++++++"
                                + "\n+ [Number parser] +"
                                + "\n+++++++++++++++++++");
            System.out.println("1. Exit");
            System.out.println("2. Number parser");
            System.out.println("Action number: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            
            switch (task) {
                case 1:
                    System.out.println("You've chosen [Exit]. BYE!");
                    repeat = false;
                    break;
                case 2:
                    parseNumber.parse();
                    break;
            }
        }while (repeat);
        System.out.println();
            
    }
}

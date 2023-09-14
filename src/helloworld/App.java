package helloworld;

import java.util.Scanner;

public class App {
    
    Scanner scanner = new Scanner(System.in);
    boolean repeat = true;
    
    public App() {
        
    }
    public void run() {
        
        while (true) {
            System.out.println("Choose an option");
            System.out.println("1. Leave");
            System.out.println("2. Demo strings");
            System.out.println("3. Demo massives");

            int task = scanner.nextInt();

            switch (task) {
                case 1:
                    break;
                case 2:
                    System.out.println("demoing strings");
                    break;
                case 3:
                    System.out.println("demoing massives");
                    break;

                default: 
                    System.out.println("no such option");
            }
        }
    }

}

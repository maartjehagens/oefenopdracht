package com.example.unitone;
import java.util.Scanner;

public class Main {                                                                    //Class

    public static void main(String[] args) {

        //Main Method
        Building home = new Building("Maartje", 100, 150); //constructor
        Scanner homeInput = new Scanner(System.in);
        System.out.println("Enter your home name: ");
        String name = homeInput.nextLine();
        System.out.println("Hello home:" + name+ "!");



        /*System.out.println("Enter hoogte");
        String inputString = scanner.nextLine();

        if (inputString == "driehonderd") {
            System.out.println("To Big!");
        }
        else  {
            System.out.println("Not To big!");
        }*/
    }
}
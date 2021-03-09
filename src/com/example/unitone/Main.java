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

    }
}
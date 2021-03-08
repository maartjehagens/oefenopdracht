package com.example.unitone;
import java.util.Scanner;

public class Main {                                                                    //Class

    public static void main(String[] args) {

        //Main Method
        Building home = new Building("Maartje", 100, 150); //constructor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");

        if (home.getMaxHeight() >= 300) {
            System.out.println("To Big!");
        }
        else {
            System.out.println("Not To big!");
        }
    }
}
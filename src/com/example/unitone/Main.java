package com.example.unitone;
import java.io.*;
import java.util.Scanner;

public class Main {                                                                    //Class

    public static void main(String[] args) {

        Building home = new Building();
        home.setName("Maartje");
        home.setMaxHeight(700);
        home.setMinHeight(900);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter home size");
        home.setMaxHeight(input.nextInt());
        home.printScore();

    }
}
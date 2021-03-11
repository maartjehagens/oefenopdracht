package com.example.unitone;
import java.io.*;
import java.util.Scanner;

public class Main {                                                                    //Class

    public static void main(String[] args) {

        Building home = new Building();
        home.setName("Maartje");
        home.setMaxHeight(700);
        home.setMinHeight(900);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter home size");
        int num = scan.nextInt();

        if (home.getMaxHeight()== 900 ){
            System.out.println("Hello");
        }
        else{
            System.out.println("Nooo");
        }
    }
}
package com.example.unitone;
import java.util.Scanner;

public class Main {                                                                    //Class

    public static void main(String[] args) {

        Rijwoning rij = new Rijwoning();
        rij.setName("Maartje");
        rij.setMaxHeight(700);
        rij.setMinHeight(900);

        Scanner inputR = new Scanner(System.in);
        System.out.println("Enter home size");
        rij.setMaxHeight(inputR.nextInt());
        rij.rijHome();

        Appartement appart = new Appartement();
        appart.setName("Maartje");
        appart.setMaxHeight(700);
        appart.setMinHeight(900);

        Scanner inputA = new Scanner(System.in);
        System.out.println("Enter home size");
        appart.setMaxHeight(inputA.nextInt());
        appart.appartementHome();

        Landhuis land = new Landhuis();
        land.setName("Maartje");
        land.setMaxHeight(700);
        land.setMinHeight(900);

        Scanner inputL = new Scanner(System.in);
        System.out.println("Enter home size");
        land.setMaxHeight(inputL.nextInt());
        land.landHome();
    }
}
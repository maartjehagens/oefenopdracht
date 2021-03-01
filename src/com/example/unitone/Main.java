package com.example.unitone;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
    Building home = new Building("Maartje", 100, 150); //constructor

    System.out.println("Maximal Height:" + home.maxHeight );

    }
}
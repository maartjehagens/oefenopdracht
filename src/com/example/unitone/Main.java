package com.example.unitone;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
    Building home = new Building();

    home.minHeight = 100;
    home.maxHeight = 150;

    System.out.println("Maximal Height:" + home.maxHeight );

    }
}
package com.example.unitone;

import java.util.Scanner;

public class Building {
    private String name;
    private int maxHeight;
    private int minHeight;

    public Building(String name, int maxHeight, int minHeight){
        this.name = name;
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
    }
    public String getName() {return this.name;}
    public int getMaxHeight() {return this.maxHeight;}
    public int getMinHeight() {return this.minHeight;}
}



package com.example.unitone;
import java.util.Scanner;

public class Building {
    private String name;
    private int maxHeight;
    private int minHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void printScore(){
        if (maxHeight == 100) {
            System.out.println("Enter home size");
        }
        else if (maxHeight == 300){
            System.out.println("Enter home size!");
        }
    }
}


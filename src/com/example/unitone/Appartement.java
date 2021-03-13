package com.example.unitone;
import java.util.Scanner;

public class Appartement {
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

    public void appartementHome(){
        if (maxHeight <= 500) {
            System.out.println("Yes!");
        }
        else if (maxHeight >= 501){
            System.out.println("Noooo");
        }
    }
}
package com.example.unitone;
import java.util.Scanner;

public class Building {
    private String name;

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

    private int maxHeight;
    private int minHeight;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    }



package org.example.models;

import java.util.ArrayList;
import java.util.Objects;

public class Pet  extends Animal{


    public Pet(String name, String birthday, double weight, String type) {
        super(name, birthday, weight, type);
    }


    public void Play(){
        System.out.println("Играть");
    }




}
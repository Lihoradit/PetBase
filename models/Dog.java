package org.example.models;

import java.util.ArrayList;

public class Dog extends Pet{


    public Dog(String name, String birthday, double weight, String type) {
        super(name, birthday, weight, type);
    }

    @Override
    public ArrayList<String> getCommand_animal() {
        command_animal.add("Storage");
        return command_animal;
    }
}
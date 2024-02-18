package org.example.models;

import java.util.ArrayList;

public class PakAnimals extends  Animal{




    public PakAnimals(String name, String birthday, double weight, String type) {
        super(name, birthday, weight, type);

    }

    @Override
    public ArrayList<String> getCommand_animal() {
        command_animal.add("load_cargo");
        command_animal.add("upload_cargo");
        return command_animal;
    }

    public void load_cargo(){
        System.out.println("Груз загружен");
    }

    public void unload_cargo(){
        System.out.println("Груз разгружен");
    }

}
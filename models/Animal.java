package org.example.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Animal {

    // region Field
    private final int id;
    private static int counter = 0;

    private  String name;
    private  final String birthday;
    private double weight;
    private final  String type;

    protected final ArrayList<String> command_animal;

    // endregion

    // region Setter and Getter
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //endregion

    // region Constructor
    public Animal(String name, String birthday, double weight, String type) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.type = type;
        this.command_animal = new ArrayList<>(Arrays.asList("Run", "Jump", "Eat", "Voice"));

        this.id = ++counter;
    }
    // endregion


    // region Public Method
    public int getId(){ return this.id; }

    public String toString(){
        return  String.format(
                Locale.getDefault(),
                """
                        Name animal: %s\s
                        Age animal: %s\s
                        Weight animal: %.2f кг \s
                        Genus animal: %s\s
                        """,
                this.name,this.birthday, this.weight, this.type);}

    public ArrayList<String> getCommand_animal() {

        return command_animal;
    }

    public void add_command_animal(String command){
        command_animal.add(command);
    }

    //endregion


}
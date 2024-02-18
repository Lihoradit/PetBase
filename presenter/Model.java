package org.example.presenter;

import org.example.models.Animal;

import java.util.ArrayList;


public interface Model {


    void get_new_animal(String var1, String var2, double var3, String var4);



    ArrayList<Animal> load_animal();

    void get_command_animal(String var1);

    void learn_command_animal(String var1 , String var2);



}
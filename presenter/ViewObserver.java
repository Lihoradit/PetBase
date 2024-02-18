package org.example.presenter;

import org.example.models.Animal;

import java.util.ArrayList;

public interface ViewObserver {
    void onGetAnimal(String var1, String var2, double var3, String var4);


    void loadAnimalRegister();

}
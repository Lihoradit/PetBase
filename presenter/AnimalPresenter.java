package org.example.presenter;

import org.example.models.Animal;

import java.util.ArrayList;
import java.util.Collection;

public class AnimalPresenter implements ViewObserver {
    private final Model animalServserse;

    private final View animalviewer;

    public AnimalPresenter(Model animalServserse, View animalviewer ){
        this.animalServserse = animalServserse;
        this.animalviewer = animalviewer;
        animalviewer.setObserver(this);

    }

    public Collection<Animal> loadAnimals(){return this.animalServserse.load_animal();}

    public void loadReservationAnimalResult(ArrayList<Animal> getanimalresult ){
        this.animalviewer.showAnimals(getanimalresult);
    }



    public void onGetAnimal(String name, String birthday, double weight, String type) {
        this.animalServserse.get_new_animal(name,birthday,weight,type);

    }



    @Override
    public void loadAnimalRegister() {
        this.loadReservationAnimalResult(this.animalServserse.load_animal());
    }

}
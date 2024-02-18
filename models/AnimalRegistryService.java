package org.example.models;

import org.example.presenter.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class AnimalRegistryService implements Model {

    private final ArrayList<Animal> animalRegists;
    public AnimalRegistryService() {
        this.animalRegists = new ArrayList<>();
    }

    public void get_new_animal(String name, String birthday, double weight,String type) {

        Counter count = new Counter();
        HashMap<String,Animal> check = new HashMap<>();
        check.put("Кошка",new Cat(name,birthday,weight,type));
        check.put("Собака",new Dog(name,birthday,weight,type));
        check.put("Хомяк",new Hamstel(name,birthday,weight,type));
        check.put("Лошадь",new Hourse(name,birthday,weight,type));
        check.put("Верблюд",new Camel(name,birthday,weight,type));
        check.put("Осел",new Donkey(name,birthday,weight,type));

        Animal animal = check.get(type);
        animalRegists.add(animal);
        assert animal != null;
        count.add_count();

    }

    public ArrayList<Animal> load_animal() {

        return animalRegists;
    }

    @Override
    public void get_command_animal(String name) {
        for (Animal animal : this.animalRegists){
            if(Objects.equals(name, animal.getName())){
                System.out.println(animal.getCommand_animal());
            }
        }
    }

    @Override
    public void learn_command_animal(String name, String command) {
        for (Animal animal : this.animalRegists){
            if(Objects.equals(name, animal.getName())){
                animal.add_command_animal(command);
                System.out.println("Skill Learn");
            }
        }
    }


}
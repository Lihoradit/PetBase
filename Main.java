package org.example;


import org.example.models.AnimalRegistryService;
import org.example.presenter.AnimalPresenter;
import org.example.viewer.AnimalNurseryView;

import java.util.Scanner;

public class Main {
    public Main(){
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("База хранения домашних животных");
        AnimalRegistryService animalRegistryService = new AnimalRegistryService();
        AnimalNurseryView animalNurseryView = new AnimalNurseryView();
        new AnimalPresenter(animalRegistryService,animalNurseryView);
        boolean obs = true;
        while (obs){
            System.out.println("""
                    Привет! Выберите команду
                    1 - Завести нового питомца
                    2 - Увидеть список команд, которые выполняет питомец
                    3 - Обучить питомца новым командам
                    4 - Вывести всеx питомцев питомника
                    5 - Выйти
                    """);
            String choice = console.nextLine();
            String name_animal = null;
            String birthday = null;
            double weight = 0;
            String type_animal = null;
            String new_skill = null;
            switch (choice){
                case "1" -> {
                    System.out.println("Для этого вам необоходимо ввести " +
                            "имя питомца, дату его рождения, " +
                            "вес питомца, а также его род ");
                    System.out.println("Введите имя питомца: ");
                    name_animal = console.nextLine();
                    try {
                        System.out.println("Введите дату рождения питомца в формате (2022-01-10): ");
                        if(console.nextLine().length() == 10){
                            birthday = console.nextLine();
                            System.out.println("Введите вес питомца: ");
                            weight = Double.parseDouble(console.nextLine());
                            System.out.println("Введите род питомца (Кошка Собака Хомяк Лошадь Верблюд Осёл): ");
                            type_animal = console.nextLine();
                        }
                        else {
                            System.out.println("Вы ввели не коректные данные повторите ввод");
                        }


                    }
                    catch (Exception e){
                        System.out.println("Некоректно введены данные");
                    }
                    finally {
                        System.out.println("Повторите ввод");
                    }


                    animalNurseryView.getanimla(name_animal,birthday,weight,type_animal);


                }
                case "2" -> {
                    System.out.println("Введите кличку");
                    name_animal = console.nextLine();
                    try {
                        animalRegistryService.get_command_animal(name_animal);
                    }
                    finally {
                        System.out.println("Питомец не найден");
                    }


                }
                case "3" -> {
                    System.out.println("Введите кличку питомца, кого хотите обучить");
                    name_animal = console.nextLine();
                    System.out.println("Введите команду, которой нужно обучить питомца");
                    new_skill = console.nextLine();
                    try {
                        animalRegistryService.learn_command_animal(name_animal,new_skill);
                    }
                    finally {
                        System.out.println("Питомец не найден");
                    }

                }
                case "4" -> {
                    animalNurseryView.loadAnimals();
                }
                case "5" -> {
                    String by = "Давайте";
                    System.out.println("\n" + by.toUpperCase());
                    obs = false;
                }



            }

        }

    }


}
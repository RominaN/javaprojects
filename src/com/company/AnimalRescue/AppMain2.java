package com.company.AnimalRescue;

public class AppMain2 {
    public static void main(String[] args) {

        Animal tigru = new Animal();
        tigru.setName("tigru");
        System.out.println(tigru.getName());

        tigru.setAge(5);
        System.out.println("Varsta animalului este de: " +tigru.getAge() + " ani");

        tigru.setHealth(10);
        System.out.println("Starea de sanatate a animalului este: " +tigru.getHealth());

        tigru.setHungerLevel(1);
        System.out.println("Gradul de foame este de: " +tigru.getHungerLevel());

        AnimalFood food = new AnimalFood();
        food.setName("carne");
        System.out.println("Mancarea preferata a animalului este: " + food.getName());

        



    }
}

package com.company.AnimalRescue;

public class AppMain {
    public static void main (String[] args) {
        Animal pet = new Animal();
        System.out.println(pet.name);
        System.out.println("Varsta animalulului in ani este: " + pet.age);
        System.out.println("Activitatea preferata a animalului este: " + pet.favouriteRecreationalActivities);
        System.out.println("Mancarea favorita a animalului este: " + pet.favouriteFood);
        System.out.println("Nivelul starii de sanatate al animalului este: " + pet.health);
        System.out.println("Nivelul senzatiei de foame al animalului este: " + pet.hungerLevel);
        System.out.println("Nivelul starii de spirit al animalului este: " + pet.moodLevel);


        AnimalFood food = new AnimalFood();
        System.out.println();
        System.out.println(food.name);
        System.out.println(food.price);
        System.out.println(food.quantity);
        System.out.println(food.stockAvailability);

        AnimalRescuer resc = new AnimalRescuer();
        System.out.println();
        System.out.println(resc.moneyAvailable);
        System.out.println(resc.name);

        MedicalStaff staff = new MedicalStaff();
        System.out.println();
        System.out.println(staff.name);
        System.out.println(staff.specialization);

        RecreationActivity recr = new RecreationActivity();
        System.out.println();
        System.out.println(recr.name);

    }
}

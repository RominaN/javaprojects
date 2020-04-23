package com.company;

public class Main {

    public static void main(String[] args) {

        printMyName();
        printSum();
        printHi();
        printOp();
        System.out.println("Rezultatul adunarii este: " + adunare(5, 3));
        System.out.println("Rezultatul scaderii este: " + scadere(5, 3));
        System.out.println("Rezultatul inmultirii este: " + inmultire(5, 3));
        System.out.println("Rezultatul impartirii este: " + impartire(5, 3));
        System.out.println();
        printJava();
        printModel();
        System.out.println("Media numerelor este: " + mediaNumerelor(5, 3, 8));
        System.out.println("Restul impartirii este: " + printRest(9, 4));
        System.out.println("Temperatura in grade celsius este: " + temperatura(45));
        System.out.println("Distanta in metrii este: " + distanta(65));
        System.out.println("Viteza este: " + viteza(2, 20, 57, 100));


    }

    //Exercitiul 1
    public static void printMyName() {
        System.out.println("Hello world");
        System.out.println("Hello \n Alexandru");

    }


    public static void printSum() {
        int a, b;
        a = 5;
        b = 10;
        int sum = a + b;
        System.out.println();
        System.out.println("Suma numerelor 5 si 10 este: " + sum);

    }

    public static void printHi() {
        double c, d;
        c = 10;
        d = 3;
        double rez = c / d;
        System.out.println();
        System.out.println("Rezultatul impartirii numarului 10 la 3 este: " + rez);

    }

    public static void printOp() {
        System.out.println();
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        float e, f, g, h;
        e = 20;
        f = -3;
        g = 5;
        h = 8;
        float rezultat = ((e + (f * g) / h));
        System.out.println(+rezultat);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    //Exercitiul 2

    public static int adunare(int primulNumar, int alDoileaNumar) {

        int rezultat2 = primulNumar + alDoileaNumar;

        return rezultat2;

    }

    public static int scadere(int primulNumar, int alDoileaNumar) {

        int rezultat3 = primulNumar - alDoileaNumar;

        return rezultat3;

    }

    public static int inmultire(int primulNumar, int alDoileaNumar) {

        int rezultat4 = primulNumar * alDoileaNumar;

        return rezultat4;

    }

    public static double impartire(double primulNumar, double alDoileaNumar) {

        double rezultat5 = primulNumar / alDoileaNumar;

        return rezultat5;

    }

    // Exercitiul 3
    public static void printJava() {
        System.out.println("   J    a   V     V   a");
        System.out.println("   J   a a   V   V   a a");
        System.out.println("J  J  aaaaa   V V   aaaaa");
        System.out.println(" JJ  a     a   V   a     a");
    }

    // Exercitiul 4
    public static double mediaNumerelor(double primulNumar, double alDoileaNumar, double alTreileaNumar) {

        double media = (primulNumar + alDoileaNumar + alTreileaNumar) / 3;

        return media;

    }

    // Exercitiul 5
    public static void printModel() {
        System.out.println();
        System.out.println("  +'''''+ ");
        System.out.println(" [| o o |] ");
        System.out.println("  |  ⌃  |)  ");
        System.out.println("  | '-' |   ");
        System.out.println("  +-----+   ");
    }

    // Exercitiul 6
    public static int printRest(int primulNumar, int alDoileaNumar) {
        int rest=primulNumar% alDoileaNumar;
        return rest;
    }

    // Exercitiul 7
    public static double temperatura(double grade) {
        double c = ((grade - 32)*5)/9;
        return c;

    }

    // Exercitiul 8
    public static double distanta(double inch) {
        double m = inch/39.370;
        return m;

    }

    // Exercitiul 9
    public static double viteza(double ore, double minute, double secunde, double metrii) {
        double rezultat = (metrii / (secunde + minute * 60.0 + ore * 3600.0));
        System.out.println("Viteza in m/s:" +rezultat);
        rezultat = ((metrii / (secunde + minute  * 60.0 + ore * 3600.0)) *3.6);
        System.out.println("Viteza in km/h:" +rezultat);
        rezultat = ((metrii / (secunde + minute  * 60.0 + ore * 3600.0)) *2.237);
        System.out.println("Viteza in mile/h:" +rezultat);
        return rezultat;

    }
}
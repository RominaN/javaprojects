package com.company;

import javax.swing.*;

public class Loops {

    //Exercitiul 1 for

    public void display(int p) {
        for (int i = p; i <= p + 100; i++) {
            System.out.println(i);
        }
    }

    //Exercitiul 2 for
    public void displayMinus(int n) {
        for (int i = n; i >= n - 100; i--) {
            System.out.println(i);
        }
    }


    //Exercitiul 3 for
    public void counting(int number, int numbertwo) {
        for (int i = number; i <= numbertwo; i++) {
            System.out.println(i);
        }
    }

    //Exercitiul 4 for
    public void comparing(int number, int numbertwo) {

        if (number > numbertwo) {
            for (int i = numbertwo; i <= number; i++) {
                System.out.println(i);
            }

        } else if (number < numbertwo) {
            for (int i = number; i <= numbertwo; i++) {
                System.out.println(i);
            }
        }

    }

    //Exercitiul 5 for
    public void par() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    //Exercitiul 6 for
    public void impar() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }


    //Exercitiul 7 for
    public void suma(int n) {
        int sum = 0;
        for (int i = n; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    //Exercitiul 8 for
    public void average(int n) {
        float sum = 0;
        float average = 0;
        int contor = 0;
        for (int i = n; i <= 100; i++) {
            sum = sum + i;
            contor++;
            average = sum / contor;
        }
        System.out.println(average);

    }


    //Exercitiul 9 for
    public void star() {
        for (int j = 7; j >= 1; j--) {

            String text = "";

            for (int i = j; i >= 1; i--) {

                text = text + "*";

            }

            System.out.println(text);

        }
    }


    // Exercitiul 1 while

    public void displayHundred(int p) {
        int sum = 0;
        while (p <= 100) {
            sum = sum + p;
            p++;
        }
        System.out.println(sum);
    }


    //Exercitiul 2 while
    public void displayMinus2(int n) {
        int sum = 0;
        while (n >= -100) {
            sum = sum + n;
            n--;
        }
        System.out.println(sum);
    }

    //Exercitiul 3 while
    public void comparing2(int number, int numbertwo) {

        while (number <= numbertwo) {
            System.out.println(number);
            number++;
        }
    }

    //Exercitiul 4 while
    public void comparing3(int number, int numbertwo) {

        if (number < numbertwo) {
            while(number<=numbertwo) {
                System.out.println(number);
                number ++;
            }

        } else if (number > numbertwo) {
            while(numbertwo<=number) {
                System.out.println(number);
                number++;
            }

        }

    }


    //Exercitiul 5 while
    public void par2() {
        int n=1;
        while (n<=100) {
            if (n % 2 == 0)
                System.out.println(n);
            n++;
        }
    }

      //Exercitiul 7 while

    public void average2() {
        int n=111;
        float sum = 0;
        float average=0;
        int count = 0;

        while(n<=8899) {
            sum = sum + n;
            n++;
            count ++;
            average = sum/count;
        }
        System.out.println(sum);
        System.out.println(average);

    }

    // Exercitiul 9 Fibonacci

    public void fibonacci() {
        int n=20;
        int first = 0,next = 1;
        int i = 0;
        System.out.print(first+" "+next);
        while (i<=n)
        {
            int sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }
    }



    //Exercitiul 10 while

    public void CozaLozaWoza () {
        int nr = 1;
        while (nr <= 110)
        {
            if (nr%11==1) // pt afisarea a 11 numere pe linie
            {
                System.out.println("");
            }
            if (nr % 3 == 0) {
                System.out.print("Coza ");
            }
            else
            if (nr % 5 == 0) {
                System.out.print("Loza ");
            }
            else
            if (nr % 7 == 0) {
                System.out.print("Woza ");
            }
            else
            if (nr % 3 == 0 & nr % 5 == 0) {
                System.out.print("CozaLoza ");
            }
            else
            if(nr%3==0 & nr%7==0){
                System.out.print("CozaWoza ");
            }
else
            if(nr%5==0 & nr%7==0){
                System.out.print("WozaLoza ");
            }
else
            if(nr%3==0 & nr%5==0 && nr%7==0){
                System.out.print("CozaLozaWoza ");
            }
            else
            System.out.print(nr+" ");
            nr++;

        }
    }
}




package com.company;
import java.util.stream.IntStream;

public class Arrays {

    public void write() {
        int array[] = new int[100];
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void evenNumber() {
        int array[] = new int[100];
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0)
                System.out.println(i);

    }

    public void arraySum() {
        int[] s = {4, 6, 8, 9, 12, 20};
        float sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum += s[i];
        }
        System.out.println("Sum of given array is " + sum);
        float average = sum / s.length;
        System.out.println("Average of given array is " + average);
    }


    public void checkString() {
        String[] s = {"a", "b", "c", "d", "e", "r"};
        String n = "e";
        for (int i = 0; i < s.length; i++) {
            if (s[i] == n)
                System.out.println(s[i] + " = " + true);
            else
                System.out.println(s[i] + " = " + false);
        }

    }

    public void checkNumber() {
        int[] m = {4, 5, 8, 10, 6};
        int n = 6;
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == n) {
                index = i;
                System.out.println("Pozitia pe care se afla numarul este: " + index);
            }
        }
    }

    public void grille() {
        String[] n = {"-"};
        for (int i = 10; i >= 1; i--) {
            System.out.println();
            {
                for (int j = 1; j <= 10; j++)
                    System.out.print("-");

            }
        }
    }

    public void displayWithoutNumber() {
        int[] m = {4, 5, 8, 10, 6};
        int n = 8;
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != n) {
                index = i;
                System.out.println(m[i]);
            }
        }

    }

    public void secondSmallerNumber() {
        int[] arr = {1, 5, 8, 10, 6, 2};
        int first, second, arr_size = arr.length;
        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] < first) {
                second = first;
                first = arr[i];
            }

            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
            System.out.println("The second Smallest element is " + second);
    }

    public void copyArray(){
        int [] a={6,8,10, 12, 20};
        int b[] = new int[a.length];
        b = a;
        b[0]++;

        System.out.println("\n\nValorile primului array sunt: ");
        for (int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");

        System.out.println("\n\nValorile celui de-al doilea array sunt: ");
        for (int i=0; i<b.length; i++)
            System.out.print(b[i] + " ");
    }

}





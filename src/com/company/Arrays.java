package com.company;

public class Arrays {


    public int[] getArrayToHundred() {

        int[] myArray = new int[100];

        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;
        }
        return myArray;
    }

    public int[] evenNumber(int[] evenArray) {
        int j=0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[j] = i;
                j++;
            }
        }
        return evenArray;


    }

    public float arrayAverage(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return (sum/myArray.length);
    }


    public boolean checkString(String[] arrString, String n) {
        //String[] s = {"a", "b", "c", "d", "e", "r"};
        //String n = "e";
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i].equals(n)){
                return true;
            }

        }
            return false;
    }

    public int checkNumber(int[] m, int n) {
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == n) {
                index = i;
            }
        }
        return index;
    }

    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};



        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }


    public int[] displayWithoutNumber(int[] m, int nr) {
        int[] secondArray = new int[m.length];
        int j = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] == nr)
                continue;
            secondArray[j++] = m[i];
        }
        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
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


    public static void addElement()
    {
        int arr[] = {8, 2, 6, 4, 5, 6, 7, 12, 9, 10};
        int x = 20;
        int[] newarr;
        newarr = new int[arr.length + 1];
        newarr=arr;
        int i;

        System.out.println("\n\nValorile primului array sunt: ");
        for (i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");


        newarr[5] = x;

        System.out.println("\n\nValorile celui de-al doilea array sunt: ");
        for (i=0; i<newarr.length; i++)
            System.out.print(newarr[i] + " ");

        }

    public static void minMax(){

        int arr[] = {8, 2, 6, 25, 5, 6, 20, 12, 9, 10};
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<=min)
                min=arr[i];
            if(arr[i]>=max)
                max=arr[i];
        }
        System.out.print("\n Minimul este: "+ min);
        System.out.print("\n Maximul este: "+ max);
    }

    public static void Reverse() {

        int arr[] = {8, 2, 6, 25, 5, 6, 20, 12, 9, 10};


    }

    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }


}







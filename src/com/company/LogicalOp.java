package com.company;

public class LogicalOp {

    // Exercitiul 3

    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }

    }

    // Exercitiul 4

    public String checkText(String text) {


        if (text.equals("FastTrackIt")) {

            return "Learning text comparison";


        } else if (!text.equals("FastTrackIt")) {


            return "Got to try some more";
        }

        return text;
    }






}

        /*Exercitiul 8

        public int switch(int num){

            num = 4;
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }*/


package com.company;

//import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        //here is the if statement
        int value = 3;
        if (value == 1) {
            System.out.println("The value is " + value);
        } else if (value == 2) {
            System.out.println("The value is " + value);
        } else {
            System.out.println("The value is neither 1 or 2");
        }

        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3:case 4: case 5:
                System.out.println("The value is 3 or 4 or 5");
                break;
            default:
                System.out.println("The value is neither options");
                break;
        }
        char switchChallenge = 'A';
        switch(switchChallenge) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchChallenge + " value was found");
                break;
            default:
                System.out.println("Not found");
                break;

        }
        String switchMonth = "march";
        switch(switchMonth.toLowerCase()){//toLowerCase is a class that allows you to convert text to lowercase in String variable
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
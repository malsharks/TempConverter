package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double celsius = 0.0;
        double fahrenheit = 0.0;
        double kelvin = 0.0;

        Scanner scan = new Scanner(System.in);

        int choice = 0;

        do{
            System.out.println("Press 1 if you want to convert from Celsius to Fahrenheit ");
            System.out.println("Press 2 if you want to convert from Celsius to Kelvin");
            System.out.println("Press 3 if you want to convert from Fahrenheit to Celsius");
            System.out.println("Press 4 if you want to convert from Fahrenheit to Kelvin");
            System.out.println("Press 5 if you want to convert from Kelvin to Fahrenheit");
            System.out.println("Press 6 if you want to convert from Kelvin to Celsius");
            System.out.println("Press 0 to exit");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("What number do you want to convert from Celsius to Fahrenheit?");
                    celsius = scan.nextDouble();
                    fahrenheit = ((celsius *(9.0/5.0))+32);
                    System.out.println(celsius + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;
                case 2:
                    System.out.println("What number do you want to convert to Degrees from Celsius to Kelvin?");
                    celsius = scan.nextDouble();
                    kelvin = (celsius + 273.15);
                    System.out.println(celsius + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;
                case 3:
                    System.out.println("What number do you want to convert to from Fahrenheit to Celsius?");
                    fahrenheit = scan.nextDouble();
                    celsius = ((fahrenheit - 32) * 5.0/9.0);
                    System.out.println(fahrenheit + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;
                case 4:
                    System.out.println("What number do you want to convert from Fahrenheit to Kelvin?");
                    fahrenheit = scan.nextDouble();
                    kelvin = ((fahrenheit- 32)* 5.0/9.0 + 273.15);
                    System.out.println(fahrenheit + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;
                case 5:
                    System.out.println("What number do you want to convert from Kelvin to Celsius?");
                    kelvin = scan.nextDouble();
                    fahrenheit = (kelvin - 273.15*(9.0/5.0)+32);
                    System.out.println(kelvin + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;
                case 6:
                    System.out.println("What number do you want to convert from Kelvin to Celsius?");
                    kelvin = scan.nextDouble();
                    celsius = (kelvin - 273.15);
                    System.out.println(kelvin + "Degrees is equal to"+ fahrenheit + "degrees fahrenheit");
                    break;


            }

        }
        while(choice != 0);

        /* Do while: guarenteed to run 1 time.Tested at the end
           While loop: Runs if condition is active. Runs in the Block first
         */
    }
}

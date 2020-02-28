package JavaBasics.Elementary_Programing;

/*
Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
 */

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        System.out.println("Please enter Temp in Celsius: ");
        celsius = input.nextDouble();
        fahrenheit = (9.0/5.0)* celsius + 32;

        System.out.println("Temp in fahrenheit is: "+ fahrenheit);
    }
}

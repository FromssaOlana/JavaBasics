package JavaBasics.Elementary_Programing;
/*

Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:
a = (v1 - v0)/t
Write a program that prompts the user to enter the starting velocity v0 in meters/
second, the ending velocity v1 in meters/second, and the time span t in seconds,
and displays the average acceleration.
 */

import java.util.Scanner;

public class Acceleration {

    public static void main(String[] args) {
    double v0;
    double v1;
    double time;
    double averageAcc;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter V0: ");
        v0 = input.nextDouble();

        System.out.println("Please enter V1: ");
        v1 = input.nextDouble();

        System.out.println("Please enter time: ");
        time = input.nextDouble();

        averageAcc = (v1 - v0)/time;
        System.out.println("Average Acceleration is: "+ averageAcc);

    }


}

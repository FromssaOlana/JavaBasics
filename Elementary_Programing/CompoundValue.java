package JavaBasics.Elementary_Programing;
/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month.
 */


import java.util.Scanner;

public class CompoundValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the saving amount: ");
        double saving =  scanner.nextDouble();
        System.out.println("Enter the months you want to see: ");
        int months =  scanner.nextInt();
        double total = 0.0;

      for (int i =0; i<months;i++){
          total = (saving + total) * (1 + 0.00417);

      }
        System.out.println("saving after "+ months + " months is: "+ total);

    }

}

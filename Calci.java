package com.Calci;
import java.util.Scanner;

public class Calci {

    public static void runCalculator() {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = calculate(num1, num2, op);
            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
        sc.close();
    }

    public static double calculate(double a, double b, char op) {
        if (op == '+') 
        	return a + b;
        else if (op == '-')
        	return a - b;
        else if (op == '*')
        	return a * b;
        else if (op == '/')
        {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return 0;
            }
            return a / b;
        } 
        else
        {
            System.out.println("Invalid operator.");
            return 0;
        }
    }
    

    public static void main(String[] args)
    {
        runCalculator();
    }
}

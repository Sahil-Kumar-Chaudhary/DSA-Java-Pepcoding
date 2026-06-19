package Lectures;

public class Lecture03{

    public static void main(String[] args) {

        // Variable Declaration and Initialization
        int age = 21;
        int marks = 85;
        int rollNumber = 101;

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("Age = " + age);
        System.out.println("Marks = " + marks);
        System.out.println("Roll Number = " + rollNumber);

        // Updating Variables
        age = 22;
        marks = 90;

        System.out.println("\nAfter Updating Values");
        System.out.println("---------------------");
        System.out.println("Updated Age = " + age);
        System.out.println("Updated Marks = " + marks);

        // Using Variables in Calculations
        int a = 10;
        int b = 20;

        int sum = a + b;
        int difference = b - a;
        int multiplication = a * b;
        int division = b / a;
        int remainder = b % a;

        System.out.println("\nArithmetic Operations");
        System.out.println("---------------------");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Remainder = " + remainder);

        // Variable Copying
        int x = 50;
        int y = x;

        System.out.println("\nVariable Copying");
        System.out.println("----------------");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Reassigning Variable
        x = 100;

        System.out.println("\nAfter Reassigning x");
        System.out.println("-------------------");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

package Lectures;

import java.util.Scanner;

public class Lecture06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
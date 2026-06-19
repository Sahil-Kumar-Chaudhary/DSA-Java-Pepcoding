package Lectures;

import java.util.Scanner;

public class Lecture04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Check Voting Eligibility
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        // Check Even or Odd
        System.out.print("\nEnter a number: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // Grade System
        System.out.print("\nEnter Marks: ");
        int marks = sc.nextInt();

        if(marks >= 90) {
            System.out.println("Grade A");
        }
        else if(marks >= 75) {
            System.out.println("Grade B");
        }
        else if(marks >= 60) {
            System.out.println("Grade C");
        }
        else if(marks >= 40) {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }





//        int x =101;
//        if(x%2==0){
//            System.out.print(x+" is a Even Number.");
//        }else{
//            System.out.print(x+" is Odd Number.");
//        }

        System.out.print("Enter Mark: ");
        int n = sc.nextInt();

        if(n>90){
            System.out.println("Brilliant");
        } else if (n>80) {
            System.out.println("Excellent");
        }else if(n>70){
            System.out.println("Very Good");

        }else if(n>60){
            System.out.println("Good");

        }else if(n>50){
            System.out.println("Not Bad");

        }else if(n>40){
            System.out.println("Need Improvment");

        }else if(n>30){
            System.out.println("Just Pass");

        }else if(n>20){
            System.out.println("Fail");

        }

        System.out.println("Result Published......");


        sc.close();
    }
}
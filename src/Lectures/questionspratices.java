package Lectures;
import java.util.*;

public class questionspratices {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);


// Q1-- Check number is Prime or Not..........


/*
        System.out.print("Enter number: ");
        int t = scn.nextInt();

        System.out.print("Enter all numbers: ");
        for(int i = 0; i < t; i++) {

            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }




// Q2-- Print all prime number upto n......

        System.out.print("Enter nnumber: ");
        int n = scn.nextInt();

        for(int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for(int div = 2; div * div <= num; div++) {
                if(num % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(num + " ");
            }
        }



// Q3-- Print all Fibonacci Series upto n.........

        System.out.print("Enter number: ");
        int a = scn.nextInt();

        int first =0;
        int second =1;

        for(int i=0;i<=a;i++){
            System.out.print(first+" ");
            int c = first + second;
            first = second;
            second = c;


        }



// Q4-- Print the number of digit in a give input......

        System.out.print("Enter a number: ");
        int n = scn.nextInt();
        int digit =0;
        while(n!=0){
            n=n/10;
            digit++;
        }
        System.out.print("Total number of Digits: "+digit);




// Q5-- Print all the Digit of the number.......

        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        int temp=n;
        int digits =0;
        while(temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Create divisor
        int div = (int)Math.pow(10, digits - 1);

        // Print digits
        while(div > 0) {
            int digit = n / div;
            System.out.println(digit);

            n = n % div;
            div = div / 10;
        }

 */

//






    }

}

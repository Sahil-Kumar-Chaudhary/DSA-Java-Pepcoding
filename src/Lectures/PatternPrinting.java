package Lectures;
import java.util.*;

public class PatternPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



/*

// Q1-- Print the pattern upto n....
//      n=5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {
            for(int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }


// Q2-- Print the pattern upto n....
//        n=5
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {
            for(int star = n; star >= row; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }


// Q3-- Print the pattern upto n....
//        n=5
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {

            // Print spaces
            for(int sp = 1; sp <= n - row; sp++) {
                System.out.print("  ");
            }

            // Print stars
            for(int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

 */
// Q4-- Print the pattern upto n....
//        n=5
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int row = 1; row <= n; row++) {

            // Print spaces
            for(int sp = 1; sp <= row - 1; sp++) {
                System.out.print("  ");
            }

            // Print stars
            for(int star = 1; star <= n - row + 1; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }




    }
}

package Lectures;
import java.util.*;

public class PatternPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



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



    }
}

package Lectures;

import java.util.*;

public class Methods {

    public static void print(){
        System.out.println("Hello World!");
        for(int i=0;i<5;i++){
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    public static void sum(int a,int b){ // a and b are parameters
        System.out.println(a+b);

    }

    public static int maximum(int x,int y){
        System.out.print("Hello ");
        System.out.println("User ");
        return Math.max(x,y);

    }

    public static int check(int a){
        if(a>10){
            return 10;                   // it is mandorty to write else case in int method
        }
        else{
            return 9;
        }
    }

    // Q -- Write a code for find permutations and combinations of n objects taken r at a time.

    public static int fact(int x){
        int a = 1;
        for(int i=1;i<=x;i++){
            a *=i;
        }
        return a;
    }

    


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
        // Math Methods
        System.out.println(Math.sqrt(10));
        System.out.println(Math.cbrt(125));
        System.out.println(Math.abs(-125));
        System.out.println(Math.floor(-1.25));
        System.out.println(Math.min(9,34));
        System.out.println(Math.max(95,45));
        System.out.println(Math.round(1.65));
        //Find max of four numbers with built in method
        System.out.println(Math.max(Math.max(2,3),Math.max(4,5)));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(0,0));//error it should not be 1.
        */

        print();
        sum(8,9); // 8 and 9 are argument
        int x = maximum(3,9);
        System.out.println(x);
        System.out.println(maximum(12,6));

    }
}

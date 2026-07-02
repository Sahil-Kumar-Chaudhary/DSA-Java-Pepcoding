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

    public static void main(String[] args){
    }
}

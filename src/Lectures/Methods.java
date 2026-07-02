package Lectures;

public class Methods {
    public static void main(String[] args){

        /**
         * The main method demonstrating various built-in Math class methods in Java.
         * These methods include sqrt, cbrt, abs, floor, min, max, round, and pow.
         */

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
        

    }
    
}

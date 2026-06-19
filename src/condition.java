import java.util.*;

public class condition{
    public static  void main(String[] args){

//        int x =101;
//        if(x%2==0){
//            System.out.print(x+" is a Even Number.");
//        }else{
//            System.out.print(x+" is Odd Number.");
//        }
        Scanner sc = new Scanner(System.in);
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
    }

}
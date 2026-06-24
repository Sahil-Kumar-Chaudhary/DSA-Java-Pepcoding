package Lectures;
import java.util.*;

public class BinarySearchPratices {
    public static void main(String[] args){
/*
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 3, 3, 7, 7, 7, 8, 9, 9, 32};


        int target = 7;

        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                answer = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Last Occurrence of " + target + " is at index: " + answer);




//minimum element in a Rotated Sorted Array with duplicates:
        int[] arr = {3, 3, 7, 7, 7, 9, 9, 1, 2, 2, 2, 2, 2, 2};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            else if (arr[mid] < arr[end]) {
                end = mid;
            }
            else {
                end--;
            }
        }

        System.out.println("Minimum Element: " + arr[start]);
        System.out.println("Index: " + start);




        int[] arr = {4, 2, 8, 6};
        int target = 6;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }

            if (mid > start && arr[mid - 1] == target) {
                System.out.println(mid - 1);
                break;
            }

            if (mid < end && arr[mid + 1] == target) {
                System.out.println(mid + 1);
                break;
            }

            if (target < arr[mid]) {
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }

// Kaden's Algo

        int[] arr={1,2,1,-1,2,-6,5};
         for (int i = 0; i < arr.length; i++) {
             for (int j = i; j < arr.length; j++) {
                 int sum =0;

                 for (int k = i; k <= j; k++) {
                     System.out.print(arr[k] + " ");
                     sum+=arr[k];

                 }
                 System.out.print(" ="+sum);
                 System.out.println();
             }
         }

        int currentSum = 0;
        int maxSum = 0;

        for(int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);

        int startIndex = 0;
        int endIndex = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = tempStart;
                endIndex = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Start Index = " + startIndex);
        System.out.println("End Index = " + endIndex);

 */
//  Finding next greatest number...............................................

                int[] arr = {6, 8, 0, 1, 3};

                Stack<Integer> st = new Stack<>();

                for(int i=0;i<arr.length-1;i++){
                    if(arr[i]<arr[i+1]){
                        st.push(arr[i+1]);
                    }else{
                        st.push(-1);
                    }

                }
                st.push(-1);

                System.out.print(st);









    }

}

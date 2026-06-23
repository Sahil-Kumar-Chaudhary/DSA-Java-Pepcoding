package Lectures;

public class BinarySearchPratices {
    public static void main(String[] args){

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







    }

}

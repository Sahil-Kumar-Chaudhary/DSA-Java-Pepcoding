package Lectures;

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


 */

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











    }

}

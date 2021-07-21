package findArrays;

import java.util.Arrays;

public class ReversAnArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");   // 6 5 4 3 2 1
        }
        System.out.println();
        System.out.println("=============================================================");
        int []number = {1,2,3,4,5,6};
        int []array = new int[number.length];
        int j = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            array[j++] = number[i];
        }
        System.out.println(Arrays.toString(array)); // [6, 5, 4, 3, 2, 1]
        System.out.println("===================Using for each loop==============================");



    }
}

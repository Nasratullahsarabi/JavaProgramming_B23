package findArrays;

import java.util.Arrays;

public class SplitAnArrayInToHalf {
    public static void main(String[] args) {

        int []arr1 = {1,2,3,4,5,6,7,8};
        int []firstHalf = new int[arr1.length/2];
        int []secondtHalf = new int[arr1.length/2];

        for (int i = 0; i < arr1.length/2; i++) {
            firstHalf[i] = arr1[i];
        }
        System.out.println(Arrays.toString(firstHalf));
        for (int i = 5; i < arr1.length-1 ; i++) {
            secondtHalf[i] = arr1[i+5];
        }
        System.out.println(Arrays.toString(secondtHalf));
    }
}

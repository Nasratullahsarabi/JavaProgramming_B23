package findArrays;

import java.util.Arrays;

public class FindArrayEvenAndOddNum {
    public static void main(String[] args) {

        int[]number = {6, 1, 2, 4, 5, 3, 7, 10, 8, 9};
        int j = 0;
        String[] even = new String[0]; String[] odd = new String[0];

        for (int i = 0; i < number.length; i++) {


            if (number[i]%2 == 0){

                even[0] += number[i];

            }
        }

        System.out.println(Arrays.toString(even));

    }
}

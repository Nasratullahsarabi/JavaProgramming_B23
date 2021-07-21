package swapLetters;

import java.util.Arrays;

public class SwapElementsOfAnArray {
    public static void main(String[] args) {

        int[]num = {1, 2, 3, 4, 5, 6};
/*
      int temp = num[0];
      num[0] = num [num.length-1];
      num [num.length-1] = temp;
        System.out.println(Arrays.toString(num));

 */
        System.out.println("=======================================");
        int temp1 = num[0];
        num[0] = num[5];
        num[5] = temp1;

        temp1 = num[1];
        num[1] = num[4];
        num[4] = temp1;

        temp1 = num[2];
        num[2]= num[3];
        num[3]= temp1;

        System.out.println(Arrays.toString(num));
        System.out.println("====================Or If wanna sheft only one number===========================");

        int []number = {1,2,3,4,5};
        int temp = number[0];
        for (int i = 0; i < number.length-1; i++) {
            number[i] = number[i+1];
        }
        number[number.length-1] = temp;
        System.out.println(Arrays.toString(number));
    }
}

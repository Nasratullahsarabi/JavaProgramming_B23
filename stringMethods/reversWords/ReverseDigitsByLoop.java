package reversWords;

import java.util.Arrays;

public class ReverseDigitsByLoop {
    public static void main(String[] args) {
        int[]digit = {1, 2, 3, 4, 5};
        int[]revers= new int[digit.length];

        for (int i = digit.length-1, j = 0; i >= 0; i--,j++) {

            revers[j]= digit[i];

        }
        System.out.println(Arrays.toString(digit));
        System.out.println(Arrays.toString(revers));
    }
}

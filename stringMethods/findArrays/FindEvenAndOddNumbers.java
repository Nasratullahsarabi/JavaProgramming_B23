package findArrays;

import java.util.Arrays;

public class FindEvenAndOddNumbers {
    public static void main(String[] args) {

        int[]number = {6, 1, 2, 4, 5, 3, 7, 10, 8, 9};
        String odd = ""; String even = "";
        for (int i = 0; i < number.length; i++) {

            if (number[i]%2 == 0){
                even+=number[i]+" ";
            }
            if (number[i]%2 != 0){
                odd+=number[i]+" ";
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}

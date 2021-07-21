package conversion;

import java.util.Arrays;

public class ConvertArrayToStringAndOpposit {
    public static void main(String[] args) {
        String name = "Afghanistan";

        char[]ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("=================Conversion of a sentence to array string==============================");
        String sentence = "I want to go to Afghanistan";
        String []str = sentence.split(" ");
        System.out.println(Arrays.toString(str));

        System.out.println("===========================Conversion of a char array into word========================");
        for (int i = 0; i < ch.length; i++) {

            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println("======================================================================================");
        for (int i = 0; i < str.length; i++) {

            System.out.print(str[i]+" ");

        }

    }
}

package swapLetters;

import java.util.Arrays;

public class SwapFirstElementOfAnArrayToAnotherArray {
    public static void main(String[] args) {

        String[]arr = {"Nasrat", "Ateeq", "Asad", "Wahid"};

        String element = arr[0];
        String[]rev = new String[element.length()];

        int j = 0;

        for (int i = element.length()-1; i >= 0; i--){
            rev[j++] = ""+element.charAt(i);
        }


        System.out.println(Arrays.toString(rev));


    }
}

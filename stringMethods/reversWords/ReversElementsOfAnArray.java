package reversWords;

import java.util.Arrays;

public class ReversElementsOfAnArray {
    public static void main(String[] args) {

        String[]names = {"Nasrat", "Ateeq", "Asad", "Wahid"};

        for (int j = 0; j < names.length; j++) {

        String element = names[j], revers = "";
        for (int i = element.length()-1; i >= 0 ; i--) {

            revers+=element.charAt(i);
        }
        names[j] = revers;
        }
        System.out.println(Arrays.toString(names));
    }
}

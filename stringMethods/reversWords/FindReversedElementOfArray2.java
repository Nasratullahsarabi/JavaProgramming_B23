package reversWords;

import java.util.Arrays;

public class FindReversedElementOfArray2 {
    public static void main(String[] args) {

        String[]names = {"Nasrat", "Ateeq", "Asad", "Wahid"};
        String[]revers = new String[names.length];

        for (int j = 0; j < names.length; j++) {

        String element = names[j], result = "";

        for (int i = element.length()-1; i >= 0 ; i--) {

            result+= element.charAt(i);

        }
        revers[j] = result;

        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(revers));

    }
}

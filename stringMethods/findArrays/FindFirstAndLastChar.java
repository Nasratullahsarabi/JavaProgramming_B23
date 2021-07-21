package findArrays;

import java.util.Arrays;

public class FindFirstAndLastChar {
    public static void main(String[] args) {
        String []str = {"a", "b", "c", "d", "e", "f", "j","h"};
        String[]range1 = Arrays.copyOfRange(str,0,1); // first letter
        String[]range2 = Arrays.copyOfRange(str,str.length-2, str.length-1); // last letter

        System.out.println(Arrays.toString(range1));
        System.out.println(Arrays.toString(range2));

    }
}

package findArrays;

import java.util.Arrays;

public class PrintRange {
    public static void main(String[] args) {

        int[]arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[]range = Arrays.copyOfRange(arr, 4, 8);

        System.out.println(Arrays.toString(range));
        System.out.println("=======================================");
        String[]str = {"Nasrat","Asad","Ateeq","Wahid","Muzafar","Hashmat","Hamasa"};
        String[]range2 = Arrays.copyOfRange(str, 3,5);

        System.out.println(Arrays.toString(range2));

    }
}

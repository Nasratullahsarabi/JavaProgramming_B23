package merge;

import java.util.Arrays;

public class MergeTwoStringArrays {
    public static void main(String[] args) {
        String[]arr1 = {"Nasrat","Asad","Ateeq","Wahid"};
        String[]arr2 = {"Hashmat","Hamasa","Muzafar"};
        String[]merge = Arrays.copyOf(arr1,arr1.length+arr2.length);
        int j = arr1.length;
        for (int i = 0; i < arr2.length; i++) {

            merge[j++] = arr2[i];
        }
        System.out.println(Arrays.toString(merge));
        System.out.println("==========================================");

        String[]arr3 = {"Nasrat","Asad","Ateeq","Wahid"};
        String[]arr4 = {"Hashmat","Hamasa","Muzafar"};
        String[]merge2 = Arrays.copyOf(arr4, arr3.length+arr4.length);
        int l = arr4.length;

        for (String each : arr3) {
            merge2[l++] = each;
        }

        System.out.println(Arrays.toString(merge2));
    }
}

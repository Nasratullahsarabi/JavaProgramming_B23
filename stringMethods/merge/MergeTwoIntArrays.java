package merge;

import java.util.Arrays;

public class MergeTwoIntArrays {
    public static void main(String[] args) {
        int[]num1 = {1,2,3,4,5,6};
        int[]num2 = {7,8,9,10};
        int[]merge = Arrays.copyOf(num1, num1.length+num2.length);

        int i = num1.length;

        for (int each : num2){

            merge[i++] = each;
        }
        System.out.println(Arrays.toString(merge));
        System.out.println("=======================================");
        int[]num3 = {1,2,3,4,5,6};
        int[]num4 = {7,8,9,10};
        int[]merge2 = Arrays.copyOf(num4, num3.length+num4.length);
        int x = num4.length;
        for (int y = 0;y < num3.length;y++ ){
            merge2[x++] = num3[y];
        }
        System.out.println(Arrays.toString(merge2));
    }
}

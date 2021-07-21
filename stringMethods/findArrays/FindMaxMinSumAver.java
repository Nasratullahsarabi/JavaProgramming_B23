package findArrays;

public class FindMaxMinSumAver {
    public static void main(String[] args) {
        int[]number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0, count = 0, max = number[0], min = number[0];

        for (int i = 0; i < number.length; i++) {

            sum+=number[i];
            count++;
            if (number[i] > max){
                max = number[i];
            }
            if (number[i] < min ){
                min = number[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("ave = "+ (double)sum/count);

    }
}

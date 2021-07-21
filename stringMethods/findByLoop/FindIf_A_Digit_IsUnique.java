package findByLoop;

public class FindIf_A_Digit_IsUnique {
    public static void main(String[] args) {

        int[]number = {2, 3, 4, 2, 1, 5, 3, 1};

        for (int j = 0; j < number.length; j++) {
             int count = 0;
            for (int i = 0; i < number.length; i++) {

                if (number[i] == number[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(number[j]);
            }

        }





    }
}

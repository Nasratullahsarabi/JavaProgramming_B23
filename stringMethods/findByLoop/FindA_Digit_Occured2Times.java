package findByLoop;

public class FindA_Digit_Occured2Times {
    public static void main(String[] args) {
        int[]digit = {2, 3, 5, 2, 6, 4, 3, 2, 4};
        int result = 0;

        for (int j = 0; j < digit.length; j++) {

            int count = 0;

            for (int i = 0; i < digit.length; i++) {
                if (digit[i] == digit[j]){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(digit[j]);
            }

        }


    }
}

package findByLoop;

public class FindDigitFreq {
    public static void main(String[] args) {
        int[]number = {2, 2, 4, 1, 5, 2, 3}; int freq = 0; int digit = 2;

        for (int i = 0; i < number.length; i++) {

            if (number[i] == digit){
                freq++;
            }

        }
        System.out.println(freq);
    }
}

package findArrays;

import java.util.Arrays;

public class FindAllLettersFromAtoZ {
    public static void main(String[] args) {
        char[]alphabet = new char[26];
        int j = 0;
        for (char i = 'A'; i <= 'Z'; i++) {

            alphabet[j++] = i;
        }
        System.out.println(Arrays.toString(alphabet));
    }
}

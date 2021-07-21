package findByLoop;

import java.util.Arrays;

public class FindCommonWordsInA_Sentence {
    public static void main(String[] args) {
        String sentence1 = "I want to go to kabul";
        String sentence2 = "she is from kabul";

        String[] split1 = sentence1.split(" ");
        String[] split2 = sentence2.split(" ");

        for (int i = 0; i < split1.length; i++) {

            for (int j = 0; j < split2.length; j++) {

                if (split1[i].equalsIgnoreCase(split2[j])){
                    System.out.println(split1[i]);
                }
            }

        }
    }
}

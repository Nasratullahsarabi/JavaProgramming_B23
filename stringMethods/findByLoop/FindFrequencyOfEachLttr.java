package findByLoop;

public class FindFrequencyOfEachLttr {
    public static void main(String[] args) {
        String word = "aaabbbbbccdffkl"; String removeDup = ""; String result = "";

        for (int i = 0; i < word.length(); i++) {

            if (!removeDup.contains(""+word.charAt(i))){
                removeDup+=word.charAt(i);
            }
        }

        for (int j = 0; j < removeDup.length(); j++) {

            int freq = 0;
            for (int i = 0; i < word.length(); i++) {
                if (removeDup.charAt(j) == word.charAt(i)){
                    freq++;
                }
            }
            result+= ""+removeDup.charAt(j)+freq;
        }
        System.out.println(result);


    }
}

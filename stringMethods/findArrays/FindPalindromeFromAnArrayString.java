package findArrays;

public class FindPalindromeFromAnArrayString {
    public static void main(String[] args) {

        String[] words = {"Anna", "racecar", "level", "Ahmad", "civic", "madam", "John"};

        String palindromes = "";

        for (int i = 0; i < words.length ; i++) {
            String reversed = "";
            for (int j = words[i].length()-1; j >=0 ; j--) {

                reversed+=words[i].charAt(j);
            }
            if (reversed.equalsIgnoreCase(words[i])){
                palindromes+=words[i]+" ";
            }
        }
        System.out.println(palindromes);
        System.out.println("=========================Using for each loop=========================================");

        String palindrom1 = "";
        for (String each : words) {
            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) {

                reversed+=each.charAt(i);
            }
            if (reversed.equalsIgnoreCase(each)){
                palindrom1+=each+" ";
            }

        }
        System.out.println(palindrom1);

    }
}

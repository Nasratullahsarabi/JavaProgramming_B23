package findArrays;

public class FindLongestPalindromeFromAnArrayString {
    public static void main(String[] args) {

        String[] words = {"Anna", "racecar", "level", "Ahmad", "civic", "madam", "John"};

        String longestpalindrome = "";

        for (int i = 0; i < words.length ; i++) {
            String reversed = "";
            boolean isPalindrom = true;
            for (int j = words[i].length() - 1; j >= 0; j--) {

                reversed += words[i].charAt(j);
            }
            isPalindrom = reversed.equalsIgnoreCase(words[i]);
            if (isPalindrom && words[i].length() > longestpalindrome.length()){
                longestpalindrome = words[i];
            }
        }

        System.out.println(longestpalindrome);
        System.out.println("=========================Using for each loop=========================================");

        String palindrom1 = "";
        for (String each : words) {
            String reversed = "";
            boolean isPalindrom = true;

            for (int i = each.length()-1; i >=0 ; i--) {

                reversed+=each.charAt(i);
            }
            isPalindrom = reversed.equalsIgnoreCase(each);
            if (isPalindrom && each.length() > longestpalindrome.length()){
                longestpalindrome = each;
            }

        }
        System.out.println(longestpalindrome);

    }
}

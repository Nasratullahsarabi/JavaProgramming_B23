package findWords;

public class FindIfAwrodIsPalindrom {
    public static void main(String[] args) {

        String word = "nadan";
        String palindrom = "";

        for (int i = 0; i < word.length(); i++) {

            for (int j = word.length()-1; j >= 0 ; j--) {

                if (word.charAt(i) == word.charAt(j)){
                    palindrom = " is palindrom";
                }else {
                    palindrom =  " is not palindrom";
                }

            }

        }
        System.out.println(word+" "+palindrom);
        System.out.println("==========================using boolean instead of if statement=========================");

        boolean palindrome1 = true;

        for (int i = 0; i < word.length(); i++) {

            for (int j = word.length()-1; j >= 0 ; j--) {

                palindrome1 = word.charAt(i) == word.charAt(j);
            }
        }
        System.out.println(palindrome1);
    }
}

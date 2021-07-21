package findByLoop;

public class FindUniqeLetters {
    public static void main(String[] args) {

        String str = "aaabcccdddefggggh"; int freq = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){

                System.out.print(str.charAt(i));
            }
        }
        System.out.println();
        System.out.println("=====================================================");
        for (char each : str.toCharArray()){
            if (str.indexOf(each) == str.lastIndexOf(each)){

                System.out.print(each);
            }
        }
        System.out.println();
        System.out.println("======================Also========================");

        String str2 = "ooooooppppuuuyyttfla";

        for (int i = 0; i < str2.length(); i++) {

            if (str2.indexOf(str2.charAt(i)) == str2.lastIndexOf(str2.charAt(i))){

                System.out.print(str2.charAt(i));
            }

        }
    }
}

package findByLoop;

public class FindFirstUniqeChar {
    public static void main(String[] args) {
        String str = "aaabbcdddeffg";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){

                System.out.println(each);
                break;
            }
        }
        System.out.println();
        System.out.println("===================================");

        for (char each : str.toCharArray()){

            if (str.indexOf(each) == str.lastIndexOf(each)){

                System.out.print(each);
                break;
            }
        }
    }
}

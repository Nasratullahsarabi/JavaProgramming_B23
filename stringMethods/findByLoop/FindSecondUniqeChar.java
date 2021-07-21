package findByLoop;

public class FindSecondUniqeChar {
    public static void main(String[] args) {

        String str = "aaabbcdddeffg";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                count++;
            }
            if (count == 2){
                System.out.println(each);
                break;
            }
        }


    }
}

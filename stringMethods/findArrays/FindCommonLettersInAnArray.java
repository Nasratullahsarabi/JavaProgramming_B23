package findArrays;

public class FindCommonLettersInAnArray {
    public static void main(String[] args) {

        String []arr1 = {"a","b","c","d"};
        String []arr2 = {"c","f","d","j"};

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){
                    System.out.println(arr1[i]);
                }

            }

        }
    }
}

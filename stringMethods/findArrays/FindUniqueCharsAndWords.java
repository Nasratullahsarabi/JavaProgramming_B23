package findArrays;

public class FindUniqueCharsAndWords {
    public static void main(String[] args) {
        String[]str = {"ateeq","basir","carim","ateeq","carim","jawad","kadim"}; // if we change it to {"a","b","c","a","c","j","k"}

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {

                if (str[i].equals(str[j])){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(str[i]+" ");  // then result will be "bjk" same bellow
            }
        }
        System.out.println();
        System.out.println("===============By for each loop=========================");

        for (String each : str) {
            int count = 0;
            for (String element : str) {

                if (each.equals(element)){
                    count++;
                }
            }
            if (count==1){
                System.out.print(each+" ");
            }

        }
    }
}

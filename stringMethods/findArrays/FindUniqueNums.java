package findArrays;

public class FindUniqueNums {
    public static void main(String[] args) {
        int array[] = {6,2,1,5,4,2,3,6,5};
        
        String uniqueNums = "";

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array.length; j++) {
                
                if (array[i] == array[j]){
                    count++;
                }
            }
            if (count==1){
                uniqueNums+=array[i]+" ";
            }
        }
        System.out.println("uniqueNums = " + uniqueNums);
        System.out.println("========Using for each loop======================");
        String uniqueNums2 = "";

        for (int each : array) {
            int freq = 0;
            for (int element : array) {
                if (each ==  element){
                    freq++;
                }
            }
            if (freq==1){
                uniqueNums2+=each+" ";
            }
        }
        System.out.println("uniqueNums2 = " + uniqueNums2);
    }
}

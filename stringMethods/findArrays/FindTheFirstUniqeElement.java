package findArrays;

public class FindTheFirstUniqeElement {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 5, 5};
        int frstunqElmnt = 0;

        for (int i = 0; i < nums.length; i++) {

            int freq = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]){
                    freq++;
                }

            }
            if (freq == 1){
                frstunqElmnt = nums[i];
                break;
            }
        }
        System.out.println(frstunqElmnt);
        System.out.println("================================================");
        int uniqeElement2 = 0;
        for (int each:nums) {
            int freq = 0;
            for (int each1:nums) {

                if (each == each1){
                    freq++;
                }

            }
            if (freq == 1){
                uniqeElement2 = each;
                break;
            }

        }
        System.out.println(uniqeElement2);
    }
}

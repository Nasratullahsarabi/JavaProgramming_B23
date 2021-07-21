package findWords;

public class FindLongestAnagram {
    public static void main(String[] args) {
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        String longestanagram = ""; int count = 0;

        for (int i = 0; i < names.length; i++) {

            String firstChar = names[i].substring(0,1);
            String lastChar = names[i].substring(names[i].length()-1);
            if (firstChar.equalsIgnoreCase(lastChar) && names[i].length()>longestanagram.length()){
                count++;
                longestanagram=names[i];
            }
        }
        System.out.println(longestanagram);
        System.out.println(count);
    }
}

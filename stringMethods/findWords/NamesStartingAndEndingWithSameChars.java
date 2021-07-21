package findWords;

public class NamesStartingAndEndingWithSameChars {
    public static void main(String[] args) {
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        String anagram = ""; int count = 0;

        for (int i = 0; i < names.length; i++) {

            String firstChar = names[i].substring(0,1);
            String lastChar = names[i].substring(names[i].length()-1);
            if (firstChar.equalsIgnoreCase(lastChar)){
                count++;
                anagram+=names[i]+" ";
            }
        }
        System.out.println(anagram);
        System.out.println(count);
    }
}

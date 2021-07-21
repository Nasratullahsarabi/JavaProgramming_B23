package findLetters;

public class Find_Letters_Of_FullName {
    public static void main(String[] args) {
        String word = "Nasrat Sarabi";
        int indexOfSpace = word.indexOf(" ");
        String firstName = word.substring(0,indexOfSpace); //this is how to find the first name
        String lastName  = word.substring(indexOfSpace,word.length()); // this is how to find the last name

        String twoLetters = word.substring(0,2)+word.substring(word.length()-2); // two letters of full name
        String twoFirstLtrs = word.substring(0,2)+word.substring(indexOfSpace+1,word.indexOf("rab"));


        System.out.println(twoFirstLtrs);




    }
}

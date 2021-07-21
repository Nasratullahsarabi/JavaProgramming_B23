package findLetters;

public class Find_Middle_Letter_Of_FullName {
    public static void main(String[] args) {
        String fullName = "Nasratullah Sarabi";

        int indexOfSpace = fullName.indexOf(" ");

        String fName = fullName.substring(0,indexOfSpace);
        String lName = fullName.substring(indexOfSpace);

        String middleOfFirstName = fName.substring(fName.length()/2-1,fName.length()/2); // if index number of word is odd number
        String middleOflastName = lName.substring(lName.length()/2,lName.length()/2+1); // if indext number of word is even
        String middleOflastName2 = lName.substring(lName.length()/2+1,lName.length()/2+2); // to find the middle close to end

        System.out.println(middleOflastName2);

        System.out.println(middleOfFirstName+middleOflastName);








    }
}

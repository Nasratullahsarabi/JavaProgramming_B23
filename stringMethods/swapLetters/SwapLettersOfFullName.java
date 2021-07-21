package swapLetters;

public class SwapLettersOfFullName {
    public static void main(String[] args) {
        String fullName = "Nasrat Sarabi";

        int indexOfSpace = fullName.indexOf(" ");
        String firstNameLetter = fullName.substring(0,1); // N
        String  lastNameLetter = fullName.substring(indexOfSpace+1,indexOfSpace+2); //S
        String fisrstName = fullName.substring(1,indexOfSpace); //asrat
        String lastName  = fullName.substring(indexOfSpace+2); //arabi

        System.out.println(lastNameLetter+fisrstName+" "+firstNameLetter+lastName); //S+asrat+ +N+arabi
        System.out.println("===============Swap t with i===================");

        String firstNameLastLetter= fullName.substring(indexOfSpace-1,indexOfSpace);
        String lastNameLastLetter = fullName.substring(fullName.length()-1);
        String firstName2 = fullName.substring(0,indexOfSpace-1);
        String lastName2 = fullName.substring(indexOfSpace,fullName.length()-1);

        System.out.println(firstName2+lastNameLastLetter+" "+lastName2+firstNameLastLetter);









    }
}

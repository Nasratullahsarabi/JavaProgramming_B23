package findByLoop;

public class FindWordFrequencyInAsentence {
    public static void main(String[] args) {
        String sentence = "java is a good softwear language. I love java and java is best.";
        String word = "java"; int count = 0;

        while (sentence.contains(word)){

            count++;
        }
        System.out.println("count = " + count);

    }
}

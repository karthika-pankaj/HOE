import java.util.Scanner;

public class WordLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int length = word.length();
        System.out.println("Length of the word '" + word + "' is: " + length);

        scanner.close();
    }
}

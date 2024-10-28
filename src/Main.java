import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuffer textBuffer;
        String[] words;

        try (Scanner scanner = new Scanner(System.in)) {
            // Input text with validation
            textBuffer = TextUtils.inputText(scanner);

            // Input words array with validation
            words = TextUtils.inputWords(scanner);

            // Perform the analysis
            int[] occurrences = TextUtils.countWordOccurrencesInSentences(textBuffer, words);

            // Output the results
            for (int i = 0; i < words.length; i++) {
                System.out.println("Word '" + words[i] + "' occurs in " + occurrences[i] + " sentences.");
            }

        } catch (Exception e) {
            System.err.println("An error occurred during text analysis: " + e.getMessage());
        }
    }
}
public class TextUtils {
    public static int[] countWordOccurrencesInSentences(StringBuffer textBuffer, String[] words) {
        if (textBuffer == null || words == null) {
            throw new IllegalArgumentException("Text or words array cannot be null.");
        }

        // Split text into sentences
        StringBuffer[] sentences = splitTextIntoSentences(textBuffer);

        int[] occurrences = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuffer wordBuffer = new StringBuffer(words[i]);
            int count = 0;
            for (StringBuffer sentence : sentences) {
                if (sentenceContainsWord(sentence, wordBuffer)) {
                    count++;
                }
            }
            occurrences[i] = count;
        }

        return occurrences;
    }

    private static boolean sentenceContainsWord(StringBuffer sentenceBuffer, StringBuffer wordBuffer) {
        StringBuffer[] sentenceWords = splitSentenceIntoWords(sentenceBuffer);
        for (StringBuffer w : sentenceWords) {
            if (equalsStringBuffers(w, wordBuffer)) {
                return true;
            }
        }
        return false;
    }

    private static StringBuffer[] splitTextIntoSentences(StringBuffer textBuffer) {
        int length = textBuffer.length();
        int start = 0;
        java.util.List<StringBuffer> sentences = new java.util.ArrayList<>();

        for (int i = 0; i < length; i++) {
            char c = textBuffer.charAt(i);
            if (c == '.' || c == '!' || c == '?') {
                int end = i + 1; // Include the delimiter
                StringBuffer sentence = new StringBuffer();
                sentence.append(textBuffer, start, end);
                sentences.add(sentence);
                // Skip any whitespace after the delimiter
                start = end;
                while (start < length && Character.isWhitespace(textBuffer.charAt(start))) {
                    start++;
                }
                i = start - 1;
            }
        }
        // Add the last sentence if any
        if (start < length) {
            StringBuffer sentence = new StringBuffer();
            sentence.append(textBuffer, start, length);
            sentences.add(sentence);
        }

        return sentences.toArray(new StringBuffer[0]);
    }

    private static StringBuffer[] splitSentenceIntoWords(StringBuffer sentenceBuffer) {
        java.util.List<StringBuffer> words = new java.util.ArrayList<>();
        int length = sentenceBuffer.length();
        int start = 0;

        while (start < length) {
            // Skip any non-word characters
            while (start < length && !Character.isLetterOrDigit(sentenceBuffer.charAt(start))) {
                start++;
            }
            if (start >= length) {
                break;
            }
            // Find end of the word
            int end = start;
            while (end < length && Character.isLetterOrDigit(sentenceBuffer.charAt(end))) {
                end++;
            }
            // Extract word as StringBuffer
            StringBuffer wordBuffer = new StringBuffer();
            wordBuffer.append(sentenceBuffer, start, end);
            words.add(wordBuffer);
            start = end;
        }

        return words.toArray(new StringBuffer[0]);
    }

    private static boolean equalsStringBuffers(StringBuffer sb1, StringBuffer sb2) {
        if (sb1.length() != sb2.length()) {
            return false;
        }
        for (int i = 0; i < sb1.length(); i++) {
            if (sb1.charAt(i) != sb2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

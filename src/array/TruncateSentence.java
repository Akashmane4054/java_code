package array;

public class TruncateSentence {
    public static String truncate(String s, int k) {
        if (s == null || s.isEmpty() || k <= 0) {
            return "";
        }

        String[] words = s.split(" ");
        StringBuilder truncatedSentence = new StringBuilder();

        for (int i = 0; i < Math.min(k, words.length); i++) {
            truncatedSentence.append(words[i]);
            if (i < k - 1) {
                truncatedSentence.append(" ");
            }
        }

        return truncatedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "This is a sample sentence that needs to be truncated";
        int k = 5;
        String truncated = truncate(sentence, k);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Truncated Sentence: " + truncated);
    }
}

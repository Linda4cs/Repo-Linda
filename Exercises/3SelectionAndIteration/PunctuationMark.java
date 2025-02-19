public class PunctuationMark {
    public static void main(String[] args) {

        String text = "“Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went, the lamb was sure to go. -that was a nice poem- the end.";

        int punctuationCount = countPunctuationMarks(text);
        System.out.println("Number of punctuation marks: " + punctuationCount);
    }

    public static int countPunctuationMarks(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            if (isPunctuation(c)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPunctuation(char c) {
        return c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '-' || c == '\'' || c == '\"';
    }
}

package Strings;

public class RemoveVowels {
    public static String removeVowels(String str) {
        // Use regular expression to remove vowels
        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String result = removeVowels(input);
        
        System.out.println("Original String: " + input);
        System.out.println("String without Vowels: " + result);
    }
}

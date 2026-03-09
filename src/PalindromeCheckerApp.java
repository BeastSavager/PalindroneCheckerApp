/**
 * ==========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * @author Developer
 * @version 2.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        boolean isPalindrome = true;
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}
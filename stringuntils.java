```java
public class StringUtils {

    // Reverse a string
    public static String reverse(String input) {
        if (input == null) {
            return "";
        }

        return new StringBuilder(input).reverse().toString();
    }

    // Count vowels
    public static int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        return input.toLowerCase()
                    .replaceAll("[^aeiou]", "")
                    .length();
    }

    // Check palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleaned = input.toLowerCase()
                              .replaceAll("[^a-z0-9]", "");

        return cleaned.equals(
            new StringBuilder(cleaned).reverse().toString()
        );
    }
}
```
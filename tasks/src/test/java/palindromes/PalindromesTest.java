package palindromes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromesTest {

    @Test
    void isPalindrome() {
        Palindromes palindromes = new Palindromes();
        boolean shouldTrue = palindromes.isPalindrome("Madam");
        boolean shouldFalse = palindromes.isPalindrome("Hello");

        Assertions.assertAll(
                () -> Assertions.assertTrue(shouldTrue),
                () -> Assertions.assertFalse(shouldFalse)
        );
    }
}
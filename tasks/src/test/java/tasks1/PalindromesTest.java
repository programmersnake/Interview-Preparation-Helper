package tasks1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {

    @Test
    void isPalindrome() {
        Palindromes palindromes = new Palindromes();
        boolean shouldTrue = palindromes.isPalindrome( "Madam" );
        boolean shouldFalse = palindromes.isPalindrome( "Hello" );

        Assertions.assertAll(
                () -> Assertions.assertEquals( true, shouldTrue ),
                () -> Assertions.assertEquals( false, shouldFalse )
        );
    }
}
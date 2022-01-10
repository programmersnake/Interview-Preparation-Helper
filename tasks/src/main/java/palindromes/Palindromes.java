package palindromes;

public class Palindromes {
    /**
     * Without influence difference lower/upper cases
     *
     * @param inputString any text
     * @return palindrome or not
     */
    public boolean isPalindrome(String inputString) {
        byte[] bytes = inputString.toLowerCase().getBytes();
        for (int i = 0; i <= bytes.length / 2; i++) {
            if (bytes[i] != bytes[bytes.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}

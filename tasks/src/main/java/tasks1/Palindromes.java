package tasks1;

public class Palindromes {
    // without case influence
    public boolean isPalindrome(String inputString) {
        byte[] bytes = inputString.toLowerCase().getBytes();
        for(int i = 0; i<=bytes.length/2; i++) {
            if(bytes[i]!=bytes[bytes.length-1-i]) {
                return false;
            }
        }
        return true;
    }

}

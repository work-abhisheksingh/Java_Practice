class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {  // negative integers are not palindromes
            return false;
        } else if (x < 10) {  // single digits are palindromes
            return true;
        } else if (x % 10 == 0) {  // integers ending with 0 are not palindromes
            return false;
        } else {
            int rev = 0;
            while (x > rev) {
                rev = rev * 10 + x % 10;
                x /= 10;
            }
            return x == rev || x == rev / 10;
        }
    }
}

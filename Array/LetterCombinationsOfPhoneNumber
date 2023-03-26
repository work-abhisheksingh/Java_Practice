class Solution {
    private static final String[] LETTERS = {
        "",     // digit 0
        "",     // digit 1
        "abc",  // digit 2
        "def",  // digit 3
        "ghi",  // digit 4
        "jkl",  // digit 5
        "mno",  // digit 6
        "pqrs", // digit 7
        "tuv",  // digit 8
        "wxyz"  // digit 9
    };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        letterCombinationsHelper(digits, 0, "", result);
        return result;
    }
    
    private void letterCombinationsHelper(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        int digit = digits.charAt(index) - '0';
        for (int i = 0; i < LETTERS[digit].length(); i++) {
            char letter = LETTERS[digit].charAt(i);
            letterCombinationsHelper(digits, index + 1, current + letter, result);
        }
    }
}

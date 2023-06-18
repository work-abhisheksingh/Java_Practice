class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n <= 0) {
            return result;
        }
        generateParenthesisHelper(n, 0, 0, "", result);
        return result;
    }
    
    private void generateParenthesisHelper(int n, int openCount, int closeCount, String current, List<String> result) {
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }
        if (openCount < n) {
            generateParenthesisHelper(n, openCount + 1, closeCount, current + "(", result);
        }
        if (closeCount < openCount) {
            generateParenthesisHelper(n, openCount, closeCount + 1, current + ")", result);
        }
    }
}

class Solution {
    public int strStr(String haystack, String needle) {
    if (needle.isEmpty()) {
        return 0; // if needle is empty, return 0 as it's always present at the beginning of haystack
    }
    int m = haystack.length(), n = needle.length();
    if (n > m) {
        return -1; // if needle is longer than haystack, it cannot be present in haystack
    }
    for (int i = 0; i <= m - n; i++) {
        int j = 0;
        while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
            j++;
        }
        if (j == n) {
            return i; // if needle is found in haystack, return the starting index of the first occurrence
        }
    }
    return -1; // if needle is not found in haystack, return -1
}

}

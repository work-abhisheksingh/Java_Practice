class Solution {
    int missingNumber(int array[], int n) {
    int totalSum = (n * (n + 1)) / 2; // Sum of all elements from 1 to N
    
    int arraySum = 0;
    for (int num : array) {
        arraySum += num;
    }
    
    return totalSum - arraySum;
}

}

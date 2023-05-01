class Solution {
    public double average(int[] salary) {
        // Sort the salary array in ascending order
        Arrays.sort(salary);
        
        int n = salary.length;
        double sum = 0;
        
        // Calculate the sum of salaries excluding the minimum and maximum salaries
        for (int i = 1; i < n-1; i++) {
            sum += salary[i];
        }
        
        // Return the average of the sum
        return sum / (n-2);
    }
}


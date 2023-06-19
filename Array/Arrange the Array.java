class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        RearrangePosNeg(a, 0, n - 1); 
    }
    // Function to Rearrange positive and negative 
    // numbers in a array 
    public void RearrangePosNeg(int arr[], int l, int r)
    { 
        if (l < r) { 
            // Same as (l+r)/2, but avoids overflow for 
            // large l and h 
            int m = l + (r - l) / 2; 
      
            // Sort first and second halves 
            RearrangePosNeg(arr, l, m); 
            RearrangePosNeg(arr, m + 1, r); 
      
            merge(arr, l, m, r); 
        } 
    }
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    public void merge(int arr[], int l, int m, int r) 
    { 
        int i = l; // Initial index of 1st subarray 
        int j = m + 1; // Initial index of IInd 
      
        while (i <= m && arr[i] < 0) 
            i++; 
          
        // arr[i..m] is positive 
          
        while (j <= r && arr[j] < 0) 
            j++; 
          
        // arr[j..r] is positive 
          
        // reverse positive part of left sub-array (arr[i..m]) 
        reverse(arr, i, m); 
          
        // reverse negative part of right sub-array (arr[m+1..j-1]) 
        reverse(arr, m + 1, j - 1); 
          
        // reverse arr[i..j-1] 
        reverse(arr, i, j - 1); 
    }
    public void reverse(int arr[], int l, int r) 
    { 
        if (l < r) { 
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            reverse(arr, ++l, --r); 
        } 
    }
}

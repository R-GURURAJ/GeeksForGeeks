class Solution {
    /**
     * count the max zero in an sub array 
     * if the 1 is max then store the current count in max_val then make it 0
     * return the max 0 in the sub array and the  number of 1
    */
    public static int maxOnes(int a[], int n) {
        // Your code goes here
        int cur_sum = 0;
        int max_sum = 0;
        int one_so_far = 0;
        for(int i = 0; i<n;i++){
            if(a[i] == 0){ cur_sum++; }
            if(a[i] == 1){ cur_sum--; one_so_far++; }
            if(max_sum<cur_sum){ max_sum = cur_sum; }
            if(cur_sum < 0){ cur_sum = 0; }
        }
        return (max_sum + one_so_far);
    }
}
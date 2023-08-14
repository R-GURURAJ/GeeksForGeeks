/**
 * nth_Fibonacci_Number
 */
public class nth_Fibonacci_Number {

    class Solution {
        static int nthFibonacci(int n){
            int arr[] = new int[n+1];
            arr[0]=0;
            arr[1]=1;
            
            for(int i = 2;i<n+1;i++){
                arr[i] = (arr[i-1]+arr[i-2])%1000000007;
            }
            return arr[n];
        }
    }
}
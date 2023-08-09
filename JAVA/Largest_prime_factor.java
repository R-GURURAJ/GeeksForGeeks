import java.util.*;

/**
Input:
N = 5
Output:
5
Explanation:
5 has 1 prime factor i.e 5 only.
 */

class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        Set <Integer> a =new  TreeSet<>();
        a.add(1);
        for(int i = 2; i*i <= N; i++){
            if(N%i==0){
                a.add(i);
                a.add(N/i);
            }
        }
        a.add(N);
        ArrayList<Integer> arr = new ArrayList<>(a);
        for(int i = arr.size()-1;i>=0;i--){
            int flag = 1;
            for(int j =2;j*j<=arr.get(i);j++){
                if(arr.get(i)%j==0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                return arr.get(i);
            }
            
        }
        return N;
    }
}
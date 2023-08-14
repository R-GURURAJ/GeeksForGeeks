import java.util.*;
class Solution
{
    public int[] singleNumber(int[] arr)
    {
        Map<Integer,Integer> a= new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(a.containsKey(arr[i])){
                a.put(arr[i],a.get(arr[i])+1);
            }else{
                a.put(arr[i],1);
            }
        }
        
        int ar[] = new int[2];
        int c = 0;
        for(int i =0;i<arr.length;i++){
            if(a.get(arr[i]) == 1){
                ar[c++] = arr[i];
            }
            if(c==2){
                break;
            }
        }
        
        if(ar[0]>ar[1]){
            int t = ar[1];
            ar[1] = ar[0];
            ar[0] = t;
        }
        return ar;
    }
}
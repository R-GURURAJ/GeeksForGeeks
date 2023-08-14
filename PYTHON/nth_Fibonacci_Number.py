
class Solution:
    def nthFibonacci(self, n : int) -> int:
        # code here
        arr = []
        arr.append(0)
        arr.append(1)
        for i in range(2,n+1):
            arr.append((arr[i-1]+arr[i-2])%1000000007)
        return arr[n]%1000000007
        
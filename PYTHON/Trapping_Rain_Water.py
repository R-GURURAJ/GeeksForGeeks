"""
Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
"""
class Solution:
    def trappingWater(self, arr,n):
        s=0
        rigMax = max(arr[2:])
        lefMax = arr[0]
        for i in range(1,n-1):
            if arr[i]>lefMax:
                lefMax = arr[i]
            
            if arr[i] == rigMax :
                rigMax = max(arr[i+1:])
            if lefMax<rigMax:
                mini = lefMax
            else:
                mini = rigMax
            
            diff = mini -arr[i]
            if diff>0:
                s+=diff
        return s
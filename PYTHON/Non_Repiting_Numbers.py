def singleNumber(self, nums):
    dit ={}
    for i in list(nums):
        if i in dit:
            dit[i] += 1
        else:
            dit[i] = 1
    ans = []
    c = 0
    for i in dit:
        if dit[i] == 1:
            if c==2:
                break
            c+=1
            ans.append(i)
            
    ans.sort()
    return ans
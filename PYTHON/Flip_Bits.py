class Flip_Bits:
    def maxOnes(self, a, n):
        for i in range(n):
            if a[i] == 1:
                a[i] = -1
            elif a[i] == 0:
                a[i] = 1
            
        s = 0
        max_here = 0
        ori_ones = 0
        for i in range(n):
            s = s + a[i]
            if a[i] == -1:
                ori_ones +=1
            if s < 0:
                s = 0
            if s > max_here:
                max_here = s

        return max_here + ori_ones
class PerfectNumbers:

    def findPerfectNumber(self,n):
        ans_ls = []

        for i in range(1,n+1):
            temp_ls = []
            for j in range(1,i+1):
                if i % j == 0 : 
                    temp_ls.append(j)
            if sum(temp_ls) == (i*2):
                ans_ls.append(i)
        return ans_ls

perfectNumbers = PerfectNumbers()
ans_ls = perfectNumbers.findPerfectNumber(100)
print("Completed")
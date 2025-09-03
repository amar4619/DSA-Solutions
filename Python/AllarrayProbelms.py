from typing import Counter


class ArrayProblem:
    
    def duplicate_elements_in_list(self,ls):
        
        r_dict = Counter(ls)
        r_ans = []
        for key,val in r_dict.items():
            if r_dict[key] > 1 :
                r_ans.append(key)
        return r_ans

    def remove_duplicate_by_comprehension(self,ls):
        return [ls[i] for i in range(len(ls)) if ls[i] not in ls[:i]]
    
    def find_missing_element(self,ls):
        n = len(ls) + 1
        val = (n*(n+1))//2
        sum_ls = sum(ls)
        missing_val = val - sum_ls
        return missing_val

    def max_min_val(self,ls):
        return max(ls),min(ls)
    
    def rotate_ls(slef,ls,k):
        r_ls = [0 for _ in range(len(ls))]
        for i,val in enumerate(ls):
            if i < k :
                r_ls[len(ls)-1-k+i+1] = ls[i]
            else : 
                r_ls[(i//k)-1] = ls[i]
        return r_ls
    
    def merge_sorted_ls(self,ls1,ls2):
        i=0
        j=0
        ans_ls = []
        while i < len(ls1) and j < len(ls2):
            if ls1[i] > ls2[j]:
                ans_ls.append(ls2[j])
                j+=1
            else:
                ans_ls.append(ls1[i])
                i+=1
        for k in range(i,len(ls1)):
            ans_ls.append(ls1[k])

        for k in range(j,len(ls2)):
            ans_ls.append(ls2[k])
        
        return ans_ls


array_problem = ArrayProblem()
ls = [4,1,1,2,3,4]
# print(array_problem.duplicate_elements_in_list(ls))
# print(array_problem.remove_duplicate_by_comprehension(ls))
# print(array_problem.find_missing_element([1,2,3,5]))
# print(array_problem.max_min_val([1,2,3,5]))
# print(array_problem.rotate_ls([1,2,3,5],2))
print(array_problem.merge_sorted_ls([1,2,3,5],[2,4,6,8,9]))
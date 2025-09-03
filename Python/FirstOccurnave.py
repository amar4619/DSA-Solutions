

def forst_non(str):

        dict_O = {}

        for i in range(len(str)):
            # if dict_O.get(str[i]) is None:
            #     dict_O[str[i]] = 0
            dict_O[str[i]] = dict_O.get(str[i],0) +1
        
        for i in range(len(str)):
            if dict_O.get(str[i]) == 1:
                return str[i]
            
# firstOccure = FirstNonRepesting()
print(forst_non("swiss"))

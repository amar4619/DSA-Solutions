from collections import deque
class Strings:

    str = ''
    def __init__(self,str):
        print("I am Strings class")
        self.__class__.str = str
    
    @staticmethod
    def check_pallindrome(str):
        new_str = str[::-1]
        return str == new_str
    
    def first_occurence(self,str):
        q =  []
        s = set()
        for i in range(len(str)-1,-1,-1):
            if str[i] not in s  :
                s.add(str[i])
                q.append(str[i])
        return q[len(q)-1]
    
    @classmethod
    def frequency_of_char(cls):
        dict = {}
        for c in cls.str :
            dict[c] = dict.get(c, 0) +1
        for key,value in dict.items():
            print(f"Char {key} : {value}")



strings = Strings("hiiiih")
str = "valav"
print(strings.check_pallindrome(str))

print(strings.first_occurence(str))
print(strings.frequency_of_char())

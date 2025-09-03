def FirstNonRepeatingChar(str):
    set1 = []
    for c in str:
        if c in set1:
            return c
        else:
            set1.append(c)

str = input("enter the string  :  ")
print(FirstNonRepeatingChar(str))
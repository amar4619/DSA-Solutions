def reverse_string(str):
    return str[::-1]

def reverse_string_w(str):
    ns = []
    for i in range(len(str)-1,-1,-1) :
        ns.append(str[i])
    return "".join(ns)
str = "abc"
print(reverse_string(str))
print(reverse_string_w(str))
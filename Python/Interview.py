# reverse the keys and values in a dictionary
# input - d = {"a":1, "b":2, "c":3}
# output - d = {1: "a", 2: "b", 3: "c"}

def reverse(d):
    dict1 = {}
    for key,val in d.items():
        if dict1.get(val) is not None:
            ar = [dict1.get(val),key]
            dict1[val] = ar
        else:
             dict1[val] = key
    return dict1

d =  {"a":1, "b":2, "c":3, "d": 2,  "e": 3}
# dict["a"] = 1
# dict["b"] = 2
# dict["c"] = 3
print(reverse(d))

# output - d = {1: "a", 2: ["b","d"], 3: ["c","e"]}
# input - d = {"a":1, "b":2, "c":3, "d": 2,  "e": 3}
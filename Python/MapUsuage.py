#Syntax map(function,iterable)

ar1 = [1,2,3]
ar2 = [4,5,6]

ar3 = map(lambda x,y: x+y,ar1,ar2)
print(list(ar3))
def bubble_sort(ar):


    for i in range(len(ar)):
        for j in range(len(ar)-i-1):
            if(ar[j]>ar[j+1]):
                ar[j],ar[j+1] = ar[j+1],ar[j]
    return ar

ar = [1,2,3,6,5]
print(bubble_sort(ar))
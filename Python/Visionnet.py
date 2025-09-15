# ["Regex", "Ashwin", "Adhi", "ASHWIN", "Balu", "BARATH", "Deisy","Abilash"]

from numpy import sort


def sort_array(ar):
    set_val = {x.lower() for x in ar}
    # sort(set_val)s
    print(sorted(set_val))


print(sort_array(["Regex", "Ashwin", "Adhi", "ASHWIN", "Balu", "BARATH", "Deisy","Abilash"]))
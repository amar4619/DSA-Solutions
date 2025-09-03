class Test:
    def __init__(self,name,val):
        self.name = name
        self.val = val

    def test_comperhension(self,ls):
        res = [x for x in ls if x%2 == 0]
        return res


test = Test("Amar","Learn")
# print(f'{test.name}  {test.val}')
print(test.test_comperhension([1,3,5,6]))
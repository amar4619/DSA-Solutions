class Stack:

    def __init__(self):
        self.__stk = []

    def push(self,val):
        self.__stk.append(val)

    def pop(self):
        val = self.__stk[len(self.__stk)-1]
        self.__stk.remove(self.__stk[len(self.__stk)-1])
        return val
    
stk = Stack()
stk.push(10)
stk.push(30)
stk.push(20)
stk.pop()
stk.pop()
stk.push(20)
stk.push(20)
stk.pop()
stk.pop()
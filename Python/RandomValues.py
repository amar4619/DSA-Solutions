

import random
import string


class Random:

    @staticmethod
    def gen_random_value(n,val):
        match val:
            case 'str': 
                return ''.join(random.choices(string.ascii_lowercase.upper(),k=n))
            case 'num': 
                return ''.join(random.choices(string.digits,k=n))
            case _: print("Hi")
    
print(Random.gen_random_value(5,"str"))
print(Random.gen_random_value(5,"num"))
print(Random.gen_random_value(5,"nu"))
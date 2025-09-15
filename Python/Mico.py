# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
import re
import requests

class TestApi:
    
    def check_status_code(self):
        res = requests.get("https://jsonplaceholder.typicode.com/users/1")
        if(res.status_code == 200):
            print(f"Status is right  {res.json()}")
        data = res.json()
        email = data['email']
        print(email)
        val = re.findall("[A-Za-z0-9]+@[A-Za-z0-9]+\.[A-Za-z]{2,3}",email)
        print(f" values are {val}")


testApi = TestApi()
testApi.check_status_code()
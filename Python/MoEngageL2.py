

import json
import requests


class APITest:
    
    def rate_limit_test(self,n):
        url = "https://api.agify.io/?name[]=johnson&name[]=bakshi"
        for i in range(n+1):
           res =  requests.get(url)
           val = res.json()
           print(i)
           if res.status_code != 200 :
               return res.status_code
    
    def rate_limit_test_1(self,n,name_ls):
        url = f"https://api.agify.io/?name[]={name_ls[0]}&name[]={name_ls[1]}"
        for i in range(n+1):
           res =  requests.get(url)
           val = res.json()
           print(res)
           if res.status_code != 200 :
               return res
           


apiTest = APITest()
ls = ['sharma','singh','biradar','rathore','pawar']
for i in range(len(ls)-1):
    res = apiTest.rate_limit_test_1(100,[ls[i],ls[i+1]])
    assert res.status_code == 200
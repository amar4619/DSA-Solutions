#https://dummyjson.com/c/66a2-822a-4d31-9843
import json
import requests

res = requests.get("https://dummyjson.com/c/66a2-822a-4d31-9843")
list = json.loads(res.text)
reslist = []
for val in list:
    reslist.append(val["id"])

print(reslist)
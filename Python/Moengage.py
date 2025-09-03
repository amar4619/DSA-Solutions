import json
import requests


class ApiMimic:

    def call_get(self,url):
        

        res = requests.get(url)
        dict_val = json.loads(res.text)
        return dict_val["status"]
    

    def conversion_time(self,time):
        time_val = time.split()
        if time_val[1] == "PM":
            time_val_h = time_val[0].split(":")
            if(int(time_val_h[0]) < 12): 
            
             new_time = int(time_val_h[0]) + 12
             return f'{new_time}:{time_val_h[1]}'
            else:
                return time.split()[0]
        else:
            return time.split()[0]


api = ApiMimic()
# val = api.call_get("https://sanity-test.free.beeceptor.com/data1")

# if val:
#     val = api.call_get("https://sanity-test.free.beeceptor.com/data2")
# else:
#     val = api.call_get("https://sanity-test.free.beeceptor.com/data3")

print(api.conversion_time("12:15 AM"))

from cgitb import small
prabal =[29,54,14,12,7]
smallestvalue = None

for val in prabal:
    if(smallestvalue is None or val<smallestvalue):
        smallestvalue = val
        print("THE SMALLEST VALUE HERE IS ~~~",)

count = 0
print('Value Before Count ~~~',count)
count +=1
print('Value After Count ~~~',count)

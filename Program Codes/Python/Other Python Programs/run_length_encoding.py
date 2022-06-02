'''
PRABAL MANHAS 20BCS4513
20BIT-1/A
'''
from itertools import groupby

def prabals_encoded_list(mylist):
        def create(elm):
            if len(elm)>1: return [len(elm), elm[0]]
            else: return elm[0]
        return [create(list(grouplist)) for key, grouplist in groupby(mylist)]

print("\n\t\t>>>> PRABAL MANHAS | 20BCS4513 | SOL 5 <<<<\n")
print("------------------------------------------------------")

myinputlist = [1, 1, 2, 3, 4, 4, 5, 1]
print("\n> MY ORIGINAL LIST = \n",myinputlist) 
print("\n> MY LIST AFTER REFLECTING THE RUN-LENGTH ENCODING FROM THE INPUT LIST = \n",prabals_encoded_list(myinputlist))

myinputlist = "aabcddddadnss"
print("\n> MY ORIGINAL INPUT STRING = \n",myinputlist)

print("\n> MY LIST AFTER REFLECTING THE RUN-LENGTH ENCODING FROM THE INPUT LIST = \n",prabals_encoded_list(myinputlist))
print("------------------------------------------------------")

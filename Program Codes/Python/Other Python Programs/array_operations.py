'''
PRABAL MANHAS
04/03/2022
'''
from array import*

inputarray = array('b',[2,4,6,8])

for b in inputarray:
    print("> THE PRESENT ELEMENTS IN ARRAY ARE:-",b)
#printing the original input element of the array

#fetching the individual elements of the array using index
print("\n")
print("> ELEMENT AT INDEX 0 :",inputarray[0])
print("> ELEMENT AT INDEX 1 :",inputarray[1])
print("> ELEMENT AT INDEX 2 :",inputarray[2])
print("> ELEMENT AT INDEX 3 :",inputarray[3])

#appending the array , here i am adding 29 at the end of array using append
print("\n")
print("> NOW APPENDING 29 AT THE END~~~~~~~~~")
inputarray.append(29)

print("> ARRAY AFTER APPENING AT LAST --->",inputarray)

#Reversing the array
inputarray.reverse()
print("> THE ARRAY AFTER REVERSING IS --->",inputarray)


#calculating the size in bytes
print("\n")
print("> THE LENGHT (IN BYTES) --->",inputarray.itemsize)
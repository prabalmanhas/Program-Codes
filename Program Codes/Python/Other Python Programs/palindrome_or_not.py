'''
PRABAL MANHAS
28/02/2022
PYTHON LAB
SUBMITTED TO - RAJAT TIWARI MAM
'''


print("~~~~~~~~~~~ PRABAL MANHAS | WORKSHEET 1.3 | 20BCS4513 ~~~~~~~~~~~\n")

#take input string from the user
inputstring = input("ENTERED YOUR STRING: \n")

#print the entered string
print("YOUR ENTERED STRING: \n",inputstring)

#Reversing the original string and string it in a variable named "reversingthestring"
reversingthestring = reversed(inputstring)


#making use of if/else conditional statements

#if the input string is equal to the reversed string, then print yes its a palindrome
if list(inputstring) == list(reversingthestring):
   
   print("YES! ITS A PALINDROME ✅")

#if the input string is not equal to the reversed string, then print no its not a palindrome
else:
   print("NO! ITS NOT A PALINDROME ❌")

'''********************   THANKYOU  ************************'''

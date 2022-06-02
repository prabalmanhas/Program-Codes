#TASK 3-Write a program to check if two strings are balanced. For example, strings s1 and s2 are balanced if all the characters in the s1 are present in s2. The character’s position doesn’t matter. 
print("<---- PRABAL MANHAS | 20BCS4513 | WS ALLOTTED - 5 ---->")

# defining a function task3_prabal

def task3_prabal(string1, string2):

#initially setting the condition of program to true by using flag so it will run for loop and check the both strings
    
    flag = True
    for char in string1:
# if string1 found in string 2 then continue the program to other block
        if char in string2:
            continue
        else:
# if string 1 not found in string 2 return the false flag value
            flag = False
    return flag

print("\n****FOR BALANCED CASE****\n")
string1 = "Prabal"
# storing string "Prabal" in variable string1
string2 = "PrabalManhas"
# storing string "PrabalManhas" in variable string2
flag = task3_prabal(string1, string2)
# now using flag for comparing both the strings
# if string 1 found in 2 return true flag value = BALANCED STRING otherwise UNBALANCED
print("\nSTRING 1 & STRING 2 ARE BALANCED ?\n RESULT -->\n", flag)

print("\n****FOR UNBALANCED CASE****\n")
string1 = "I am"
# storing string "I am" in variable string1
string2 = "Prabal"
# storing string "Prabal" in variable string2
flag = task3_prabal(string1, string2)
# now using flag for comparing both the strings
print("\nSTRING 1 & STRING 2 ARE BALANCED ?\n RESULT -->", flag)
# if string 1 found in 2 return true flag value = BALANCED STRING otherwise UNBALANCED
print("\nCLASS - 20IOT GROUP-A")

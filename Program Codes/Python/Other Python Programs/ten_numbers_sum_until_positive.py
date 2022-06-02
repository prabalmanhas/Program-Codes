'''
Prabal Manhas 20BCS4513
Python Lab MST
Worksheet allotted - 5
'''

print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
print("\t\t< PRABAL MANHAS WS 5 PYTHON LAB MST >")
print("Program to find the sum of ten numbers until a positive number is entered")
print("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n")

#storing the initial sum in variable initialsum_20BCS4513
initialsum_20BCS4513 = 0

print("<--- ENTER THE 10 +ve NUMBERS FOR THE SUM --->\n")

#making use of for loop to iteration
for i in range(1, 11):
    enterednumber = int(input("< NUMBER ENTERED %d > " %i))
#taking input from user for the number they want to print sum
    if enterednumber < 0:
        break
#if a number entered is negative then break
    initialsum_20BCS4513 = initialsum_20BCS4513 + enterednumber
#iterate the initial sum and add all the positive entered numbers in the variable 
print("<--- THE SUM OF NUMBERS UNTIL YOU ENTERED THE +ve NUMBERS IS ---> = ", initialsum_20BCS4513)
#finally print the final sum on the output console
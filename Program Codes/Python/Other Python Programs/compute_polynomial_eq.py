'''Author - Prabal Manhas
Dated - 22/02/2022
Subject - Program in Python Lab
Submitted To - Rajat Tiwary Mam'''

#importing the math function for carrying out several 
#arithmetic operations such as *math.pow in my case
import math

#using print statement to print the entered strings on execution.
print("PRABAL 20BCS4513")
print("ENTER YOUR COEFFICIENTS IN THE GIVEN FORM: ax^3 + bx^2 + cx + d")

#creating a list for storing the entered coefficients
list=[]

#using for and while loops for calculating the value of first 3 terms of polynomial
for r in range(0,4):

#using input function to take the coefficient values as an input from the user
    
    coef = int(input("<---- ENTER YOUR COEFFICIENT VALUE: ---->\n"))
    list.append(coef)

#using input function to take the value of X as an input from the user
x=int(input("ENTER X: "))

#storing the resultant value in a variable named as 'resultsum'
resultsum=0

y=3

for r in range(0,3):
    while(y>0):

        resultsum = resultsum + (list[r]*math.pow(x,y))
        break

    y = y-1

resultsum = resultsum + list [3]

#print the final polynomial value as an output on the terminal...
print("<--------THE VALUE OF POLYNOMIAL IS:",resultsum,"-------->")
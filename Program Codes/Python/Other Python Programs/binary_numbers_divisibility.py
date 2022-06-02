print("Hello Welcome to my program, ~ Prabal Manhas 20BCS4513")
print("\n")
str = str(input("Enter the sequence of 4-digit binary number separated by ','\n"))

#breaking the input statement now 
# and further creating a list of entered 4-digit binary numbers 

list = str.split(",")
newlist = []
for x in list:
    if not int(x,2)%5:
        newlist.append(x)
print("\n")
print("The Entered Binary Numbers which are Divisible by 5 are given below:")
print(','.join(newlist))



print(">>> PRABAL MANHAS PYTHON ASSIGNMENT <<<\n")
print(">>>> Welcome to my Program <<<<")

string=input("ENTER YOUR STRING --->\n")

counter1=0
counter2=0

for prabal in string:
      if(prabal.isdigit()):
            counter1=counter1+1
      counter2=counter2+1
      
print("THE NUMBER OF DIGITS IN YOUR STRING ARE:", counter1)
print("THE NUMBER OF LETTERS IN YOUR STRING ARE:",counter2)
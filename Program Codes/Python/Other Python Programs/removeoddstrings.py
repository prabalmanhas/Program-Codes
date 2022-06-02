'''
Prabal Manhas
25/02/2022
'''
#using condition statements

print("*****PRABAL MANHAS 20BCS4513*****")
stringinput = input("ENTER YOUR STRING: ") 
#here I amtaking input from user

stringoutput = ""
#storing the output on variable stringoutput
result = int(input("<-- ENTER 1 FOR REMOVING ODD PLACES -->\n"+"<-- ENTER 2 FOR REMOVING EVEN PLACES -->\n"))


if result == 1:
    print (" <--- YOUR STRING WITH ODD PLACES REMOVED --->")
    for i in range(len(stringinput)):
     if i%2 != 0:
         stringoutput = stringoutput + stringinput[i]


elif result == 2:
  print ("<--- YOUR STRING WITH EVEN PLACES REMOVED --->")
  for i in range(len(stringinput)):
    if i%2 == 0:
      stringoutput = stringoutput + stringinput[i]


print (stringoutput)
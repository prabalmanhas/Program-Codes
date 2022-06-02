'''
PRABAL MANHAS 20BCS4513
20BIT-1/A
'''
print(">>>> PRABAL MANHAS | 20BCS4513 | SOL 4 <<<<\n")
print("PROGRAM TO PRINT THE INDEX OF THE CHARACTER IN A STRING\n")
print("-------------------------------------------------------------\n")

inputstring = input(">> ENTER YOUR STRING :")

for indexofcharacter, character in enumerate(inputstring):

    print("THE CURRENT CHARACTER >",character, "IS PRESENT AT POSITION", indexofcharacter)
    
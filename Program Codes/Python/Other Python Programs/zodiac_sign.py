print(">>>>>WELCOME TO MY PROGRAM<<<<<")
yearofbirth = int(input(">>PLEASE ENTER YOUR YEAR OF BIRTH, PRABAL<<\n"))


if (yearofbirth - 2000) % 12 == 0:
    zodiacsign = '> DRAGON'
elif (yearofbirth - 2000) % 12 == 1:
    zodiacsign = '> SNAKE'
elif (yearofbirth - 2000) % 12 == 2:
    zodiacsign = '> HORSE'
elif (yearofbirth - 2000) % 12 == 3:
    zodiacsign = '> SHEEP'
elif (yearofbirth - 2000) % 12 == 4:
    zodiacsign = '> MONKEY'
elif (yearofbirth - 2000) % 12 == 5:
    zodiacsign = '> ROOSTER'
elif (yearofbirth - 2000) % 12 == 6:
    zodiacsign = '> DOG'
elif (yearofbirth - 2000) % 12 == 7:
    zodiacsign = '> PIG'
elif (yearofbirth - 2000) % 12 == 8:
    zodiacsign = '> RAT'
elif (yearofbirth - 2000) % 12 == 9:
    zodiaczodiacsign = '> OX'
elif (yearofbirth - 2000) % 12 == 10:
    zodiaczodiacsign = '> TIGER'
else:
    zodiacsign = '> HARE'

print("PRABAL, YOUR ZODIAC SIGN IS ",zodiacsign)
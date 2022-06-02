from re import sub
from shutil import get_archive_formats


import re
givenstring="Hello. Hello everyone. I am saying Hello"
substring="Hello"

print("THE INPUT SUBSTRING IS >>",givenstring)
print("THE STRING TO SEARCH FOR IS >>",substring)

try:
    prabalsactivity= [i.start() for i in re.finditer(substring, givenstring)]
    print("THE INDEX 'Hello' is PRERSENT AT INDEX LOCATIONS >>>" + str(prabalsactivity))
except ValueError:
    print("THERE IS NO STRING 'Hello' PRESENT IN GIVEN STRING")
    print('''PRABAL MANHAS 20BCS4513
    \tPYTHON ACTIVITY''')
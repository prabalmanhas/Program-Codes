print(".......................................")
print('''Program to Trace Birthday of a Person using Split & Join Methods
\t Prabal Manhas 20BCS4513
\tExperiment Worksheet 4''')
print(".......................................")

prabalbday = input("<< PLEASE ENTER YOR DATE OF BIRTH >> \n")

exp4 = prabalbday.split("~")

birthdate="/".join(exp4)
bdaydict={"birthday":birthdate
 }
if "birthday" in bdaydict:
    print("YOUR BIRTHDAY IS ON > \n")
    print(bdaydict["birthday"]) 

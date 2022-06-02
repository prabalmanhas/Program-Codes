# ADDITION PROGRAM 20BCS4513

# Inputting the int and float value

val1_int = (input('ENTER THE 1ST NO.\n'))
print(type(val1_int))

val2_float = (input ('ENTER THE 2ND NO.\n'))
print(type(val2_float))

# Also making use of is and is not
 
print(val1_int is not val2_float)
print(val1_int is val2_float)

# to show type conversion

finalsum = float(val1_int) + float(val2_float)

print ("<-----The sum of these two numbers is: ----->\n", finalsum)
print ("The type of the finalsum is:",type(finalsum))
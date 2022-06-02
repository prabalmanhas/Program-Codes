'''
PRABAL MANHAS 20BCS4513
20BIT-1/A
'''
print(">>>> PRABAL MANHAS | 20BCS4513 | SOL 3 <<<<\n")
print('Program to Sort a Tuple List in Increasing Order\n')

def last(n):
    return n[-1]  

# ENTERING THE INPUT TUPLE LIST

input_tuple_list = [(2, 5), (1, 2), (4, 4), (2, 3), (2, 1)]
print("> YOUR ENTERED TUPLE LIST = " + str(input_tuple_list))

# SORTING THE INPUT TUPLE LIST IN INCREASING ORDER
sortedinput_tuple_list = sorted(input_tuple_list, key=last)

# PRINTING THE UPDATED SORTED TUPLE LIST
print("> YOUR UPDATED TUPLE LIST IN INCREASING ORDER = " + str(sortedinput_tuple_list))


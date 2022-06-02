def listchecker(inputlist1,inputlist2):
    
    for p in inputlist1:
        for q in inputlist2:
            if p == q:
                return True

    return False

a = [5,4,3,2]
b = [7,8,5,0]

print("AFTER COMPARING THE LISTS THE RESULT IS:")
print(listchecker(a,b))
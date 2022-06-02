prabal = [7,14,34,28]
SmallestValue = None
LargestValue = None

for val in prabal:
    if(SmallestValue is None or val<SmallestValue):
        SmallestValue = val
        print("The smallest value is",SmallestValue)

    elif(SmallestValue is not None or val>SmallestValue):
        LargestValue = max(prabal)
        print("The Largest value is",LargestValue)
        break
    
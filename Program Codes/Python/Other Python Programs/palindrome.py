def palindrome(check):
    
    p=check[::-1]
    if p== check:
        return True
    else:
        return False

final=palindrome(input("ENTER YOUR STRING"))

if(final):
    print("YES ITS A PALINDROME")
else:
    print("NO ITS NOT A PALINDROME")
# Method 1
def palindromeStrings(S):
    if S == "":
        return S
    rev = S[-1]
    return rev+palindromeStrings(S[0:-1])

S = input().strip()
if S == palindromeStrings(S):
    print("True")
else:
    print("False")
    

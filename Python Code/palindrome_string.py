# 78987
# should print out True




def palindrome(n):
    rev = 0
    cpy = n
    while cpy>0:
        temp = 0
        temp = cpy%10
        rev = temp + rev*10
        cpy = cpy// 10
    if(rev==n):
        return True
    else:
        return False

inp = int(input())
print(palindrome(inp))
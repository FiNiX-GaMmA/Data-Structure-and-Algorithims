def fact(n):
    ans = 1
    for i in range(1,n+1):
        ans *= i
        print(i)
    return ans

n = int(input())
print("factorial of a number is :",fact(n))
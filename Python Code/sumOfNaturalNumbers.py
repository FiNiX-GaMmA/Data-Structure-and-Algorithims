def sumOfNaturalNUmbers(n):
    if n == 0:
        return 0;
    return n + sumOfNaturalNUmbers(n-1)

n = int(input())
print((sumOfNaturalNUmbers(n)))
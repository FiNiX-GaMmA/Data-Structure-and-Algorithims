def countingNumber(n):
    if n == 0:
        return 0
    else:
        return 1 + countingNumber(n//10)
    
n = int(input("Enter a number: "))
print("The number of digits in the number are: ", countingNumber(n))
n = int(input("Enter a number: "))
count = 0
for i in range(n):
    while (n!=0):
        n = n//10
        count += 1
print("The number of digits in the number are: ", count)

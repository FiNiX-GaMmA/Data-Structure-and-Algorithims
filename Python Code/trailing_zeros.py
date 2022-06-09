# input 5
# output = 1
# explaination - 5*4*3*2*1 = 120 and 120 has 1 zero in it





def trailing_zero(n):
    ans = 1
    for i in range(1,n+1):
        ans *= i
    rem = 0
    count = 0
    while rem==0:
        rem =ans % 10
        count+=1
        ans = ans//10
    return count-1



n = int(input())
print("No of zeros are: ",trailing_zero(n))
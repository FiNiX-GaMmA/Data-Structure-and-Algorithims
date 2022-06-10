in1 = int(input())
in2 = int(input())
def find_lCM(in1,in2):
    maxi = max(in1,in2)
    for i in range(maxi,(in1*in2)+1):
        if(i%in1==0 and i%in2==0):
            return i
print("LCM is : ",find_lCM(in1,in2))
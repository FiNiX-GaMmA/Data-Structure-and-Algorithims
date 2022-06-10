def GCD(a,b):
    if(b==0):
        return a;
    return GCD(b,a%b)

in1 = int(input())
in2 = int(input())
print("GCD is", GCD(in1,in2))
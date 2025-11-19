#Input three integers value then print largest , middle and lowest value.

a=int(input("Enter first number: "))
b=int(input("Enter second number: "))
c=int(input("Enter third number: "))
if a>b and a>c:
    largest=a
    if b>c:
        middle=b
        lowest=c
    else:
        middle=c
        lowest=b
elif b>a and b>c:
    largest=b
    if a>c:
        middle=a
        lowest=c
    else:
        middle=c
        lowest=a
else:
    largest=c
    if a>b:
        middle=a
        lowest=b
    else:
        middle=b
        lowest=a
print("Largest:",largest)
print("Middle:",middle)
print("Lowest:",lowest)



# print the sum of 1 to n Numbers input the Value of n from User.
n=int(input("Enter the value of n: "))
s=0
for i in range(1,n+1):
    s=s+i
print(f"Sum of first {n} natural numbers is", s)

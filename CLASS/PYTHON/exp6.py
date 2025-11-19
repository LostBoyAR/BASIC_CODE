# A program to find the sum of 1 / factorial 1 + 2 / factorial 2 + 3 / factorial 3  to + n/factorial  n.

n=int(input("Enter the value of n: "))
s=0
f=1
for i in range(1,n+1):
    f=f*i
    s=s+i/f
print(f"Sum of the series of {n}! is", s)

# def factorial(num):
#     f=1
#     for i in range(1, num+1):
#         f=f*i
#     return f

# n = int(input("Enter the value of n: "))
# s=0
# for i in range(1, n + 1):
#     s=s+i/factorial(i)
# print(f"Sum of the series of {n}! is", s)

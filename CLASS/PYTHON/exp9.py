#  Write a python program to print pattern.
#    * 
#   *** 
#  ***** 
# ******* 
n=int(input("Enter the number of rows: "))
for i in range(n):
    for j in range(n-i-1):
        print(" ",end="")
    for k in range(2*i+1):
        print("*",end="")
    print() 
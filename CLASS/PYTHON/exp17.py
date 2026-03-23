 # Declare a list and input 10 values in the list and search the inputted number in the list. 

list = []

for i in range(10):
    print(f"Enter value {i+1}: ",end="")
    value = int(input())
    list.append(value)

number = int(input("Enter a number to search: "))

if number in list:
    print(f"{number} is found in the list.")
else:
    print(f"{number} is not found in the list.")
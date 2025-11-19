# Input five integers value in a list and sort it.

list = []
for i in range(5):
    num = int(input(f"Enter {i+1} number: "))
    list.append(num)
list.sort()
print("Sorted list is:", list)
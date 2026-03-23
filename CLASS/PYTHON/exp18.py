# Declare a list and store 10 names in the list and search an inputted name in that list

list = []

for i in range(10):
    print(f"Enter name {i+1}: ", end="")
    name = input()
    list.append(name)

search = input("Enter a name to search: ")

if search in list:
    print(f"{search} is found in the list.")
else:
    print(f"{search} is not found in the list.")
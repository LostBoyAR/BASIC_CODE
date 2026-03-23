# Write a Python program to remove an item from a set if it is present in the set. 

set = {1, 2, 3, 4, 5}

item = int(input("Enter an item to remove: "))

if item in set:
    set.remove(item)
    print(f"{item} has been removed from the set.")
else:
    print(f"{item} is not found in the set.")
    
print("Updated set:", set)
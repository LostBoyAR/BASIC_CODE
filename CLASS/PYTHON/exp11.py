#Print the prime number between 3 to 100.

for num in range(3, 101):
    for i in range(2, int(num/2)+1):
        if (num % i) == 0:
            break
    else:
        print(num, end=" ")
print()

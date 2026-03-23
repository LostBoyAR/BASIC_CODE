#  A program where you pass a string in a global function as its parameter and count the repeated characters in that string. 

def count(s):
    string = s.lower()
    dict = {}
    for char in string:
        # if char.isalpha(): 
            if char in dict:
                dict[char] += 1
            else:
                dict[char] = 1
    for char, count in dict.items():
        if count > 1:
            print(f"{char} is repeated {count} times.")
            
string = input("Enter a string: ")
count(string)
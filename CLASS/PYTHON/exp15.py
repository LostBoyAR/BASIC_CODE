#  A program where you pass a string in a global function as its parameter and count the repeated characters in that string. 

def count_repeated_characters(input_string):
    char_count = {}
    for char in input_string:
        if char in char_count:
            char_count[char] += 1
        else:
            char_count[char] = 1
    
    repeated_chars = {char: count for char, count in char_count.items() if count > 1}
    return repeated_chars
# Example usage
input_string = "programming"    
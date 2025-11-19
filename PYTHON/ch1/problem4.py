import os

# select the directory whose contents you want to list
directory = 'C:/Users/adity/OneDrive/Documents/BASIC_CODE/python/ch1'

# use the os module to list the contents
contents = os.listdir(directory)

# Print the contents of the directory
print(contents)

# print("Hello World!")

# identifier/variable/data-type/loops
# identifier is a name to identify something, like, variable, function, class etc

# x = 10 # <class 'int'>
# # y = 10 # <class 'int'>
# y = '10' # <class 'str'>
# print("Value of x :",x, "Address :",id(x), "Type :",type(x))
# print("Value of x :",y, "Address :",id(y), "Type :",type(y))

# Data-type :
# which type of value we have to stored into a variable is called datatype.
# types of data-type.
# 1. sequence Datatype - string.list,tuple
# it store data in a order.
# we can access value using index no.
# index no bydefault start from zero to n-1.

# string.list,tuple
# starting represents by single or double quotes, (single line string)
# nm = "Aditya Raj"
# nm = 'Aditya Raj'
# print("My name is", nm)
# print(f"My name is {nm}")
# we can also represents by single triple quotes or double triple quotes. (multiline string)
# nm = '''
#     My name is Aditya Raj
#     I am from Bihar
# '''
# nm = """
#     My name is Aditya Raj
#     I am from Bihar
# """
# print(nm)
# print(f"{nm}")

# access single character from the starting using index no.
# edu = "Education"
# print(edu)
# print(edu[0])
# print(edu[1])
# print(f"{edu[0]}")
# print(f"{edu[1]}")

# Slicing - sub-string
# edu = "Education"
# print("Original String :",edu)
# print(edu[0:3:1]) #Edu
# print(edu[3:6:1]) #cat
# print(edu[start_index:no_of_elements:step_size])


# list - []
# list represented by square braces []
# list can store different type of value.
# list can store duplicate value.
# we can access list elements using index or without index.
# we can modify or delete the list elements.
# list is an vector type.

# list1 = []
# list2 = []
# print("List: ",list1,"type :",type(list1),"type :",id(list1))
# print("List: ",list2,"type :",type(list2),"type :",id(list2))

# list =["Aditya",21,98.9,True,None]
# print("Original List :",list)
# print(list[0])
# print(list[1])
# print(list[1:3:1])

# access all elements without indexing.
# for i in list:
#     print(i)

# access all elements without indexing.
# list =["Aditya",21,98.9,True,None]
# print("Original List :",list)
# for i in range (len(list)):
#     print(list[i])

# list =["Aditya",21,98.9,True,None]
# length = len(list)
# print("Original List :",list)
# for i in range (0,length):
#     print(list[i])



# tuple - ()
# indexing allow
# duplicate value allow
# slicing allow
# modification not allow
# tup = (20,30,45.6,"Aditya")

# tup = (20,30,45.6,"Aditya")
# print("Original Tuple Value :",tup)

# create tuple with single element.
tup = (20,)
print("Original Tuple Value :",tup, "type :",type(tup))
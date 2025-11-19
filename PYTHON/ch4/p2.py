marks=[]

s1=input('Enter 6 student marks: ')
for i in range(6):
    s2=int(input(f'Enter {i+1} student marks here: '))
    marks.append(s2)
marks.sort()
print(marks)
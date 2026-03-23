# create a table with username, password, email.
# input values from user and insert it

import mysql.connector

con = mysql.connector.connect(host='localhost', user='root',password='Lost@567',database='bca5thcd')

mycursor=con.cursor()

# mycursor.execute('create table student(id int(4), name varchar(15) not null, roll_no varchar(7), contact_no varchar(12), address varchar(45), email varchar(40) not null, password varchar(20) not null)')

# mycursor.execute("desc student")
# for row in mycursor:
#     print(row)

id=1
while True:
    list1 = []
    list1.append(id)
    name = input("Enter your name: ")
    list1.append(name)
    roll_no = input("Enter your roll number: ")
    list1.append(roll_no)
    contact_no = input("Enter your contact number: ")
    list1.append(contact_no)
    address = input("Enter your address: ")
    list1.append(address)
    email = input("Enter your email: ")
    list1.append(email)
    password = input("Enter your password: ")
    list1.append(password)

    values = tuple(list1)
    print(values)

    mycursor.execute('insert into student values(%s,%s,%s,%s,%s,%s,%s)', values)
    con.commit()
    print(mycursor.rowcount, "record inserted")
    id += 1
    ch = input("Do you want to add more records? (y/n): ")
    if ch.lower() != 'y':
        break
con.close()
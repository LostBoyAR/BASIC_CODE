import mysql.connector

con = mysql.connector.connect(host='localhost', user='root',password='Lost@567',database='bca5thcd')

mycursor=con.cursor()

while True:
    list1 = []
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

    mycursor.execute('insert into student1(name, roll_no, contact_no, address, email, password) values(%s,%s,%s,%s,%s,%s)', values)
    con.commit()
    print(mycursor.rowcount, "record inserted")
    ch = input("Do you want to add more records? (y/n): ")
    if ch.lower() != 'y':
        break
con.close()
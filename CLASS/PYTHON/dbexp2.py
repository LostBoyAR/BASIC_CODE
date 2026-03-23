import mysql.connector

con = mysql.connector.connect(host='localhost', user='root',password='Lost@567',database='bca5thcd')

mycursor=con.cursor()

mycursor.execute('create table student1(id int primary key auto_increment, name varchar(15) not null, roll_no varchar(7), contact_no varchar(12), address varchar(45), email varchar(40) not null, password varchar(20) not null)')

mycursor.execute("desc student1")
for row in mycursor:
    print(row)
import mysql.connector
con=mysql.connector.connect(host = "localhost", user = "root", password = "Lost@567", database = "bca5thcd")
print(con)

mycursor = con.cursor()
# mycursor.execute("create database bca5thcd")
# mycursor.execute("create table bca5th(name varchar(25), roll int(7), address varchar(75))")
# mycursor.execute("show tables")

# mycursor.execute("insert into bca5th values('mohan',25,'muzaffarpur')")


# for x in mycursor:
#     print(x)
    
create table products(p_id number(5) , p_name varchar(20) ,p_price number(10));
insert into products values(001,'book',1000);
insert into products values(002,'bag',2000);
insert into products values(003,'soap',3000);
insert into products values(004,'rice',2500);
insert into products values(005,'chair',1500);
insert into products values(006,'desk',3500);
insert into products values(007,'detergent',4000);
insert into products values(008,'pen',4500);
insert into products values(009,'pencil',5000);
insert into products values(010,'fan',5500);


set SERVEROUTPUT ON;
create or replace procedure proce1(id IN number ,price1 OUT number) is
price number(10);
Begin
   select p_price into price from products where p_id = id;
   price := price + price*0.10;
   update products set p_price = price where p_id = id;
   price1 := price;
   dbms_output.put_line('price updated');
   --price1 := price + price*10/100;
end;
/

DECLARE
    vprice1 number(10);
Begin
    proce1(009,vprice1);
    dbms_output.put_line(vprice1);
end;
/
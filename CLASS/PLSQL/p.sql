create table employ(ename varchar(20) , eid number(10) , salary float(10));
insert into  employ values('Ram',001,50000);
insert into  employ  values('xyz',002,65000);
insert into  employ  values('pqr',003,80000);
insert into  employ  values('r',004,90000);
insert into  employ  values('sh',005,25000);
insert into  employ  values('mo',006,28000);
insert into  employ values('so',007,90000);
insert into  employ values('ro',008,95000);
insert into  employ values('de',009,62000);
insert into  employ values('ka',010,23000);


set serveroutput ON;
create or replace procedure proce2(id IN number) is  
name varchar(20);
sal number;
Begin
    select ename, salary into name, sal from employ where eid = id;
    dbms_output.put_line('Name of employee:' || name);
    dbms_output.put_line('salary of employee:' || TO_CHAR(sal));
end;
/
BEGIN
   proce2(&id);
END;
-- print table of a number.

SET SERVEROUTPUT ON

DECLARE
    n int;
    i int;
BEGIN
    n := &num;
    
    for i in 1..10 loop
        dbms_output.put_line(n || ' * ' || i || ' = ' || (n*i));
    end loop;
END;
/
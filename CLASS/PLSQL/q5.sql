--print factorial of a number.

SET SERVEROUTPUT ON

DECLARE
    n int;
    f int := 1;
BEGIN
    n := &num;
    
    for i in 1..n loop
        f := f * i;
    end loop;
    dbms_output.put_line('Factorial of ' || n || ' is ' || f);
END;
/
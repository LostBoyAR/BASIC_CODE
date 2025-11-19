--generate the fibonacci series up to n terms.

SET SERVEROUTPUT ON

DECLARE
    a int := 0;
    b int := 1;
    n int;
    temp int;
BEGIN
    n := &num;  
    dbms_output.put_line('Fibonacci series:');
    for i in 1..n loop
        dbms_output.put(a || ' ');
        temp := a + b;
        a := b;
        b := temp;
    end loop;
    dbms_output.put_line('');
END;
/
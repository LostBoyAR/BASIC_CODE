--reverse the number.

SET SERVEROUTPUT ON

DECLARE
    n int;
    rev int := 0;
    rema int;
BEGIN
    n := &num;
    while n > 0 loop
        rema := mod(n, 10);
        rev := rev * 10 + rema;
        n := floor(n / 10);
    end loop;
    dbms_output.put_line('Reversed number is ' || rev);
END;
/
--check the number is palindrome or not.

SET SERVEROUTPUT ON

DECLARE
    n int;
    real int;
    rev int := 0;
    rema int;
BEGIN
    n := &num;
    real := n;
    while n > 0 loop
        rema := mod(n, 10);
        rev := rev * 10 + rema;
        n := floor(n / 10);
    end loop;
    if rev = real then
        dbms_output.put_line(real || ' is a palindrome number');
    else
        dbms_output.put_line(real || ' is not a palindrome number');
    end if;
END;
/
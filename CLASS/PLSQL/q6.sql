--check the number is prime or not.

SET SERVEROUTPUT ON

DECLARE
    n int;
    prime boolean := true;
BEGIN
    n := &num;
    
    if n <= 1 then
        prime := false;
    else
        for i in 2..(sqrt(n)) loop
            if mod(n, i) = 0 then
                prime := false;
                exit;
            end if;
        end loop;
    end if;
    
    if prime then
        dbms_output.put_line(n || ' is a prime number.');
    else
        dbms_output.put_line(n || ' is not a prime number.');
    end if;
END;
/
--check leap year.

SET SERVEROUTPUT ON 

DECLARE
    year int;
BEGIN
    year := &year;
    if(mod(year, 400) = 0) or (mod(year, 4) = 0 and mod(year, 100) != 0) then
        dbms_output.put_line(year || ' is a leap year.');
    else
        dbms_output.put_line(year || ' is not a leap year.');
    end if;
END;
/

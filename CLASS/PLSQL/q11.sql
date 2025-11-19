--enter the number(1-7) and print the name of weak of day.

SET SERVEROUTPUT ON

accept num prompt 'Enter a number between 1 to 7 : '
DECLARE
    n number;
BEGIN
    n := &num;
    case n
        when 1 then dbms_output.put_line('Sunday');
        when 2 then dbms_output.put_line('Monday');
        when 3 then dbms_output.put_line('Tuesday');
        when 4 then dbms_output.put_line('Wednesday');
        when 5 then dbms_output.put_line('Thursday');
        when 6 then dbms_output.put_line('Friday');
        when 7 then dbms_output.put_line('Saturday');
        else dbms_output.put_line('Invalid number');
    end case;
END;
/

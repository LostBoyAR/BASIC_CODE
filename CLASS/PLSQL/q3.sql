-- find the root of quadratic equation.

SET SERVEROUTPUT ON;

DECLARE
    a number;
    b number;
    c number;
    d number;
    r1 number;
    r2 number;
BEGIN
    a := &a;
    b := &b;
    c := &c;
    
    d := b * b - 4 * a * c;
    
    if d > 0 then
        r1 := (-b + sqrt(d)) / (2 * a);
        r2 := (-b - sqrt(d)) / (2 * a);
        dbms_output.put_line('Roots are real and different.');
        dbms_output.put_line('Root 1: ' || r1);
        dbms_output.put_line('Root 2: ' || r2);
    elsif d = 0 then
        r1 := -b / (2 * a);
        dbms_output.put_line('Roots are real and the same.');
        dbms_output.put_line('Root: ' || r1);
    else
        dbms_output.put_line('Roots are complex and different.');
    end if;
END;
/
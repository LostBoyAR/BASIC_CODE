--find the greatest between three number.

SET SERVEROUTPUT ON

DECLARE
    a int;
    b int;
    c int;
    gr int;                                
BEGIN
    a :=&num1;
    b :=&num2;
    c :=&num3;
    
    if a >= b and a >= c then
        gr := a;
    elsif b >= a and b >= c then
        gr := b;
    else
        gr := c;
    end if;
    dbms_output.put_line(gr || ' is the greatest number');
END;    
/

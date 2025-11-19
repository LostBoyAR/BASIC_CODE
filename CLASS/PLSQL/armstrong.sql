--check the number is armstrong or not.

SET SERVEROUTPUT ON

DECLARE
    n int;
    temp int;
    digit int;
    sum1 int := 0;   
    count1 int := 0;
BEGIN   
    n := &num;
    temp := n;
    
    --count digits
    WHILE temp > 0 LOOP
        count1 := count1 + 1;
        temp := temp / 10;
    END LOOP;
    
    temp := n;
    
    --calculate sum of cubes of digits
    WHILE temp > 0 LOOP
        digit := MOD(temp, 10);
        sum1 := sum1 + POWER(digit, count1);
        temp := temp / 10;
    END LOOP;
    
    IF sum1 = n THEN
        DBMS_OUTPUT.PUT_LINE(n || ' is an Armstrong number.');
    ELSE
        DBMS_OUTPUT.PUT_LINE(n || ' is not an Armstrong number.');
    END IF;
END;
/
    

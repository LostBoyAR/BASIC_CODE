-- Function to Find Factorial of a Number

SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION factorial(num NUMBER)
RETURN NUMBER IS
  f NUMBER := 1;
  i NUMBER := 1;
BEGIN
  WHILE i <= num LOOP
    f := f * i;
    i := i + 1;
  END LOOP;
  RETURN f;
END;
/
DECLARE
  result NUMBER;
  num NUMBER;
BEGIN
  num := &num; 
  result := factorial(num);
  dbms_output.put_line('Factorial = ' || result);
END;
/
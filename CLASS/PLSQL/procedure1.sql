--Procedure to Check Even or Odd
set serveroutput on;

CREATE OR REPLACE PROCEDURE checking(n IN NUMBER, result OUT VARCHAR2) IS
BEGIN
  IF MOD(n, 2) = 0 THEN
    result := 'Even';
  ELSE
    result := 'Odd';
  END IF;
END;
/
DECLARE
  num NUMBER;
  res VARCHAR2(5);
BEGIN
  num := &n; 
  checking(num, res);
  dbms_output.put_line('Number is ' || res);
END;
/


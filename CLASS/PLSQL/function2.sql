-- Function to Calculate Sum of Digits

SET SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION sumOfDigits(n IN NUMBER)
RETURN NUMBER IS
  s NUMBER := 0;
  r NUMBER;
  v_num NUMBER;
BEGIN
  IF n IS NULL THEN
    RETURN NULL;
  END IF;
  v_num := ABS(TRUNC(n)); -- use a local variable because IN parameters are read-only
  WHILE v_num > 0 LOOP
    r := MOD(v_num, 10);
    s := s + r;
    v_num := TRUNC(v_num / 10);
  END LOOP;
  RETURN s;
END;
/
DECLARE
  num NUMBER;
  res NUMBER;
BEGIN
  num := &n; 
  res := sumOfDigits(num);
  dbms_output.put_line('Sum of digits = ' || res);
END;
/
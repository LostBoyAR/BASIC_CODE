-- Function to Return Grade Based on Marks

set SERVEROUTPUT ON;

CREATE OR REPLACE FUNCTION gradeCalc(marks NUMBER)
RETURN VARCHAR2 IS
  grade VARCHAR2(5);
BEGIN
  IF marks >= 90 THEN
    grade := 'A';
  ELSIF marks >= 75 THEN
    grade := 'B';
  ELSIF marks >= 60 THEN
    grade := 'C';
  ELSIF marks >= 33 THEN
    grade := 'D';
  ELSE
    grade := 'Fail';
  END IF;
  RETURN grade;
END;
/
DECLARE
  m NUMBER;
  g VARCHAR2(5);
BEGIN
  m := &marks;
  g := gradeCalc(m);
  dbms_output.put_line('Grade = ' || g);
END;
/
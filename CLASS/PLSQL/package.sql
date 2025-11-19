CREATE TABLE student1 (
  roll    NUMBER PRIMARY KEY,
  sname   VARCHAR2(30),
  marks   NUMBER
);

INSERT INTO student1 VALUES (1, 'Ram', 25);
INSERT INTO student1 VALUES (2, 'Shyam', 35);
INSERT INTO student1 VALUES (3, 'Rohit', 55);
INSERT INTO student1 VALUES (4, 'Nishu', 30);
INSERT INTO student1 VALUES (5, 'Ravi', 60);

COMMIT;

--Create a PL/SQL package to manage student1 results.

--Specification:

--Procedure addGraceMarks(sid NUMBER) — increase marks by 5 for given student1.

--Function checkPass(sid NUMBER) — return TRUE if marks ≥ 33, otherwise FALSE.

set SERVEROUTPUT ON;

-- Package for Student Result Management

-- PACKAGE SPECIFICATION
CREATE OR REPLACE PACKAGE pkg_result IS
  PROCEDURE addGraceMarks(sid NUMBER);
  FUNCTION checkPass(sid NUMBER) RETURN BOOLEAN;
END pkg_result;
/

-- PACKAGE BODY
CREATE OR REPLACE PACKAGE BODY pkg_result IS

  PROCEDURE addGraceMarks(sid NUMBER) IS
  BEGIN
    UPDATE student1 SET marks = marks + 5 WHERE roll = sid;
  END addGraceMarks;

  FUNCTION checkPass(sid NUMBER) RETURN BOOLEAN IS
    stud_marks student1.marks%TYPE;
  BEGIN
    SELECT marks INTO stud_marks FROM student1 WHERE roll = sid;
    IF stud_marks >= 33 THEN
      RETURN TRUE;
    ELSE
      RETURN FALSE;
    END IF;
  END checkPass;

END pkg_result;
/

-- MAIN BLOCK
DECLARE
  sid student1.roll%TYPE;
BEGIN
  sid := &sid;
  
  pkg_result.addGraceMarks(sid);
  dbms_output.put_line('Grace Marks Added');

  IF pkg_result.checkPass(sid) THEN
    dbms_output.put_line('Student Passed');
  ELSE
    dbms_output.put_line('Student Failed');
  END IF;
END;
/
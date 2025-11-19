create table student
(   roll_no number(6) constraint student_pk primary key,
    sname   varchar2(50) not null,
    marks   number(3) constraint chk_marks check (marks between 0 and 100)
);

INSERT INTO student (roll_no, sname, marks) VALUES (235195, 'Aditya', 85);
INSERT INTO student (roll_no, sname, marks) VALUES (235196, 'Priya', 92);
INSERT INTO student (roll_no, sname, marks) VALUES (235197, 'Rohan', 76);
INSERT INTO student (roll_no, sname, marks) VALUES (235198, 'Sneha', 88);
INSERT INTO student (roll_no, sname, marks) VALUES (235199, 'Vikash', 69);

COMMIT;

-- Write a PL/SQL program using a cursor to retrieve all students’ roll_no, name, and marks from the Student table.
-- If a student’s marks are greater than 60, print "Pass", otherwise print "Fail" along with their details.

set SERVEROUTPUT ON;

DECLARE
    CURSOR student_cursor IS
        SELECT roll_no, sname, marks FROM student;
    
    v_roll_no student.roll_no%TYPE;
    v_sname   student.sname%TYPE;
    v_marks   student.marks%TYPE;
BEGIN
    OPEN student_cursor;
        dbms_output.put_line('Roll No, Name, Marks, Pass/Fail');
    LOOP
        FETCH student_cursor INTO v_roll_no, v_sname, v_marks;
        EXIT WHEN student_cursor%NOTFOUND;
        
        IF v_marks > 60 THEN
            dbms_output.put_line(v_roll_no ||', ' || v_sname || ', ' || v_marks || ' - Pass');
        ELSE
            dbms_output.put_line(v_roll_no || ', ' || v_sname || ', ' || v_marks || ' - Fail');
        END IF;
    END LOOP;
    CLOSE student_cursor;
END;
/
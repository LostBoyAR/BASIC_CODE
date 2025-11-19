create table Employee 
( empno number(4) primary key,
  ename varchar2(10) not null,
  salary number(7,2)
);

// ...existing code...
INSERT INTO Employee (empno, ename, salary) VALUES (1001, 'Aditya', 45000.00);
INSERT INTO Employee (empno, ename, salary) VALUES (1002, 'Piyush', 52000.50);
INSERT INTO Employee (empno, ename, salary) VALUES (1003, 'Raja', 38000.75);
INSERT INTO Employee (empno, ename, salary) VALUES (1004, 'Sneha', 47000.00);
INSERT INTO Employee (empno, ename, salary) VALUES (1005, 'Vikas', 41000.25);
COMMIT;

-- Write a PL/SQL program using an explicit cursor to display the emp_id, emp_name, and salary of all employees from the Employee table.
-- If the cursor fails to open, display a suitable message.

set SERVEROUTPUT ON;

DECLARE
    CURSOR emp_cur IS
        SELECT empno, ename, salary FROM Employee;
    
    id Employee.empno%TYPE;
    name Employee.ename%TYPE;
    sal Employee.salary%TYPE;
BEGIN
    OPEN emp_cur;
    IF emp_cur%ISOPEN THEN
        dbms_output.put_line('Employee Details:');
        dbms_output.put_line('Employee ID, Employee Name, Salary');
        LOOP
            FETCH emp_cur INTO id, name, sal;
            EXIT WHEN emp_cur%NOTFOUND;
            dbms_output.put_line(id || ', ' || name || ', ' || sal);
        END LOOP;
        CLOSE emp_cur;
    ELSE
        dbms_output.put_line('Cursor is not open.');
    END IF;
END;
/
set SERVEROUTPUT ON
-- Update the salary of employees in 'Muzaffarpur' city by 5000 and display the number of affected rows

DECLARE
    tot_rows int;
BEGIN
    UPDATE emp2 SET salary = salary + 5000 WHERE city = 'Muzaffarpur';
    IF sql%notfound THEN dbms_output.put_line('no customers selected');
    ELSIF sql%found THEN tot_rows := sql%rowcount;
        dbms_output.put_line(tot_rows || ' customers selected');
    END IF;
END;
/
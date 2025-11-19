--print the table between two numbers.

SET SERVEROUTPUT ON

DECLARE
    n1 int;
    n2 int;
BEGIN
    n1 := &starting_table;
    n2 := &ending_table;
    dbms_output.put_line('Table from ' || n1 || ' to ' || n2 || ':');
    for i in n1..n2 loop
        dbms_output.put_line('Table of ' || i || ':');
        for j in 1..10 loop
            dbms_output.put_line(i || ' * ' || j || ' = ' || (i*j));
        end loop;
        dbms_output.put_line('');
    end loop;
END;
/
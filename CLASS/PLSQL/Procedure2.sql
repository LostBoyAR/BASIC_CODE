-- Procedure to Calculate Area of Circle

set serveroutput on;

CREATE OR REPLACE PROCEDURE area(r IN NUMBER, area OUT NUMBER) IS
BEGIN
  area := 3.14 * r * r;
END;
/
DECLARE
  rad NUMBER;
  a NUMBER;
BEGIN
  rad := &radius;
  area(rad, a);
  dbms_output.put_line('Area of circle is ' || a);
END;
/
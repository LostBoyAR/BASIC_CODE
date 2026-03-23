SET SERVEROUTPUT ON;

CREATE OR REPLACE PACKAGE pkgarea IS
  FUNCTION areaCircle(r NUMBER) RETURN NUMBER;
  FUNCTION areaRectangle(l NUMBER, b NUMBER) RETURN NUMBER;
  FUNCTION areaTriangle(b NUMBER, h NUMBER) RETURN NUMBER;
  PROCEDURE showAreas(r NUMBER, l NUMBER, b NUMBER, th NUMBER, tb NUMBER);
END pkgarea;
/

CREATE OR REPLACE PACKAGE BODY pkgarea IS

  FUNCTION areaCircle(r NUMBER) RETURN NUMBER IS
  BEGIN
    RETURN 3.14 * r * r;
  END areaCircle;

  FUNCTION areaRectangle(l NUMBER, b NUMBER) RETURN NUMBER IS
  BEGIN
    RETURN l * b;
  END areaRectangle;

  FUNCTION areaTriangle(b NUMBER, h NUMBER) RETURN NUMBER IS
  BEGIN
    RETURN (b * h) / 2;
  END areaTriangle;

  PROCEDURE showAreas(r NUMBER, l NUMBER, b NUMBER, th NUMBER, tb NUMBER) IS
  BEGIN
    DBMS_OUTPUT.PUT_LINE('Area of Circle    : ' || (areaCircle(r)));
    DBMS_OUTPUT.PUT_LINE('Area of Rectangle : ' || (areaRectangle(l, b)));
    DBMS_OUTPUT.PUT_LINE('Area of Triangle  : ' || (areaTriangle(tb, th)));
  END showAreas;

END pkgarea;
/


DECLARE
  r NUMBER := &radius;  
  l NUMBER := &length;  
  b NUMBER := &breadth; 
  th NUMBER := &tri_height; 
  tb NUMBER := &tri_base;   
BEGIN
  pkgarea.showAreas(r, l, b, th, tb);
END;
/
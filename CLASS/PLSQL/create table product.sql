create table product 
( pid number(4) primary key,
  pname varchar2(10) not null,
  price number(7,2)
);

INSERT INTO product (pid, pname, price) VALUES (1001, 'Pen',     12.50);
INSERT INTO product (pid, pname, price) VALUES (1002, 'Pencil',   5.00);
INSERT INTO product (pid, pname, price) VALUES (1003, 'Notebook',45.75);
INSERT INTO product (pid, pname, price) VALUES (1004, 'Eraser',   3.25);
INSERT INTO product (pid, pname, price) VALUES (1005, 'Stapler',150.00);

COMMIT;

-- Write a PL/SQL block that declares a cursor to fetch product_id, product_name, and price from the Products table.
-- Display the details of each product using dbms_output.put_line.

set SERVEROUTPUT ON;

DECLARE
    CURSOR product_cursor IS
        SELECT pid, pname, price FROM product;
    
    v_pid product.pid%TYPE;
    v_pname product.pname%TYPE;
    v_price product.price%TYPE;
BEGIN
    OPEN product_cursor;
    LOOP
        FETCH product_cursor INTO v_pid, v_pname, v_price;
        EXIT WHEN product_cursor%NOTFOUND;
        dbms_output.put_line('Product ID: ' || v_pid || ', Product Name: ' || v_pname || ', Price: ' || v_price);
    END LOOP;
    CLOSE product_cursor;
END;
/

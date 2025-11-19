create table orders(
    ord_id number primary key,
    cust_name varchar2(10) not null,
    ord_date date default sysdate
);

INSERT INTO orders (ord_id, cust_name, ord_date) VALUES (101, 'Aditya',  TO_DATE('01-11-2025','DD-MM-YYYY'));
INSERT INTO orders (ord_id, cust_name, ord_date) VALUES (102, 'Piyush',  TO_DATE('03-11-2025','DD-MM-YYYY'));
INSERT INTO orders (ord_id, cust_name, ord_date) VALUES (103, 'Raja',  TO_DATE('05-11-2025','DD-MM-YYYY'));
INSERT INTO orders (ord_id, cust_name, ord_date) VALUES (104, 'Amit',  TO_DATE('07-11-2025','DD-MM-YYYY'));
INSERT INTO orders (ord_id, cust_name, ord_date) VALUES (105, 'Rohan', TO_DATE('09-11-2025','DD-MM-YYYY'));

COMMIT;

-- Write a PL/SQL program that uses a cursor to display all orders placed by customers.
-- The cursor should fetch order_id, cust_name, and order_date from the Orders table, and print them one by one.

set SERVEROUTPUT ON;

DECLARE
    CURSOR order_cur IS
        SELECT ord_id, cust_name, ord_date FROM orders;
    
    id orders.ord_id%TYPE;
    name orders.cust_name%TYPE;
    date orders.ord_date%TYPE;
BEGIN
    OPEN order_cur;
    IF order_cur%ISOPEN THEN
        dbms_output.put_line('Order Details:');
        dbms_output.put_line('Order ID, Customer Name, Order Date');
        LOOP
            FETCH order_cur INTO id, name, date;
            EXIT WHEN order_cur%NOTFOUND;
            dbms_output.put_line(id || ', ' || name || ', ' || TO_CHAR(date, 'DD-MM-YYYY'));
        END LOOP;
        CLOSE order_cur;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Cursor is not open.');
    END IF;
END;
/

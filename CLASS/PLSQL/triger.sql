-- CREATE TABLE employee3(
--   emp_id    NUMBER PRIMARY KEY,
--   emp_name  VARCHAR2(40),
--   age       NUMBER,
--   salary    NUMBER
-- );

-- INSERT INTO employee3 (emp_id, emp_name, age, salary) VALUES (1001, 'Amit Sharma',   30, 5000);
-- INSERT INTO employee3 (emp_id, emp_name, age, salary) VALUES (1002, 'Priya Singh',   28, 6000);
-- INSERT INTO employee3 (emp_id, emp_name, age, salary) VALUES (1003, 'Rahul Verma',   35, 9000);
-- INSERT INTO employee3 (emp_id, emp_name, age, salary) VALUES (1004, 'Sneha Patel',   26, 4800);
-- INSERT INTO employee3 (emp_id, emp_name, age, salary) VALUES (1005, 'Rohan Das',     32, 95000);

-- COMMIT;

-- SELECT * FROM employee3;

CREATE OR REPLACE TRIGGER trg1
BEFORE INSERT ON employee3
FOR EACH ROW
BEGIN
  IF :NEW.salary < 8000 THEN
    RAISE_APPLICATION_ERROR(-20011, 'Salary cannot be less than 8000');
  END IF;
END;
/

-- INSERT INTO employee3 VALUES (1006, 'Saurav Kumar', 29, 2000);
-- CREATE TABLE users(
--   u_id    NUMBER PRIMARY KEY,
--   uname   VARCHAR2(40),
--   email      VARCHAR2(100),
--   password   VARCHAR2(40)
-- );
-- COMMIT;

CREATE OR REPLACE TRIGGER trg2
BEFORE INSERT ON users
FOR EACH ROW
BEGIN
  IF INSTR(:NEW.email, '@') = 0 THEN
    RAISE_APPLICATION_ERROR(-20013, 'Invalid email address. Email must contain @ symbol.');
  END IF;
END;
/

-- INSERT INTO users VALUES (1, 'Amit', 'amit@example.com', 'P@ssw0rd');

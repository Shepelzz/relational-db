ALTER TABLE CUSTOMER
ADD AGE NUMBER DEFAULT 0 NOT NULL;

ALTER TABLE CUSTOMER
DROP COLUMN AGE;

ALTER TABLE CUSTOMER
MODIFY CUSTNAME NVARCHAR2(90);

ALTER TABLE CUSTOMER
MODIFY SALESMAN_ID NOT NULL;
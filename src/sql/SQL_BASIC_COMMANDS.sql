
--INSERT
INSERT INTO ORDERS
VALUES(1001, 'tool', 140, TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1002, 'toy333', 140, TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'));
INSERT INTO ORDERS
VALUES(1003, 'smallcar000', 140, TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2017/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'));

INSERT INTO ORDERS
VALUES(1004, 'df', 5656, TO_DATE('2015/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'), TO_DATE('2016/05/03 21:22:15', 'yyyy/mm/dd hh24:mi:ss'));

--SELECT
SELECT * FROM ORDERS;
SELECT * FROM ORDERS WHERE PRODUCT_NAME = 'toy333';

--DELETE
DELETE FROM ORDERS;
DELETE FROM ORDERS WHERE PRODUCT_NAME = 'toy333';

--UPDATE
UPDATE ORDERS SET PRICE = 230 WHERE ID = 1001;

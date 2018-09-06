CREATE TABLE ARTICLE(
    ID NUMBER,
    CONSTRAINT ARTICLE_ID PRIMARY KEY(ID),
    HEADER NVARCHAR2(100),
    TEXT CLOB,
    AUTHOR_ID NUMBER,
    CONSTRAINT AUTHOR_FK FOREIGN KEY(AUTHOR_ID) REFERENCES AUTHOR(ID)
);
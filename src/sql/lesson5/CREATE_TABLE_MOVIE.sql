CREATE TABLE MOVIE (
    ID NUMBER,
    CONSTRAINT MOVIE_ID PRIMARY KEY(ID),
    TITLE NVARCHAR2(50) NOT NULL UNIQUE,
    DIRECTOR NVARCHAR2(50) NOT NULL UNIQUE,
    YEAR NUMBER(4) CHECK(YEAR >= 1900),
    LENGTH_MINS NUMBER CHECK(LENGTH_MINS BETWEEN 10 AND 200)
);
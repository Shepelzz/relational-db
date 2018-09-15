CREATE TABLE forumCategories(
    id NUMBER,
        CONSTRAINT forumCategories_PK PRIMARY KEY(id),
    title NVARCHAR2(64),
    description CLOB,
    dateCreated TIMESTAMP,
    ip NVARCHAR2(20)
);

CREATE TABLE forumSubcategories(
    id NUMBER,
        CONSTRAINT forumSubcategories_PK PRIMARY KEY(id),
    idCategory NUMBER,
        CONSTRAINT forumCategories_FK FOREIGN KEY(idCategory) REFERENCES forumCategories(id),
    title NVARCHAR2(64),
    description CLOB,
    dateCreated TIMESTAMP,
    ip NVARCHAR2(20)
);

CREATE TABLE users(
    id NUMBER,
        CONSTRAINT users_PK PRIMARY KEY(id),
    nick NVARCHAR2(16),
    password NVARCHAR2(128),
    email NVARCHAR2(128),
    dateRegistration TIMESTAMP,  --date резерв
    karma NUMERIC(9, 2),
    ip NVARCHAR2(20)
);

CREATE TABLE forumPosts(
    id NUMBER,
        CONSTRAINT forumPosts_PK PRIMARY KEY(id),
    idSubcategory NUMBER,
        CONSTRAINT Subcategory_FK FOREIGN KEY(idSubcategory) REFERENCES forumSubcategories(id),
    idUser NUMBER,
        CONSTRAINT User_FK FOREIGN KEY(idUser) REFERENCES users(id),
    parentPost NUMBER,
        CONSTRAINT parentPost_FK FOREIGN KEY(parentPost) REFERENCES forumPosts(id),
    title NVARCHAR2(90),
    content CLOB,
    isPoll NUMBER(1,0) DEFAULT 0,
    dateCreated TIMESTAMP,
    ip NVARCHAR2(20)
);

CREATE TABLE forumPollsOptions(
    id NUMBER,
        CONSTRAINT forumPollsOptions_PK PRIMARY KEY(id),
    idPost NUMBER,
        CONSTRAINT forumPosts_FK FOREIGN KEY(idPost) REFERENCES forumPosts(id),
    title NVARCHAR2(64),
    dateCreated TIMESTAMP
);

CREATE TABLE forumPollsOptionsVotes(
    id NUMBER,
        CONSTRAINT forumPollsOptionsVotes_PK PRIMARY KEY(id),
    idPollOption NUMBER,
        CONSTRAINT forumPollsOptions_FK FOREIGN KEY(idPollOption) REFERENCES forumPollsOptions(id),
    idUser NUMBER,
        CONSTRAINT users_FK FOREIGN KEY(idUser) REFERENCES users(id),
    dateCreated TIMESTAMP,
    ip NVARCHAR2(20)
);
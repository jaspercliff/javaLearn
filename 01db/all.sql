-- auto-generated definition
create table Users
(
    id    int auto_increment
        primary key,
    name  varchar(100) null,
    age   int          null,
    email varchar(100) null
);

create index idx_name_email
    on Users (name, email);

INSERT INTO Users (id, name, age, email) VALUES (1, 'Alice', 29, 'alice@example.com');
INSERT INTO Users (id, name, age, email) VALUES (2, 'Bob', 34, 'bob@example.com');
INSERT INTO Users (id, name, age, email) VALUES (3, 'Charlie', 22, 'charlie@example.com');
INSERT INTO Users (id, name, age, email) VALUES (4, 'Diana', 25, 'diana@example.com');



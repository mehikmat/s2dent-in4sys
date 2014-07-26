use mydb;
drop table if exists users;
drop table if exists authorities;
drop  table if exists CONTACTS;

create table users(
    username varchar(50) not null primary key,
    password varchar(50) not null,
    address varchar(20) default null
);

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

CREATE TABLE CONTACTS
(
  ID         INT PRIMARY KEY AUTO_INCREMENT,
  FIRSTNAME   VARCHAR(30),
  LASTNAME    VARCHAR(30),
  TELEPHONE   VARCHAR(15),
  EMAIL       VARCHAR(30),
  CREATED     TIMESTAMP DEFAULT NOW()
);

/*
to find out foreign key references of a key
SELECT *
FROM sys.foreign_keys
WHERE referenced_object_id = object_id('Student')
*/
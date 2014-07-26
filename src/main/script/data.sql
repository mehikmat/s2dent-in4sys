use mydb;

INSERT INTO users(username,password)
VALUES ('admin','admin');

INSERT INTO authorities (username, authority)
VALUES ('admin', 'ROLE_USER');
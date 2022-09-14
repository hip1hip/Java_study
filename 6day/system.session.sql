select * FROM person;

CREATE DATABASE contacts;

USE contacts;

CREATE TABLE person (
    name VARCHAR(20),
    phone VARCHAR(20),
    email VARCHAR(20),
    PRIMARY KEY(phone)
);

SELECT * from person;


insert INTO person (name , phone, email) values ('김용선','010-1111-1111','kim@playboy.com');
insert INTO person (name , phone, email) values ('오윤택','010-2222-2222','oh@playboy.com');
insert INTO person (name , phone, email) values ('김호진','010-3333-3333','kimho@playboy.com');
insert INTO person (name , phone, email) values ('송원석','010-4444-4444','song@playboy.com');
insert INTO person (name , phone, email) values ('이예현','010-5555-5555','lee@playboy.com');
insert INTO person (name , phone, email) values ('김우석','010-6666-6666','kimu@playboy.com');



commit;









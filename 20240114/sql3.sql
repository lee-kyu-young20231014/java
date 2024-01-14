create database if not exists mysns
default character set utf8 collate utf8_general_ci;

use mysns;

create table if not exists user(
id varchar(128) primary key,
password varchar(32),
name varchar(32),
ts timestamp default current_timestamp
);

insert into user(id,password,name) values('123@123.com','123','홍길동');
insert into user(id,password,name) values('456@456.com','456','홍길동2');
insert into user(id,password,name) values('789@789.com','789','홍길동3');

select * from user;


create table if not exists feed(
id varchar(128) primary key,
content varchar(4096),
ts timestamp default current_timestamp
);

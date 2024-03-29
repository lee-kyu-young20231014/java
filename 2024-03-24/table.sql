drop database db_library;
create database if not exists  db_library;
use db_library;
drop table if exists tbl_admin_member;
create table tbl_admin_member(
	a_m_no int auto_increment,
	a_m_approval int not null default 0,
	a_m_id varchar(20) not null unique,
	a_m_pw varchar(100) not null,
	a_m_name varchar(20) not null,
	a_m_gender varchar(1) not null,
	a_m_part varchar(20) not null,
	a_m_position varchar(20) not null,
	a_m_mail varchar(50) not null,
	a_m_phone varchar(20) not null, 
	a_m_reg_date datetime,
	a_m_mod_date datetime,
    primary key(a_m_no)
);

drop table if exists tbl_user_member;
CREATE TABLE tbl_user_member(
	u_m_no					INT 	AUTO_INCREMENT, 
	u_m_id					VARCHAR(20) 	NOT NULL unique, 
	u_m_pw					VARCHAR(100) 	NOT NULL, 
	u_m_name				VARCHAR(20) 	NOT NULL, 
	u_m_gender				CHAR(1) NOT NULL, 
	u_m_mail				VARCHAR(50) 	NOT NULL, 
	u_m_phone				VARCHAR(20) 	NOT NULL, 
	u_m_reg_date 			DATETIME, 
	u_m_mod_date			DATETIME, 
	PRIMARY KEY(u_m_no)
	);

drop table if exists tbl_book;
CREATE TABLE tbl_book(
	b_no			INT	AUTO_INCREMENT,
	b_thumbnail		VARCHAR(100),
	b_name			VARCHAR(30)	NOT NULL, 	
	b_author		VARCHAR(20)	NOT NULL, 	
	b_publisher		VARCHAR(20)	NOT NULL,
	b_publish_year		CHAR(4)		NOT NULL, 	
	b_isbn			VARCHAR(30)	NOT NULL, 
	b_call_number		VARCHAR(30)	NOT NULL, 
	b_rantal_able		TINYINT	NOT NULL DEFAULT 1, 
	b_reg_date		DATETIME,
	b_mod_date		DATETIME,
	PRIMARY KEY(b_no)
	);

drop table if exists tbl_rental_book;
CREATE TABLE tbl_rental_book(
    b_no             INT,
    u_m_no           INT,
    rb_start_date    DATETIME,
    rb_end_date      DATETIME DEFAULT '1000-01-01',
    rb_reg_date      DATETIME,
    rb_mod_date      DATETIME,
    PRIMARY KEY(b_no, u_m_no)
);

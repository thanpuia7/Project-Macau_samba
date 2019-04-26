# Project-Macau_samba




CREATE SCHEMA `app_db`;

use `app_db`;



CREATE DATABASE 	app_db;


drop schema app_db;
use app_db;

CREATE TABLE user (
  email varchar(40) NOT NULL,
  name varchar(40) NOT NULL,
  password varchar(200) NOT NULL,
  PRIMARY KEY (email)

)ENGINE=InnoDB;



CREATE TABLE role(
  name varchar(40) NOT NULL,

  PRIMARY KEY (name)

) ENGINE=InnoDB;

drop table user_role;


use app_db;


CREATE TABLE user_role(

user_email varchar(40) NOT NULL,
role_name varchar(40) NOT NULL,

primary key(user_email,role_name),
 
CONSTRAINT FK_USER_1
    FOREIGN KEY (user_email) 
  REFERENCES user (email) ,
  
  CONSTRAINT FK_ROLE_2
    FOREIGN KEY (role_name) 
  REFERENCES role (name) 
  
  )ENGINE=InnoDB;
  
  
  select * from user;
  
  
  

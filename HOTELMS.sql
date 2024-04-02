create database hotelms;
use hotelms;


create table login(username varchar(25) , password varchar(25));
select * from login;
insert into login values('Kanhaiya' , 'hari123');


create table room (room_number varchar(20) , availability varchar(20) , 
cleaning_status varchar(20) , price varchar(20) , bed_type varchar(20));
select* from room;


create table employee( name varchar(20) , age varchar(20) , gender varchar(20) , 
job varchar(20) , salary varchar(20) , phone varchar(20) , email varchar(20) , 
aadhar varchar(20));
select * from employee;


create table driver( name varchar(20) , age varchar(20) , gender varchar(20) , 
car_company varchar(20) , car_name varchar(20) , available varchar(20) , 
location varchar(20));
select * from driver;


create table login2(username varchar(25) , password varchar(25));
select * from login2;
insert into login2 values('Kanhaiya' , '12345678');
create database inacap;
use inacap;
create table users(
	id int(10) primary key not null auto_increment,
	name varchar(25),
	apepat varchar(25),
	apemat varchar(25),
	username varchar(25),
	password varchar(25),
	created_at datetime,
	state varchar(25));


create table courses(
	id int(10) primary key not null auto_increment,
	name varchar (25),
	description text,
	created_at datetime,
	state varchar(25));

create table users_courses(
	id int(10) primary key not null auto_increment,
	user_id int(10),
    course_id int(10),
	created_at datetime);



insert into users(name,apepat,apemat,username,password,created_at,state)
values('Juan','Perez','Perez','jperez','secret',now(),'active');



insert into users(name,apepat,apemat,username,password,created_at,state)
values('Pedro','Rojas','Rojas','projas','secret',now(),'active');

insert into courses(name,description,created_at,state)
values('Programacion1','Sin descripcion',now(),'active');


insert into courses(name,description,created_at,state)
values('Sistema Operativo 1','Sin descripcion',now(),'active');

insert into users_courses(user_id,course_id,created_at)
values (1,1,now());

insert into users_courses(user_id,course_id,created_at)
values (1,2,now());

insert into users_courses(user_id,course_id,created_at)
values (2,2,now());

Consulta 

select users.username,courses.name from courses,users,users_courses
where users_courses.user_id=users.id
and users_courses.course_id=courses.id;

use highschool;

create table student(
s_year char(4) not null,
s_grade varchar(2) not null,
s_class varchar(2) not null,
s_num varchar(2) not null,
s_name varchar(30) not null,
s_pass varchar(12) not null default '1234',
primary key(s_year, s_grade, s_class, s_num)
);

create table teacher(
t_id varchar(15) not null primary key,
t_pass varchar(12) not null,
t_name varchar(30) not null,
t_subject varchar(40) not null,
t_type int(1) null default 9
);

create table class(
c_id integer auto_increment primary key, 
t_id varchar(15) not null,
c_name varchar(30) not null,
c_year char(4) not null,
c_semester varchar(2) not null,
c_grade varchar(2) not null,
c_class varchar(2) not null,
c_day varchar(6) not null,
c_time varchar(2) not null,
c_room varchar(20) not null,
foreign key(t_id) references teacher(t_id)
);
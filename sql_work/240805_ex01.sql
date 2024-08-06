use highschool;

drop table student;
create table student(
s_id int primary key not null,
s_year char(4) not null,
s_grade varchar(2) not null,
s_class varchar(2) not null,
s_num varchar(2) not null,
s_name varchar(30) not null,
s_pass varchar(12) not null default '1234'
);

create table teacher(
t_id varchar(15) primary key,
t_pass varchar(12) not null,
t_name varchar(30) not null,
t_subject varchar(40) not null,
t_type int(1) null default 9
);

drop table class;
create table class(
c_id integer auto_increment primary key,
t_id varchar(15) not null,
s_id int not null,
c_name varchar(30) not null,
c_year char(4) not null,
c_semester varchar(2) not null,
c_grade varchar(2) not null,
c_class varchar(2) not null,
c_day varchar(6) not null,
c_time varchar(2) not null,
c_room varchar(20) not null,
foreign key(t_id) references teacher(t_id),
foreign key(s_id) references student(s_id)
);

create table roll_book(
c_id integer not null,
s_id integer not null,
primary key(c_id, s_id),
 foreign key(s_id) references student(s_id),
 foreign key(c_id) references class(c_id)
 );
 
 create table perform(
 p_id integer auto_increment primary key,
 p_title varchar(100) not null,
 p_type char(1) null,
 p_content tinytext not null,
 p_kijun varchar(100) null,
 p_startdate date not null,
 p_enddate date not null,
 c_id integer not null,
 foreign key(c_id) references class(c_id)
 );
 
 create table evaluation(
 s_id integer not null,
 p_id integer not null,
 e_score integer not null,
 e_check int null,
 e_checkdate date null,
 primary key(p_id, s_id),
 foreign key(s_id) references student(s_id),
 foreign key(p_id) references perform(p_id)
 );
 
 show databases;
 use mysql;
 show tables;
 desc user;
 select * from user;
 
 -- 권한 지정해주기 위한 계정 생성함.
 create user mining@localhost identified by '12341234';
 
 --  drop용 계정 생성하고 삭제 연습.
 create user miningtest@localhost identified by '12341234';
 drop user miningtest@localhost;
 
 -- 권한 부여 함.
 grant all privileges on madang_univurschool.* to mining@localhost;
 
 -- 권한을 사용할 수 있게 밀어넣음.
 flush privileges;
 
 -- 보고싶은 호스트의 권한 확인하기.
 show grants for mining@localhost;
 
 grant select on madang_univurschool.department to mining@localhost;
 flush privileges;
 select * from user;
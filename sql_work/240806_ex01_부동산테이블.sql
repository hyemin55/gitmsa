use realestate;


drop table estate;
drop table person;
drop table sole;
drop table jointly;
-- 부동산필지
create table estate(
e_num varchar(15) primary key,
e_address varchar(100) not null,
e_price integer not null
);

-- 사람 테이블
create table person(
p_ssn varchar(10) primary key,
p_name varchar(20) not null,
p_phon varchar(20) not null
);


create table sole(
e_num varchar(15) not null,
p_ssn varchar(10) not null,
primary key(e_num, p_ssn),
foreign key(e_num) references estate(e_num),
foreign key(p_ssn) references person(p_ssn)
);

create table jointly(
e_num varchar(15) not null,
p_ssn varchar(10) not null,
primary key(e_num, p_ssn),
foreign key(e_num) references estate(e_num),
foreign key(p_ssn) references person(p_ssn)
);


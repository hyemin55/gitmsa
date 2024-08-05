use madang_univurschool;

-- 교수테이블
create table professor(
p_ssn varchar(12) primary key, 
p_name varchar(20) not null,
p_age int not null,
p_rank varchar(20) not null,
p_speciality varchar(30) not null
);

-- 학과테이블
create table department(
d_no integer primary key,
d_name varchar(20) not null,
d_office varchar(20) not null,
p_ssn varchar(12) not null,
foreign key(p_ssn) references professor(p_ssn)
);

-- 대학원생 테이블 
create table graduate(
g_ssn varchar(12) primary key,
g_name varchar(20) not null,
g_age integer not null,
g_deg_prog varchar(10) not null,
g_advisor varchar(12) null default '없음',
d_no integer not null,
foreign key(d_no) references department(d_no),
foreign key(g_advisor) references graduate(g_ssn)
);

-- 과제 테이블
create table project(
pj_pid integer primary key,
pj_sponsor varchar(20) not null,
pj_start_date date not null,
pj_end_date date null,
pj_budget integer not null default 0
);

-- 릴레이션 테이블 생성 --
-- 한 교수가 여러 학과에서 근무할 수 있는데, 이때 학과별로 참여백분율이 기록된다.
create table work_dept(
w_pct_time integer not null,
p_ssn varchar(12) not null, 
d_no integer not null,
primary key(p_ssn, d_no),
foreign key(p_ssn) references professor(p_ssn),
foreign key(d_no) references department(d_no)
);

-- 과제는 한 사람 이상의 교수(공동연구책임자)에 의해 수행된다.
-- 과제는 한 교수(연구책임자)에 의해 관리된다.
-- 중복 방지로 primary key에 과제와 교수를 복합키로 설정한다.
create table work_in(
pj_pid integer not null,
p_ssn varchar(12) not null,
pj_manage varchar(12) not null,
primary key(pj_pid, p_ssn),
foreign key(pj_manage) references professor(p_ssn),
foreign key(pj_pid) references project(pj_pid),
foreign key(p_ssn) references professor(p_ssn)
);

-- 한 과제는 한 명 이상의 대학원생에 의해 수행된다.
-- 한 과제에 한 명의 대학원생이 계속 중복되는걸 막기위해 primary key를 생성해 중복을 없애준다.
create table work_prog(
pj_pid integer not null,
g_ssn varchar(12) not null,
primary key(pj_pid, g_ssn),
foreign key(pj_pid) references project(pj_pid),
foreign key(g_ssn) references graduate(g_ssn)
);



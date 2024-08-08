use madangdb;

delimiter //
create procedure dorepeat(p1 INT)
begin
set @x = 0;
repeat set @x = @x + 1; until @x > p1 end repeat;
end //

query ok, 0 rows affected (0.00 sec)
delimiter;
call dorepeat(1000);
query ok, 0 rows affected (0.00 sec)
select @x;
@x
1001
1 row in set (0.00 sec)

delimiter //
create procedure insertbook(
in mybookid integer,
in mybookname varchar(40),
in mypublisher varchar(40),
in myprice integer)
begin
insert into book(bookid, bookname, publisher, price)
values(mybookid, mybookname, mypublisher, myprice);
end //

call insertbook(13, '스포츠과학', '마당과학서적', 25000);
select * from book;

delimiter //
create procedure insertbookorupdate(
mybookid integer,
mybookname varchar(40),
mypublisher varchar(40),
myprice int)
begin
declare mycount integer;
select count(*) into mycount from book
where bookname like mybookname;

if mycount!=0 then
set sql_safe_updates=0;
update book set price = myprice
where bookname like mybookname;
 else
 insert into book(bookid, bookname, publisher, price)
 values(mybookid, mybookname, mypublisher, myprice);
 end if;
 end;
 //
 -- delimiter;
 
 call insertbookorupdate(15, '스포츠 즐거움', '마당과학서적', 25000);
 select * from book;
 delimiter //
 call insertbookorupdate(15, '스포츠 즐거움', '마다과학서적', 20000);
 end //
 delimiter //
 create procedure averageprice(
 out averageval integer)
 begin
 select avg(price) into averageval
 from book where price is not null;
 end; //
 
 call averageprice(@myvalue);
 select @myvalue;
 
  select * from book;
  
  set global log_bin_trust_function_creators=on;
  -- 트리거를 위한 테이블 생성
  create table book_log(
  bookid_l integer,
  bookname_l varchar(40),
  publisher_l varchar(40),
  price_l integer);
  
  delimiter //
  create trigger afterinsertbook
  after insert on book for each row
  begin
  declare average integer;
  insert into book_log
  values(new.bookid, new.bookname, new.publisher, new.price);
  end //
  
  
 -- 240808 ex) 푸드코트 ERD 
  create table corner(
  c_id varchar(6) primary key,
  c_name varchar(20) not null
  );
  
  create table menus(
  m_id varchar(6) primary key,
  m_name varchar(20) not null,
  m_price integer not null,
  c_id varchar(6),
  foreign key c_id references corner(c_id)
  );
  
  creat table orders(
  o_id varchar(6) not null,
  m_id varchar(6) not null,
  o_cnt integer not null,
  o_date date not null,
  o_status char(1) null,
  o_saleprice integer,
  foreign key m_id references nemus(m_id),
  primary key(o_id, m_id)
  );
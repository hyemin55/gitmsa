-- 1 --
select bookname
from book
where bookid=1;

-- 2 --
select bookname
from book
where price >= 20000;

-- 3 --
select sum(saleprice)
from customer, orders
where name = '박지성' and orders.custid = customer.custid;

-- 4 --
select count(orderid)
from orders, customer
where name = '박지성' and orders.custid = customer.custid;

-- 5 --
select count(distinct publisher)
from customer, book, orders
where name = '박지성' and orders.custid = customer.custid and book.bookid = orders.bookid;

-- 6 --
select bookname, price, (saleprice - price) as '할인금액'
from book, orders, customer
where name = '박지성' and orders.custid = customer.custid and book.bookid = orders.bookid;

-- 7 --
select bookname
from book, orders, customer
where customer.name <> '박지성' and orders.custid = customer.custid and book.bookid = orders.bookid;

select bookid, bookname
from book
where book.bookid in 
(select bookid
from orders, customer
where customer.name <> '박지성' and orders.custid = customer.custid);

-- 8 --
select  count(distinct bookname) 
from madangdb.book;

-- 9 --
select  count(distinct publisher)
from madangdb.book;

-- 10 --
select name, address
from customer;

-- 11 -- 
select bookname, orderdate
from book, orders
where (orderdate between '2024-07-04' and '2024-07-07') 
and book.bookid = orders.bookid;

-- 12 --
select name, address
from customer
where name like ('김%');

-- 13 --
select name, address
from customer
where name like ('김%아');

-- 14 --
select sum(saleprice), cast(avg(saleprice) as signed)
from orders;

-- 15 --
select name, sum(saleprice)
from orders, customer
where orders.custid = customer.custid
group by customer.name;

-- 16 --
select name, bookname
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid
order by name, bookname;


select name, orderdate, bookname, address
from customer, book, orders
where customer.custid = orders.custid and book.bookid = orders.bookid
order by name, orderdate, bookname;

select bookname, price
from book
where price = (select max(price) from book);
-- sql문 안에 sql문이 또 들어가 있는 것을 서브쿼리라고한다.

-- join과 subquery 두가지 방법이 있다.
select distinct name
from orders, customer
where customer.custid=orders.custid;

select name
from customer
where custid in (select distinct custid from orders);

select C.name, count(O.orderid)
from customer C, orders O
where C.custid=O.custid
group by name
order by count(O.orderid) desc;

select name, orderid
from customer, orders
where  customer.custid = orders.custid and orderid = 
(select orders.orderid
from orders, book
where orders.bookid = book.bookid and book.publisher = '대한미디어');

select name, orderid, publisher
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid and
book.publisher = '대한미디어';

SELECT YEAR(orderdate), COUNT(*) as Amount
FROM madangdb.orders
GROUP BY YEAR(orderdate) 
HAVING Amount>1;

-- 대한민국에 거주하는 고객의 
select name
from customer
where address like '대한민국%'
-- 위아래로 붙여 값이 나온다. 
-- 중복된 값은 자동으로 생략하고 
-- 생략없이 출력하고 싶으면 union all 을 적어준다.
-- 다른 sql에선 union말고 다른 단어 사용할 수 있다.
union 
select name
from customer
where custid in(select custid from orders);


-- 주문이 있는 고객의 이름과 주소를 나타내시오.
select name, address
from customer
where exists (select * from orders where customer.custid = orders.custid);

create table NewBook(
 bookid integer primary key,
 bookname varchar(20),
 publisher varchar(20),
 price integer
 );
 
 create table NewCustomer(
 custid integer primary key,
 name varchar(40),
 address varchar(40),
 phone varchar(30)
 );
 
 create table NewOrders(
 orderid integer primary key,
 custid integer not null ,
 bookid integer not null,
 saleprice integer,
 orderdate date,
 FOREIGN key (custid) references newcustomer(custid) on delete cascade
 );
 
 describe newbook;
 alter table newbook add isbn varchar(13);
 alter table newbook modify isbn integer;
 alter table newbook drop column isbn;
 alter table newbook modify bookname varchar(20) not null;
 alter table newbook add primary key (bookname, publisher);
 delete from newbook where bookid='1';
 drop table newbook;

-- 해당 열의 위치를 알면 내용만 기입해도 되는데 보통은 내용이 많기때문에 어느열에 어떤 내용을 넣을지 명확하게 적어준다. --
insert into book(bookid, bookname, publisher, price)
values(11, '스포츠 의학', '한솔의학서적', 90000);
select * from book;

-- 1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
-- 2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
-- 3) 전체 고객의 30%이상이 구매한 도서 

-- 240731 ex01 --
select name
from book, customer, orders
where book.bookid=orders.bookid and customer.custid=orders.custid and
publisher in (select publisher
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid and
customer.name= '박지성');

select publisher , name
from book, customer, orders
where book.bookid=orders.bookid 
and customer.custid=orders.custid 
and publisher in (select publisher
from book , customer , orders 
where  book.bookid= orders.bookid 
and customer.custid= orders.custid and name = '박지성' 
);

-- 240731 ex02 --
select name, count(distinct book.publisher)
from customer, orders, book
where customer.custid = orders.custid and book.bookid = orders.bookid
group by name
having count(distinct book.publisher) >=2 ;

-- 3) 전체 고객의 30%이상이 구매한 도서 
-- 240731 ex03 --
select bookname
from book, orders, customer
where customer.custid = orders.custid and book.bookid = orders.bookid and
customer.custid
group by orders.orderid
;

-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- 
-- datediff

-- 절대값 사용 
select ABS(-78), ABS(78);

-- 반올림 함수 ( ,1)<- 소수점 1자리까지 나올 수 있도록. 없으면 정수 출력.
select round(4.875, 1);

-- ex) 고객별 평균 주문 금액을 100원 단위로 반올림한 값을 구하세요.
select customer.name, round(avg(saleprice) ,-2)
from customer, orders
where customer.custid=orders.custid
group by orders.custid;

-- 출력값을 대문자 또는 소문자로 변경할 때(대소문자 구분없이 로그인이 가능하게 할때 자주 사용한다.)
select lower('MR.SCOTT');
select upper('mr.scoot');

--
select lpad('Page 1', 10, "*");

-- 
select replace('jack & jue', 'j', 'bl');

-- 글자를 배열로 인식하여 3번째 자리부터 4글자를 추출해온다.
select substr('ABCDEFG',3,4);

-- 글자의 앞부분 공백과 뒷부분 공백을 자른다. (ltrim은 왼쪽만, rtrim은 오른쪽만)
select trim('=' from"= A= B= C= D= E =");

-- ex) 도서 제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 나타내세요.
select replace(bookname, "야구", "농구")
from book;

-- ex) 굿스포츠에서 출판한 도서의 제목과 제목의 문자 수, 바이트 수를 출력하세요.
select bookname, length(bookname), char_length(bookname)
from book
where publisher = '굿스포츠';

--  ex) 마당서점의 고객 중에서 성이 같은 사람이 몇명이나 되는지 알고싶다. 성별 인원수를 구하시오.
select substr(name, 1,1) '성', count(*) 인원수
from customer
group by substr(name, 1, 1);

-- 날짜 함수. 
select adddate('2024-07-01', interval -5 day)before5,
adddate('2024-07-28', interval 5 day) after5;

-- ★★★★★★ ex) 마당서점은 주문일로부터 10일 후에 매출을 확정한다. 각 주문의 확정일자를 구하시오.★★★★★★★★★
select orders.orderdate 주문일자, adddate(orderdate, 10) 확정일자
from orders;

-- ex) 2024년 7월 7일 주문받은 도서를 모두 나타내세요. 단 주문일은 240704, Jul 04 2024, 24-07-04 Thu 형태로.
select orders.orderid, orders.orderdate, customer.name, book.bookname, date_format(orders.orderdate,'%y%m%d') 주문일, date_format(orders.orderdate, '%b %d %Y') 주문일, date_format(orders.orderdate, '%y-%m-%d %a') 주문일
from orders, book, customer
where orders.bookid=book.bookid and customer.custid=orders.custid and
orders.orderdate = '2024-07-04';

-- View 만들기 orders를 기준으로 만들기 때문에 select에 뽑아낼 잘 생각해야한다.
-- View는 논리적인 가상테이블 공간이라고 한다.
create view Vorders
as select orderid, O.custid, name, O.bookid, bookname, saleprice, orderdate
from customer C, orders O, book B 
where C.custid = O.custid and B.bookid = O.bookid;

select * from vorders;

-- ex) 대한민국에 거주하는 고객들로 구성된 뷰를 만들고 조회하세요. 뷰 이름은 vw_Customer
create view vw_Customer
as select custid, name, address, phone 
from customer C
where C.address = '%대한민국%';

-- ex) orders테이블에서 고객명과 도서명을 확인할 수 있는 뷰를 생성한 후, 
-- 김연아 고객이 구입한 도서의 주문번호, 도서명, 주문액을 출력하세요.
create view vw_total
as select C.name, O.orderid, O.bookid, B.bookname, O.saleprice, O.custid
from orders O, book B, customer C
where O.custid = C.custid and B.bookid = O.bookid;

select orderid, name, bookname, saleprice
from vw_total
where name='김연아';

-- Null값은 집계함수를 사용할 때 집계에서 제외된다.
select count(address) 주소, count(phone)전화번호
from customer;

create table Mybook(
bookid integer primary key,
price integer );

insert into mybook values(1,10000);
insert into mybook values(2,20000);
insert into mybook values(3,null);
insert into mybook(bookid) values(4);

select * from mybook;

-- Null은 값이 없으므로 100이 추가되지 않고 Null로 출력된다.
select price+100
from mybook
where bookid = 3;

select sum(price), round(avg(price)), count(*), count(price) 'price-null값이 포함되지 않음'
from mybook;

select sum(price), avg(price), count(*), count(price)
from mybook
where bookid >= 5;

-- null의 갯수를 출력하자.
select count(*)
from mybook
where price is null;

select *
from mybook
where price = 0;

-- ifnull은 해당 칼럼에 null값이 있으면 '원하는 필드명'으로 바꿔표시해준다.
select name'이름', ifnull(phone,'연락처없음')'전화번호'
from customer;

select bookid 주문번호, ifnull(price,'가격미입력')정가
from mybook;

-- 240801 ex01 --
-- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요. --
select emp.ENAME'사원이름',emp.JOB'사원직위'
from emp;

-- 240801 ex02 --
-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요. --
select emp.ENAME'사원이름', emp.SAL'급여'
from emp;

-- 240801 ex03 --
-- 3) 사원번호와 이름, 현재 급여, 증가한 급여분(열 이름은 '증가액'), 10% 인상된 급여(열 이름은 '인상된 급여')를 사원번호순으로 출력하세요. --
select emp.EMPNO'사원번호', emp.ENAME'사원이름', emp.SAL'현재급여', emp.COMM'증가액', (emp.SAL*1.1)'인상된급여'
from emp
order by emp.EMPNO;

-- 240801 ex04 --
-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요. --
select emp.ENAME'사원이름', emp.DEPTNO'부서번호'
from emp
where emp.ENAME like 'S%';

-- 240801 ex05 --
-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요. --
select max(emp.SAL)'MAX', min(emp.SAL)'MIN', sum(emp.SAL)'SUM', round(avg(emp.SAL))'AVG'
from emp;

-- 240801 ex06 --
-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
select dept.DNAME'업무이름', count(emp.EMPNO)
from emp, dept
where emp.DEPTNO = dept.DEPTNO
group by emp.DEPTNO;

-- 240801 ex07 --
-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요. --
select (max(emp.SAL) - min(emp.SAL))'차액'
from emp
where JOB = 'CLERK';

-- 240801 ex08 --
-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요. --
select count(emp.DEPTNO)'구성원 수', sum(emp.SAL)'합계', round(avg(emp.SAL), 1)'평균'
from emp
group by emp.DEPTNO;

-- 240801 ex09 -- 
-- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요. --
select emp.DEPTNO
from emp, dept
where emp.DEPTNO = dept.DEPTNO
group by emp.DEPTNO
having avg(emp.SAL);


-- 240801 ex10 --
-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서, 
-- 업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다. --
select JOB, SAL
from emp, dept
where job != 'salesman'
group by job
order by sal
having avg(sal) >= 3000; 

-- 240802 시작-- ================================================
set @seq:=0;

select (@seq:=@seq+1) '순번', custid, name, phone
from customer
where @seq < 3;

select sum(saleprice)
from orders
where custid = (select custid from customer where name = '박지성');

-- 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 나타내시오.  --
select orderid, custid, saleprice
from orders od1
where saleprice > (select avg(saleprice) from orders od2 where od1.custid = od2.custid);

select orderid, custid, saleprice
from orders od1
where saleprice <= (select avg(saleprice) from orders od2 where od1.custid = od2.custid);
 
 -- max를 사용해서 구해도 된다.
 select orderid, saleprice
 from orders
 where saleprice > all (select saleprice
 from orders
 where custid = 3);
 
 --  부속질의 -> 첫 select는 주질의이고 from(select)가 부속질의이다.
 -- 고객번호가 2이하인 고객의 판매액을 나타내시요(고객이름과 고객별 판매액 출력).
 -- from에 조건을 건 테이블을 cs라고 이름을 주고 where 조건절에 cs테이블을 기존테이블과 연결해주고 
 -- cs테이블의 이름을 그룹으로 묶은 뒤 원하는 내용을 추출한다.
 select cs.name, sum(od.saleprice) 'total'
 from (select custid, name
 from customer
 where custid <= 2) cs,
 orders od
 where cs.custid = od.custid
 group by cs.name;
 
 
 
 -- 인덱스는 가능하면 중복되지 않는 값(유니크)을 걸어줘야하고 검색속도를 높여줄 수 있는 칼럼을 걸어줘야 효율적이다.
 -- 한 테이블의 칼럼이 10개인 곳에 5개의 인덱스를 걸면 오히려 검색이 느려진다.
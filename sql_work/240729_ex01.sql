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
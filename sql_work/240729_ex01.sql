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
where name != '박지성' and orders.custid = customer.custid and book.bookid = orders.bookid;

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

select name, count(orderid)
from customer, orders
where customer.custid=orders.custid
group by name
order by count(orderid) desc;
select c.custname, c.city, s.name, s.city
from deal d
    join customer c on d.customer_id = c.customer_id
    left join salesman s on c.salesman_id = s.salesman_id
where d.amount > 10000;


select c.custname, c.city
from customer c
where exists (select * from deal d where d.customer_id = c.customer_id and extract(year from d.date_deal) in (2017,2018));


select c.custname, sum(d.amount)
from deal d
left join customer c on d.customer_id = c.customer_id
where extract(year from d.date_deal) = 2017
    and extract(month from d.date_deal) = 8
group by c.custname
having sum(d.amount) >= all(
        select sum(amount) from deal
        where extract(year from date_deal) = 2017
            and extract(month from date_deal) = 8 group by customer_id
);

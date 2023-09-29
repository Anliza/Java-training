CREATE TABLE IF NOT EXISTS items(itemcode INT, quantity INT, unitprice DOUBLE PRECISION,totalprice DOUBLE PRECISION); 

insert into items (itemcode, quantity, unitprice, totalprice)values(?,?,?,?);
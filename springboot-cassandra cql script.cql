//create a springboot Cassandra keyspace
CREATE KEYSPACE IF NOT EXISTS springboot WITH replication = {'class':'SimpleStrategy', 'replication_factor':1};

//create inventories table in springboot keyspace
CREATE TABLE IF NOT EXISTS  springboot.inventories (
    id UUID,
    product_name varchar,
    stock_available varchar,
    lot_name varchar,
    date_first_available date,
    primary key((id))
);
create table products
(
    id    bigserial primary key,
    name  varchar(128) not null,
    price integer      not null
);

create table orders
(
    id      bigserial primary key,
    client  varchar(128),
    date    date,
    time    time,
    address varchar(128)
);

create table purchase_item
(
    id         bigserial primary key,
    order_id   bigint,
    product_id bigint,
    count      integer,
    constraint fk_purchase_item_orders foreign key (order_id) references orders (id),
    constraint fk_purchase_item_products foreign key (product_id) references products (id)
);
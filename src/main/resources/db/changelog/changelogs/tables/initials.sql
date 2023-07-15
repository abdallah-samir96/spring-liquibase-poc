create table orders (created_at timestamp(6), id bigserial not null, updated_at timestamp(6), name varchar(255), primary key (id));
create table product (created_at timestamp(6), id bigserial not null, order_id bigint, price bigint, updated_at timestamp(6), name varchar(255), size varchar(255) check (size in ('MEDIUM','SMALL','LARGE')), primary key (id));
alter table if exists product add constraint FK18j7hot76crqfb6x6xn7mlxt6 foreign key (order_id) references orders;

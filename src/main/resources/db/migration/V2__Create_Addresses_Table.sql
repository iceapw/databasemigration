create table addresses
(
    id      bigint auto_increment
        primary key,
    street  varchar(255) not null,
    city    varchar(255) not null,
    state   varchar(255) not null,
    zip     varchar(255) not null,
    user_id bigint       not null,
    constraint user_id
        foreign key (user_id) references users (id)
);



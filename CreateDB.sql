-- create the database
-- drop if any exists
-- select the database
-- create the table

drop database if exists workshop_two;

create database workshop_two;

use workshop_two;

create table rsvp (
    email varchar(64) not null,
    phone int not null, 
    confirmation_date date not null,
    comments varchar(256),
    -- name varchar(128) not null,
    constraint PK_email primary key (email) -- make primary key email unique- check for 8 digits
);

-- now load thru command line client mysql
-- source SCRIPT.sql
use prj301
go
create table users (
	username varchar(100) primary key,
	name varchar(100),
	password varchar(30)
);
insert users (username, password, name) values ('duc','duc', 'Van Duc') ;
insert users (username, password, name) values ('nam', 'nam', 'Bao Nam') ;

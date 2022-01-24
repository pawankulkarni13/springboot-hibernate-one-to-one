drop table IF EXISTS bank_details cascade;
drop table IF EXISTS staff cascade;
drop table IF EXISTS  address cascade;
drop table IF EXISTS student cascade;

create table IF NOT EXISTS student (
	s_id int PRIMARY KEY AUTO_INCREMENT,
	s_name varchar(20) NOT NULL,
	s_class varchar(20)
);

create table IF NOT EXISTS address (
	address_id int PRIMARY KEY AUTO_INCREMENT,
    street varchar(40) NOT NULL,
    city varchar(40) NOT NULL,
    pincode int,
    stud_id int,
    FOREIGN KEY (stud_id) REFERENCES student(s_id)
);

create table IF NOT EXISTS staff (
	staff_id int PRIMARY KEY AUTO_INCREMENT,
	staff_name varchar(20) NOT NULL,
	staff_dept varchar(20) NOT NULL
);

create table IF NOT EXISTS bank_details (
	staff_id int PRIMARY KEY,
	account_number varchar(20) NOT NULL,
	ifsc_code varchar(20) NOT NULL,
	bank_name varchar(20) NOT NULL
);
commit;
insert into student (s_id, s_name, s_class) values (1, 'Pawan', 'ISE');
insert into student (s_id, s_name, s_class) values (2, 'Naveen', 'EEE');
insert into student (s_id, s_name, s_class) values (3, 'Mahadev', 'CSE');
insert into student (s_id, s_name, s_class) values (4, 'Sandeep', 'ICE');
commit;
insert into address (address_id, street, city, pincode, stud_id) values (1, '1 Road', 'Hubli', 580021, 1);
insert into address (address_id, street, city, pincode, stud_id) values (2, '2 Road', 'Dharwad', 580020, 2);
insert into address (address_id, street, city, pincode, stud_id) values (3, '3 Road', 'Belgaum', 5008, 3);
insert into address (address_id, street, city, pincode, stud_id) values (4, '4 Road', 'Mishrikote', 5009, 4);

insert into staff (staff_id, staff_name, staff_dept) values (1, 'Mankame Sir', 'ISE');
insert into staff (staff_id, staff_name, staff_dept) values (2, 'Arun Sir', 'EEE');
insert into staff (staff_id, staff_name, staff_dept) values (3, 'Sajan Sir', 'ISE');
insert into staff (staff_id, staff_name, staff_dept) values (4, 'Principal Sir', 'CSE');

insert into bank_details (staff_id, account_number, ifsc_code, bank_name) values (1, '12345', 'SBI00100', 'SBI');
insert into bank_details (staff_id, account_number, ifsc_code, bank_name) values (2, '23456', 'IOB00192', 'IOB');
insert into bank_details (staff_id, account_number, ifsc_code, bank_name) values (3, '34567', 'ICICI001', 'ICICI');
insert into bank_details (staff_id, account_number, ifsc_code, bank_name) values (4, '45678', 'HDFC0100', 'HDFC');

commit;
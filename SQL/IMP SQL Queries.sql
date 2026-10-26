-- create query
create database nehal;
-- show query
show databases;
-- retrieve all 
select *from student;
-- create table 
create table  students(id int(9)primary key,name varchar(100) not null,city varchar(500));
-- describe table values
desc students;
-- alter values
alter table students add phoen varchar(10);
-- modify table 
alter table students modify phoen varchar(20);
-- drop column
alter table students drop column bookings;
-- insert/add values into table 
insert into students(id,name,city,phone) values(12,"Ankit tiwari","mumbai","kali"),(26,"Nehal Patil","mumbai","kali");
-- update students
update students set name="nehal",city ="lucknow" where id=12;
-- count students
   select count(id) from students where city="mumbai";
   -- name starts with or end with
   select * from students where name like "%i";
   select * from students where name like "i%";
-- primary key and create table command
create table department(DepartmentsID int primary key,
DeaprtmentName varchar(50)
);
-- foreign key 
create table Employee(EmployeeID int primary key,
 name varchar(50),
 DepartmentID int,
 foreign key(DepartmentsID) references department(DepartmentID)
);
  ---- code for find second highest salary
select max(salary) from employees where salary<(select max(salary) from employees);

-- code for 3 highest salaries
select distinct salary from employess order by salary desc limit 3;

-- code for calculate age from date of birth
select name,Year(curdate())-year(dob) as age from employee;


-- code for calculate odd or even records in sql

select *from employee where MOD(empId,2)=0;
select *from employee where MOD(empID,2)=1;

-- duplicate emails in employee table
select email,count(email) as duplicateCount from employee group by email
having count(email) >1;
--  find highest salary code for 
select max(salary) from employee;

-- find max salary as per department
select department,max(salary) as highestSalary
from employee
group by department;

-- find first 5 records
select *from Employee limit 5;

-- code to find number of employees in each department
select department,count(EmpID) as countEmp
from employee 
group by department;

-- count last 3 records from table
select *from employee
order by empID desc
limit 3;

-- count employees without managers
select name,EmpID
from employee
where ManagerID IS null;

-- find employee whose name starts with A
select name from employee
where name like '%A';

-- swap two columns
update employee
set firstname=@temp :=firstname,
firstname=lastname,
lastname=@temp;

CREATE TABLE student (
    id INT,
    name VARCHAR(50),
    course_id INT
);
CREATE TABLE employee (
    emp_id INT,
    emp_name VARCHAR(50),
    dept_id INT,
    manager_id INT
);
CREATE TABLE department (
    dept_id INT,
    dept_name VARCHAR(50)
);
INSERT INTO employee VALUES
(1,'Sai',101,4),
(2,'Ravi',102,4),
(3,'Anu',103,5),
(4,'Teja',101,NULL),
(5,'Kiran',104,NULL),
(6,'Priya',101,4),
(7,'Rahul',102,5),
(8,'Divya',NULL,4),
(9,'Manoj',103,5),
(10,'Sneha',NULL,NULL);

INSERT INTO department VALUES
(101,'IT'),
(102,'HR'),
(103,'Sales'),
(104,'Finance'),
(105,'Testing'),
(106,'Support'),
(107,'Admin'),
(108,'DevOps'),
(109,'Marketing'),
(110,'Security');


select * from employee;

select * from  department;

select * from employee as e inner join department as d on e.dept_id=d.dept_id;

select e.emp_name,d.dept_name from employee as e left join department as d on e.dept_id=d.dept_id where d.dept_name is null;

sele

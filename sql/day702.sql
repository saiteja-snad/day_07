create  table student(id int,name varchar(50),email varchar(50),age int,course varchar(50),marks int);INSERT INTO student (id, name, email, age, course, marks) VALUES
(1, 'Sai', 'sai@gmail.com', 20, 'Java', 85),
(2, 'Ravi', 'ravi@gmail.com', 21, 'Python', 78),
(3, 'Anu', 'anu@gmail.com', 19, 'CSE', 92),
(4, 'Kiran', 'kiran@gmail.com', 22, 'Java', 67),
(5, 'Teja', 'teja@gmail.com', 20, 'ECE', 88),
(6, 'Priya', 'priya@gmail.com', 21, 'Python', 95),
(7, 'Rahul', 'rahul@gmail.com', 23, 'EEE', 72),
(8, 'Divya', 'divya@gmail.com', 20, 'Java', 81),
(9, 'Manoj', 'manoj@gmail.com', 22, 'CSE', 76),
(10, 'Sneha', 'sneha@gmail.com', 19, 'ECE', 90);
select *from student;

select * from student where marks>85;

select * from student where marks=85;

select * from student where marks!=85;

insert into student values(11,'parasd','prasad@gamil.com',23,'CSE',90);

select * from student where id=1;

select max(marks) from  student where marks<(select max(marks) from student);

select course,count(*) from student group by course having count(*)>1;

select *from student where marks>(select avg(marks) from student);

select * from student order by marks desc limit 1 offset n-1;

select 
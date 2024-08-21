create database Students
use Students
CREATE TABLE Stud(
RollNo INT PRIMARY KEY,
SName VARCHAR(45),
Age INT,
Gender VARCHAR(10),
Course VARCHAR(50)
);
SELECT * FROM Stud;
INSERT INTO Stud(RollNo,SName,Age,Gender,Course)
VALUES(101,'C.ayushadevi',26,'Female','ECE'),
(102,'S.kavi',20,'Female','CSE'),
(103,'A.anisha',25,'Female','AI&DS'),
(104,'T.preethi',28,'Female','Agri');

UPDATE Stud
SET Age=22,Course='Physics'
WHERE RollNo=104;
DELETE FROM Stud
WHERE RollNo=101;

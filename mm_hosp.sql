create database MM_Hospital
use MM_Hospital
CREATE TABLE Patient(
Patient ID INT PRIMARY KEY,
pName VARCHAR(45),
Age INT,
Gender VARCHAR(10),
Problem VARCHAR(50)
);
SELECT * FROM Patient;
INSERT INTO Patient(PatientId,pName,Age,Gender,Problem)
VALUES(20241,'Subash',20,'Male','Head Pain'),
(20242,'Thilak',21,'Male','Dysentery'),
(20243,'Chandru',20,'Male','Fever'),
(20244,'Arish',22,'Male','Cold');

SELECT * FROM Patient;

DELETE FROM Patient
WHERE PatientId=20242;

ALTER TABLE Patient
ADD Diagnosis VARCHAR(50);

SELECT * FROM Patient
ORDER BY PatientId ASC;

SELECT PName,COUNT(*) AS num_Patient
FROM Patient
GROUP BY Diagnosis;


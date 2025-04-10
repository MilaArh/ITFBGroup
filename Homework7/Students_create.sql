CREATE TABLE students (
	id BIGSERIAL PRIMARY KEY,
	name VARCHAR(64) NOT NULL,
	family VARCHAR(64) NOT NULL,
	email VARCHAR(64) NOT NULL
);

CREATE TABLE exams (
	id BIGSERIAL PRIMARY KEY,
	subject VARCHAR(64) NOT NULL,
	grade INT NOT NULL,
	teacher VARCHAR(64) NOT NULL,
	student_id BIGINT REFERENCES students(id) NOT NULL
  --CONSTRAINT student_id_fk FOREIGN KEY (student_id) REFERENCES student (id)
);


INSERT INTO students (name, family, email)
VALUES
	('Ivan', 'Ivanov', 'ivan@test.com'),
	('Petr', 'Petrov', 'petr@test.com'),
	('Ivan', 'Petrov', 'ivan01@test.com'),
	('Alex', 'Sidorov', 'alex@test.com');

UPDATE students
SET email = 'new@test.com'
WHERE id = 1;

DELETE FROM students
WHERE  id = 4;


--INSERT INTO exams (subject, grade, teacher, student_id)
--VALUES
--	('sql', 5,'Mask', 1),
--	('sql', 4,'Mask', 2),
--	('sql', 2,'Mask', 3),
--	('load test', 5,'Smith', 3),
--	('load test', 5,'Smith', 1),
--   ('load test', 3,'Smith', 2);

INSERT INTO students (name, family, email)
VALUES
	('Alex', 'First', 'first@test.com');  

	INSERT INTO students (name, family, email)
VALUES ('${name}', '${family}', '${name}@test.com'); 

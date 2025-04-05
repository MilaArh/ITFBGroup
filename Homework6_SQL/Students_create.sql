CREATE TABLE students (
	id BIGINT NOT NULL PRIMARY KEY,
	name VARCHAR(64) NOT NULL,
	family VARCHAR(64) NOT NULL,
	email VARCHAR(64) NOT NULL
);

CREATE TABLE exams (
	id BIGINT NOT NULL PRIMARY KEY,
	subject VARCHAR(64) NOT NULL,
	grade INT NOT NULL,
	teacher VARCHAR(64) NOT NULL,
	student_id BIGINT REFERENCES students(id) NOT NULL
  --CONSTRAINT student_id_fk FOREIGN KEY (student_id) REFERENCES student (id)
);


INSERT INTO students (id, name, family, email)
VALUES
	(1, 'Ivan', 'Ivanov', 'ivan@test.com'),
	(2, 'Petr', 'Petrov', 'petr@test.com'),
	(3, 'Ivan', 'Petrov', 'ivan01@test.com'),
	(4, 'Alex', 'Sidorov', 'alex@test.com');

UPDATE students
SET email = 'new@test.com'
WHERE id = 1;

DELETE FROM students
WHERE  id = 4;


INSERT INTO exams (id, subject, grade, teacher, student_id)
VALUES
	(1, 'sql', 5,'Mask', 1),
	(2, 'sql', 4,'Mask', 2),
	(3, 'sql', 2,'Mask', 3),
	(4, 'load test', 5,'Smith', 3),
	(5, 'load test', 5,'Smith', 1),
    (6, 'load test', 3,'Smith', 2);

INSERT INTO students (id, name, family, email)
VALUES
	(4, 'Alex', 'First', 'first@test.com');   

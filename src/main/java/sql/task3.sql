-- Task:
-- Create a `people` table with the following columns:
-- - first_name – maximum 20 characters,
-- - last_name – maximum 20 characters,
-- - age – an integer value.
-- Then:
-- - Insert one person: 'Tina', 'Belcher', 13
-- - Insert a second person: 'Bob', 'Belcher', 42
-- - Insert multiple people at once:
--     'Linda', 'Belcher', 45
--     'Phillip', 'Frond', 38
--     'Calvin', 'Fischoeder', 70

CREATE TABLE people (
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	age INT NOT NULL
	);

INSERT INTO people (first_name, last_name, age)
VALUES ('Tina', 'Belcher', 13);

INSERT INTO people (first_name, last_name, age)
VALUES ('Bob', 'Belcher', 42);

INSERT INTO people (first_name, last_name, age)
VALUES
    ('Linda', 'Belcher', 45),
    ('Phillip', 'Frond', 38),
    ('Calvin', 'Fischoeder', 70);

SELECT * FROM people;
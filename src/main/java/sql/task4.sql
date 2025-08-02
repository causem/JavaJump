-- Task:
-- Define an `employees` table with the following fields:
-- - id: number, automatically increments, primary key
-- - last_name: text, mandatory
-- - first_name: text, mandatory
-- - middle_name: text, not mandatory
-- - age: number, mandatory
-- - current_status: text, mandatory, defaults to 'employed'

CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    last_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(100) NOT NULL,
    middle_name VARCHAR(100),
    age INT NOT NULL,
    current_status VARCHAR(50) NOT NULL DEFAULT 'employed'
);


INSERT INTO employees (
    last_name,
    first_name,
    middle_name,
    age,
    current_status
) VALUES (
    'Smith',
    'John',
    'Edward',
    35,
    'employed'
);

INSERT INTO employees (
    last_name,
    first_name,
    age,
    current_status
) VALUES (
    'Doe',
    'Jane',
    28,
    'on leave'
);

INSERT INTO employees (
    last_name,
    first_name,
    age
) VALUES (
    'Brown',
    'Charlie',
    41
);

SELECT * FROM employees;
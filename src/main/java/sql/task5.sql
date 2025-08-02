CREATE TABLE cats (
    cat_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    breed VARCHAR(100),
    age INT,
    PRIMARY KEY (cat_id)
);

INSERT INTO
cats(name, breed, age)
VALUES
('Ringo', 'Tabby', 4),
('Cindy', 'Maine Coon', 10),
('Dumbledore', 'Maine Coon', 11),
('Egg', 'Persian', 4),
('Misty', 'Tabby', 13),
('George Michael', 'Ragdoll', 9),
('Jackson', 'Sphynx', 7);

-- select only id of cats
SELECT cat_id from cats;


-- select names and breeds of cats
SELECT name, breed from cats;


-- select names and breeds of cats
SELECT name, age from cats WHERE breed = 'Tabby';

-- select cat_id and age where value of  id is equal to age
SELECT cat_id, age
FROM cats
WHERE cat_id = age;
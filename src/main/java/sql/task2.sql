-- Create a `pastries` table.
-- It should include 2 columns: name and quantity.
-- Name must be a maximum of 50 characters.
-- Inspect your table and columns in the CLI.
-- Then delete your table!

CREATE TABLE pastries (
    name VARCHAR(50) NOT NULL,
    quantity INT NOT NULL
);

DROP TABLE pastries;
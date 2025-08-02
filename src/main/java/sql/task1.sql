-- Draw a `Tweets` table.
-- The table must include at minimum the following columns:
-- - a username (maximum 15 characters),
-- - the tweet content (maximum 140 characters),
-- - number of favorites.
-- Make sure to specify correct MySQL datatypes.

CREATE TABLE tweets (
    username VARCHAR(15) NOT NULL,
    content VARCHAR(140) NOT NULL,
    favorites INT DEFAULT 0
);
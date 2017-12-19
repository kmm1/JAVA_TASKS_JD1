CREATE DATABASE music_store2;
USE music_store2;
CREATE TABLE artist (
  id   INT AUTO_INCREMENT,
  name VARCHAR(255),
  PRIMARY KEY (id)
);
CREATE TABLE song (
  id        INT AUTO_INCREMENT,
  title     VARCHAR(255),
  length    INT,
  artist_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (artist_id) REFERENCES artist (id)
);


SELECT *
FROM artist;
SELECT *
FROM song;

SELECT
  name,
  title
FROM artist AS a
  JOIN song AS s ON s.artist_id = a.id
WHERE a.id = 1;
CREATE DATABASE restaurant_base;
USE restaurant_base;
DROP TABLE restaurant;
DROP TABLE review;
DROP TABLE dish;

CREATE TABLE restaurant (
  id   INT AUTO_INCREMENT,
  name VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE review (
  id            INT AUTO_INCREMENT,
  text          TEXT,
  restaurant_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (restaurant_id) REFERENCES restaurant (id)
);

CREATE TABLE dish (
  id            INT AUTO_INCREMENT,
  name          VARCHAR(255),
  restaurant_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (restaurant_id) REFERENCES restaurant (id)
);

INSERT INTO restaurant (name) VALUES ('London');
INSERT INTO review (text, restaurant_id) VALUES ('', 1);
INSERT INTO dish (name, restaurant_id) VALUES ('', 1);

SELECT *
FROM restaurant;
SELECT *
FROM review;

SELECT
  res.name,
  res.id,
  d.name
FROM RESTAURANT AS res
  LEFT JOIN dish AS d ON d.restaurant_id = res.id
WHERE res.id = 1;

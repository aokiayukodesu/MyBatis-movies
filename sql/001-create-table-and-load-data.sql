DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  releaseYear YEAR NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, releaseYear) VALUES ("アルマゲドン", 2000);
INSERT INTO movies (name, releaseYear) VALUES ("トイ・ストーリー", 2000);


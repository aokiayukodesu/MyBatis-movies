DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  publishedYear YEAR NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, publishedYear) VALUES ("アルマゲドン", 2000);
INSERT INTO movies (name, publishedYear) VALUES ("トイ・ストーリー", 2000);
INSERT INTO movies (name, publishedYear) VALUES ("ファイト・クラブ", 1999);
INSERT INTO movies (name, publishedYear) VALUES ("セブン", 1996);


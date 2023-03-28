DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(10) NOT NULL,
  publishedYear YEAR NOT NULL,
  PRIMARY KEY(id)
);

<<<<<<< HEAD
INSERT INTO movies (name, publishedYear) VALUES ("アルマゲドン", 2000);
INSERT INTO movies (name, publishedYear) VALUES ("トイ・ストーリー", 2000);
INSERT INTO movies (name, publishedYear) VALUES ("ファイト・クラブ", 1999);
INSERT INTO movies (name, publishedYear) VALUES ("セブン", 1996);
=======
INSERT INTO movies (name, releaseYear) VALUES ("アルマゲドン", 2000);
INSERT INTO movies (name, releaseYear) VALUES ("トイ・ストーリー", 2000);
INSERT INTO movies (name, releaseYear) VALUES ("ファイト・クラブ", 1999);
INSERT INTO movies (name, releaseYear) VALUES ("セブン", 1996);
>>>>>>> parent of 6ebeac7 (確認して頂くために一旦データをプッシュ)

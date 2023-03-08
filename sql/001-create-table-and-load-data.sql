DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  releaseDate VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, releaseDate) VALUES ("アルマゲドン", "2000年");
INSERT INTO movies (name, releaseDate) VALUES ("トイ・ストーリー", "2000年");
INSERT INTO movies (name, releaseDate) VALUES ("ファイト・クラブ", "1999年");
INSERT INTO movies (name, releaseDate) VALUES ("セブン", "1996年");

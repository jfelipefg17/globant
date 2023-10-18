CREATE SCHEMA IF NOT EXISTS `Market`;
ALTER USER 'jfelipefg17'@'localhost' IDENTIFIED WITH mysql_native_password BY '1001445250Fg.';
GRANT ALL PRIVILEGES ON * . * TO 'jfelipefg17'@'localhost';
FLUSH PRIVILEGES;

CREATE TABLE `Market`.`productos`(
	  `name` INT NOT NULL);
      
INSERT INTO productos VALUES(18);
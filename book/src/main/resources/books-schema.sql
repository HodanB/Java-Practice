DROP TABLE IF EXISTS `books` CASCADE;
create table `books` (
	`id` INTEGER UNIQUE PRIMARY KEY AUTO_INCREMENT,
	`title` VARCHAR(255) NOT NULL, 
	`author` VARCHAR(255) NOT NULL, 
	`genre` VARCHAR(255),
	`pages` INTEGER,
	`release_year` VARCHAR(12)
);
-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.5.61-log - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Export de la structure de la base pour bestioles_test
DROP DATABASE IF EXISTS `bestioles_test`;
CREATE DATABASE IF NOT EXISTS `bestioles_test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bestioles_test`;

-- Export de la structure de la table bestioles_test. animal
DROP TABLE IF EXISTS `animal`;
CREATE TABLE IF NOT EXISTS `animal` (
  `id_Animal` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Sex` varchar(50) NOT NULL,
  `CoatColor` varchar(50) NOT NULL,
  `id_Specie` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Animal`),
  KEY `FK_animal_specie` (`id_Specie`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- Export de données de la table bestioles_test.animal : ~13 rows (environ)
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
INSERT INTO `animal` (`id_Animal`, `Name`, `Sex`, `CoatColor`, `id_Specie`) VALUES
	(2, 'Kiab', 'Male', 'Black', 2),
	(3, 'Gerard', 'Male', 'Blue', 3),
	(4, 'Natalia', 'Female', 'Grey', 2),
	(5, 'Saïd', 'Male', 'Yellow', 2),
	(6, 'Nathan le CHIEN', 'Idiot', '2', 3),
	(7, 'Nathan le CHIEN', 'Idiot', '2', 2),
	(8, 'Nathan le CHIEN', 'idiot ', 'Gris', 2),
	(9, 'Nathan le CHIEN', 'idiot ', 'Gris', 2),
	(10, 'Nathan le CHIEN', 'idiot ', 'Gris', 2),
	(89, 'Nathan le CHIEN', 'Idiot', '2', 2),	
	(91, 'Nathan', 'Canidé', 'Blanc', 3),
	(92, 'Nathan', 'Canidé', 'Blanc', 3);
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;

-- Export de la structure de la table bestioles_test. animal__person
DROP TABLE IF EXISTS `animal__person`;
CREATE TABLE IF NOT EXISTS `animal__person` (
  `id_Person` int(11) DEFAULT NULL,
  `id_Animal` int(11) DEFAULT NULL,
  `id_Inter` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_Inter`),
  KEY `FK_animal__person_person` (`id_Person`),
  KEY `FK_animal__person_animal` (`id_Animal`),
  CONSTRAINT `FK_animal__person_person` FOREIGN KEY (`id_Person`) REFERENCES `person` (`id_Person`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- Export de données de la table bestioles_test.animal__person : ~4 rows (environ)
/*!40000 ALTER TABLE `animal__person` DISABLE KEYS */;
INSERT INTO `animal__person` (`id_Person`, `id_Animal`, `id_Inter`) VALUES
	(4, 1, 5),
	(1, 2, 12),
	(1, 3, 13),
	(2, 91, 15);
/*!40000 ALTER TABLE `animal__person` ENABLE KEYS */;

-- Export de la structure de la table bestioles_test. person
DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `id_Person` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Age` int(11) NOT NULL,
  PRIMARY KEY (`id_Person`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- Export de données de la table bestioles_test.person : ~22 rows (environ)
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` (`id_Person`, `FirstName`, `LastName`, `Age`) VALUES
	(1, 'JC', 'Jupiter', 30),
	(2, 'LeCroquant', 'Jojo', 99),
	(3, 'LeMordant', 'Jojo', 57),
	(4, 'LeRayonnant', 'Jojo', 87),
	(5, 'LeVrai', 'Jojo', 36),
	(6, 'LeBeau', 'LiDio', 22),
	(7, 'Le Kon', 'Nathan', 22),
	(8, 'LeGrand', 'Jojo', 22),
	(9, 'LeGrand', 'Jojo', 22),
	(10, 'LeGrand', 'Jojo', 22),
	(12, 'LeGrand', 'Jojo', 22),
	(13, 'Zeus', 'Olympus', 30),
	(14, 'Zeus', 'Olympus', 30),
	(15, 'Zeus', 'Olympus', 30),
	(17, 'Zeus', 'Olympus', 30),
	(18, 'Zeus', 'Olympus', 30),
	(19, 'Zeus', 'Olympus', 30),
	(20, 'Zeus', 'Olympus', 30),
	(21, 'Zeus', 'Olympus', 30),
	(22, 'Zeus', 'Olympus', 30),
	(23, 'Zeus', 'Olympus', 30),
	(24, 'JC', 'Olympus', 30);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;

-- Export de la structure de la table bestioles_test. race
DROP TABLE IF EXISTS `race`;
CREATE TABLE IF NOT EXISTS `race` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(127) NOT NULL DEFAULT '',
  `price` int(4) NOT NULL DEFAULT '0',
  `comments` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- Export de données de la table bestioles_test.race : ~3 rows (environ)
/*!40000 ALTER TABLE `race` DISABLE KEYS */;
INSERT INTO `race` (`id`, `name`, `price`, `comments`) VALUES
	(1, 'Berger allemand', 200, 'Sale bete'),
	(2, 'Teckel', 300, 'Bas sur patte'),
	(4, 'Nathdeux', 10, 'Nul');
/*!40000 ALTER TABLE `race` ENABLE KEYS */;

-- Export de la structure de la table bestioles_test. specie
DROP TABLE IF EXISTS `specie`;
CREATE TABLE IF NOT EXISTS `specie` (
  `id_Specie` int(11) NOT NULL AUTO_INCREMENT,
  `CommonName` varchar(50) NOT NULL,
  `LatinName` varchar(50) NOT NULL,
  PRIMARY KEY (`id_Specie`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;

-- Export de données de la table bestioles_test.specie : ~11 rows (environ)
/*!40000 ALTER TABLE `specie` DISABLE KEYS */;
INSERT INTO `specie` (`id_Specie`, `CommonName`, `LatinName`) VALUES
	(1, 'Dog', 'Canis'),
	(2, 'Cat', 'Felis'),
	(3, 'Rabbit', 'Lepus'),
	(4, 'Saïd', 'Beaugus'),
	(6, 'Dragon', 'reptilus'),
	(35, 'Nathus', 'Legus'),
	(36, 'Nathus', 'Legus'),
	(38, 'natheux', 'Legus'),
	(39, 'Nathus', 'Legus'),
	(40, 'Nathus', 'Legus'),
	(41, 'nathan', 'nathdeux');
/*!40000 ALTER TABLE `specie` ENABLE KEYS */;

-- Export de la structure de la procédure bestioles_test. test
DROP PROCEDURE IF EXISTS `test`;
DELIMITER //
CREATE DEFINER=`root`@`localhost` PROCEDURE `test`(
	OUT `val` INT
,
	IN `chaine` VARCHAR(50)
)
begin
select count(id_Specie) into val from specie
where commonName like chaine;
end//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

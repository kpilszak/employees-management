CREATE DATABASE  IF NOT EXISTS `employees-management`;
USE `employees-management`;

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `first_name` varchar(45) DEFAULT NULL,
                            `last_name` varchar(45) DEFAULT NULL,
                            `email` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
INSERT INTO `employee` VALUES
                           (1,'Leslie','Andrews','leslie@kpilszak.com'),
                           (2,'Emma','Baumgarten','emma@kpilszak.com'),
                           (3,'Avani','Gupta','avani@kpilszak.com'),
                           (4,'Yuri','Petrov','yuri@kpilszak.com'),
                           (5,'Juan','Vega','juan@kpilszak.com');


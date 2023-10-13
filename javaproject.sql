-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Oct 13, 2023 at 06:53 AM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
CREATE TABLE IF NOT EXISTS `inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `qty` int NOT NULL,
  `category` varchar(255) NOT NULL,
  `supplier` varchar(255) NOT NULL,
  `deliveredate` date NOT NULL,
  `expirydate` date NOT NULL,
  `image` longblob NOT NULL,
  `user` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `inventory`
--

INSERT INTO `inventory` (`id`, `product`, `qty`, `category`, `supplier`, `deliveredate`, `expirydate`, `image`, `user`) VALUES
(1, 'Brian Neil', 32, '', '', '0000-00-00', '0000-00-00', '', ''),
(3, 'Brian Neil', 32, '', '', '0000-00-00', '0000-00-00', '', ''),
(4, 'Brian Neil', 23, '', '', '0000-00-00', '0000-00-00', '', ''),
(5, 'Neil', 23, '', '', '0000-00-00', '0000-00-00', '', ''),
(6, 'Brian Neil', 32, '', '', '0000-00-00', '0000-00-00', '', ''),
(7, 'Monayx', 32, '', '', '0000-00-00', '0000-00-00', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` char(255) NOT NULL,
  `status` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `firstname`, `lastname`, `username`, `password`, `status`) VALUES
(1, 'Brian Neil', 'Castillo', 'bricas30', 'asdasd', 0),
(2, 'User', 'Only', 'user1', 'dXNlcjEyMw==', 0),
(3, 'User', 'Admin', 'admin', 'YWRtaW4xMjM=', 1),
(4, 'Java', 'Programming', 'java', 'amF2YTEyMw==', 1),
(5, 'Group', 'A', 'groupa', 'Z3JvdXBhMTIz', 1),
(6, 'Final', 'Test', 'ftest', 'ZmluYWwxMjM=', 1),
(7, 'Asd', 'Asd', 'asd', 'YXNkMTIz', 1),
(8, 'asdasd', 'asdasd', 'asdasd', 'YXNkYXNk', 1);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

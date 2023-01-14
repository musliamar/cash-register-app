-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 10, 2019 at 05:57 PM
-- Server version: 5.5.60-MariaDB
-- PHP Version: 5.6.39

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sinergija_baza`
--

-- --------------------------------------------------------

--
-- Table structure for table `proizvodi`
--

CREATE TABLE `proizvodi` (
  `id` int(11) NOT NULL,
  `naStanju` int(11) NOT NULL,
  `proizvod` varchar(255) NOT NULL,
  `cijena` float(255,2) NOT NULL,
  `kategorija` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proizvodi`
--

INSERT INTO `proizvodi` (`id`, `naStanju`, `proizvod`, `cijena`, `kategorija`) VALUES
(2, 48, 'Espreso sa mlijekom', 1.20, 'Kafe'),
(3, 48, 'Cappuccino', 1.40, 'Kafe'),
(4, 48, 'Domaca kafa', 1.00, 'Kafe'),
(5, 45, 'Jelen 0,5l', 2.00, 'Piva'),
(6, 46, 'Jelen 0,3l', 1.80, 'Piva'),
(7, 45, 'Lav 0,5l', 1.90, 'Piva'),
(8, 48, 'Lav 0,3l', 1.70, 'Piva'),
(9, 48, 'Juice 0,21l', 2.00, 'Sokovi'),
(10, 48, 'Gazirani sok 0,25l', 1.90, 'Sokovi'),
(11, 48, 'Limunada 0,2l', 1.70, 'Sokovi'),
(12, 48, 'Red bull 0,2l', 3.00, 'Sokovi'),
(13, 48, 'Rose Plantaze', 12.00, 'Vina'),
(14, 48, 'Rose Plantaze 0,187l', 2.70, 'Vina'),
(15, 48, 'Krstac 0,187l', 2.80, 'Vina'),
(16, 48, 'Chardonnay 0,187l', 2.90, 'Vina'),
(17, 48, 'Viljamovka 0,03l', 2.00, 'Zestoka'),
(18, 48, 'Kajsija 0,03l', 2.00, 'Zestoka'),
(19, 48, 'Dunja 0,03l', 2.00, 'Zestoka'),
(20, 48, 'Stock 0,03l', 2.00, 'Zestoka'),
(54, 48, 'Espreso', 1.00, 'Kafe');

-- --------------------------------------------------------

--
-- Table structure for table `racuni`
--

CREATE TABLE `racuni` (
  `brojracuna` varchar(255) NOT NULL,
  `nazivfajla` varchar(255) NOT NULL,
  `datum` varchar(255) NOT NULL,
  `vrijeme` varchar(255) NOT NULL,
  `radnik` varchar(255) NOT NULL,
  `smjena` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `uposlenici`
--

CREATE TABLE `uposlenici` (
  `id` int(11) NOT NULL,
  `uposlenik` varchar(255) NOT NULL,
  `sifra` varchar(255) NOT NULL,
  `smjena` varchar(255) NOT NULL,
  `daLiJeLogovan` varchar(255) NOT NULL,
  `daLiJeAdministrator` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `uposlenici`
--

INSERT INTO `uposlenici` (`id`, `uposlenik`, `sifra`, `smjena`, `daLiJeLogovan`, `daLiJeAdministrator`) VALUES
(1, 'Amar', 'amar1234', 'Nije na poslu', 'Ne', 'Da'),
(2, 'Neko', 'neko1234', 'Nije na poslu', 'Ne', 'Ne'),
(88, 'Test', 'test3', 'Nije na poslu', 'Ne', 'Da');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `proizvodi`
--
ALTER TABLE `proizvodi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `uposlenici`
--
ALTER TABLE `uposlenici`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `proizvodi`
--
ALTER TABLE `proizvodi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT for table `uposlenici`
--
ALTER TABLE `uposlenici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

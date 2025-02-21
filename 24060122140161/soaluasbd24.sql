-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 17, 2025 at 04:09 AM
-- Server version: 11.6.2-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `soaluasbd24`
--

-- --------------------------------------------------------

--
-- Table structure for table `d_cds`
--

CREATE TABLE `d_cds` (
  `id` int(11) NOT NULL,
  `cd_number` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `producer` varchar(255) DEFAULT NULL,
  `year` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `d_cds`
--

INSERT INTO `d_cds` (`id`, `cd_number`, `title`, `producer`, `year`) VALUES
(1, 90, 'The Celebrants Live in Concert', 'Old Town Records', 1997),
(2, 91, 'Party Music for All Occasions', 'The Music Man', 2000),
(3, 92, 'Back to the Shire', 'Middle Earth Records', 2002),
(4, 93, 'Songs from My Childhood', 'Old Town Records', 1999),
(5, 94, 'Carpe Diem', 'R & B Inc.', 2000),
(6, 95, 'Here Comes the Bride', 'The Music Man', 2001),
(7, 96, 'Graduation Songbook', 'Tunes Are Us', 1998),
(8, 98, 'Whirled Peas', 'Old Town Records', 2004);

-- --------------------------------------------------------

--
-- Table structure for table `d_clients`
--

CREATE TABLE `d_clients` (
  `id` int(11) NOT NULL,
  `client_number` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `d_clients`
--

INSERT INTO `d_clients` (`id`, `client_number`, `first_name`, `last_name`, `phone`, `email`) VALUES
(0, 5922, 'Hiram', 'Peters', '3715832249', 'hpeters@yahoo.com'),
(0, 5857, 'Serena', 'Jones', '7035335900', 'serena.jones@jones.com'),
(0, 6133, 'Lauren', 'Vigil', '4072220090', 'lbv@lbv.net');

-- --------------------------------------------------------

--
-- Table structure for table `d_events`
--

CREATE TABLE `d_events` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `event_date` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `cost` int(11) NOT NULL,
  `venue_id` int(11) NOT NULL,
  `package_code` int(11) NOT NULL,
  `theme_code` int(11) NOT NULL,
  `client_number` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `d_events`
--

INSERT INTO `d_events` (`id`, `name`, `event_date`, `description`, `cost`, `venue_id`, `package_code`, `theme_code`, `client_number`) VALUES
(100, 'Peters Graduation', '14-May-2004', 'Party for 200, red, white, blue motif', 8000, 100, 112, 200, 5922),
(105, 'Vigil wedding', '28-Apr-2004', 'Black tie at Four Season hotel', 10000, 220, 200, 200, 6133);

-- --------------------------------------------------------

--
-- Table structure for table `d_packages`
--

CREATE TABLE `d_packages` (
  `id` int(11) NOT NULL,
  `code` int(11) DEFAULT NULL,
  `low_range` int(11) DEFAULT NULL,
  `high_range` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `d_packages`
--

INSERT INTO `d_packages` (`id`, `code`, `low_range`, `high_range`) VALUES
(1, 79, 500, 2500),
(2, 87, 2501, 5000),
(3, 112, 5001, 10000),
(4, 200, 10001, 15000);

-- --------------------------------------------------------

--
-- Table structure for table `d_venues`
--

CREATE TABLE `d_venues` (
  `id` int(11) NOT NULL,
  `loc_type` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `rental_fee` varchar(255) NOT NULL,
  `comments` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `d_venues`
--

INSERT INTO `d_venues` (`id`, `loc_type`, `address`, `rental_fee`, `comments`) VALUES
(95, 'School Hall', '4 Mahogany Drive, Boston, MA 10010', '75', 'School closes at 10pm'),
(99, 'National Park', '87 Park Avenue, San Diego, CA 28978', '400', 'Bring generators'),
(100, 'Private Home', '52 West End Drive, Los Angeles, CA 90210', '0', 'Large kitchen, spacious lawn'),
(101, 'Private Home', '4 Primrose Lane, Chevy Chase, MD 22127', '0', 'Gazebo, multi-level deck'),
(105, 'Private Home', '123 Magnolia Road, Hudson, N.Y. 11220', '0', '3 level townhouse, speakers on all floors'),
(220, 'Hotel', '200 Pennsylvania Ave, Washington D.C. 09002', '300', 'Classy affair, tight security, private entrance for vendors');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `d_cds`
--
ALTER TABLE `d_cds`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `d_events`
--
ALTER TABLE `d_events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `d_packages`
--
ALTER TABLE `d_packages`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `d_venues`
--
ALTER TABLE `d_venues`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `d_cds`
--
ALTER TABLE `d_cds`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `d_events`
--
ALTER TABLE `d_events`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT for table `d_packages`
--
ALTER TABLE `d_packages`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `d_venues`
--
ALTER TABLE `d_venues`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=221;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

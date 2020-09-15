-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 15, 2020 at 11:30 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `majorproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'Navneet Kaur', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `bookings`
--

CREATE TABLE `bookings` (
  `bid` bigint(20) NOT NULL,
  `hid` bigint(20) DEFAULT NULL,
  `Check_in` varchar(45) DEFAULT NULL,
  `Check_out` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bookings`
--

INSERT INTO `bookings` (`bid`, `hid`, `Check_in`, `Check_out`) VALUES
(1, 1, '2020-09-17', '2020-09-19'),
(2, 1, '2020-09-17', '2020-09-19'),
(3, 1, '2020-09-18', '2020-09-21'),
(4, 1, '2020-09-18', '2020-09-21'),
(5, 1, '2020-09-18', '2020-09-21'),
(6, 1, '2020-09-17', '2020-09-26'),
(7, 1, '2020-09-17', '2020-09-26'),
(8, 1, '2020-09-17', '2020-09-26'),
(9, 1, '2020-09-17', '2020-09-26'),
(10, 1, '2020-09-17', '2020-09-26'),
(11, 1, '2020-09-17', '2020-09-26'),
(12, 1, '2020-09-17', '2020-09-26'),
(13, 1, '2020-09-17', '2020-09-26'),
(14, 1, '2020-09-17', '2020-09-26'),
(15, 1, '2020-09-17', '2020-09-26'),
(16, 1, '2020-09-17', '2020-09-26');

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `id` bigint(20) NOT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `mobile_no` varchar(15) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`id`, `Name`, `email`, `mobile_no`, `password`) VALUES
(1, 'Navneet', 'navi71242@gmail.com', '7014955036', 'navinavi'),
(2, 'ramesh', 'ramesh@gmail.com', '9726182498', 'ramesh'),
(3, 'romil', 'romil@gmail.com', '9999654738', 'romil'),
(4, 'Anjali', 'anjali@gmail.com', '9976254131', 'anjali'),
(5, 'Priyanka', 'priya@gmail.com', '09726182498', 'priya'),
(6, 'Tanya', 'tanya@gmail.com', '9726182498', 'tanya');

-- --------------------------------------------------------

--
-- Table structure for table `hotels`
--

CREATE TABLE `hotels` (
  `Hid` bigint(20) NOT NULL,
  `HName` varchar(100) DEFAULT NULL,
  `Rating` varchar(45) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `About` varchar(1500) DEFAULT NULL,
  `Contact_no` varchar(11) DEFAULT NULL,
  `Price` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotels`
--

INSERT INTO `hotels` (`Hid`, `HName`, `Rating`, `Address`, `About`, `Contact_no`, `Price`) VALUES
(1, 'THE UMED HOTEL', '3-star hotel', 'Near Anand Cinema, Station Rd, opp. Umaid kanya school, Jodhpur, Rajasthan 342001 0291 265 4093', 'This informal hotel in an area with shops is a 7-minute walk from the Jodhpur train station, 2 km from the 15th-century Mehrangarh Fort and 4 km from the stately 1943 Umaid Bhawan Palace.The warm, unassuming rooms and suites with simple furnishings have flat-screen TVs, and tea and coffeemaking facilities.', '9887767890', '1000'),
(3, 'Jodhpur Heritage Haveli', '1-star hotel', 'Gole Nadi, Brahmin Ki Gali Umaid Chowk, Jodhpur, Rajasthan 342001 \n', 'The buildings is contemporary in their use of space and light and context; and yet grounded in tradition. The Jodhpur Heritage Haveli find pride in the veritable heart of the Sun City and is one of the Jodhpur\'s finest heritage property. The newly renovated 9 room retain their old world warmth and grace with their understated elegance.', '07221968238', '1250'),
(10, 'OYO 18825 Hotel Akshey', '3-star hotel', 'Rai Ka Bagh, Near Railway Station, Jodhpur, Rajasthan 342006 ', 'A 10-minute walk from Raikabag Palace Junction train station, this unfussy budget hotel is 4 km from Sardar Market and 5 km from Mehrangarh, a history museum in a former 15th-century fortress. Basic, air-conditioned rooms with wood furnishings feature Wi-Fi and flat-screen TVs, as well as en suite wet rooms. Amenities include a restaurant and a bar. Breakfast and parking are available.', '01246201614', '903');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bookings`
--
ALTER TABLE `bookings`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hotels`
--
ALTER TABLE `hotels`
  ADD PRIMARY KEY (`Hid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `bookings`
--
ALTER TABLE `bookings`
  MODIFY `bid` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `hotels`
--
ALTER TABLE `hotels`
  MODIFY `Hid` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

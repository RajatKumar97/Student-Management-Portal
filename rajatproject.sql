-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 23, 2014 at 11:23 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `rajatproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'krishna');

-- --------------------------------------------------------

--
-- Table structure for table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `student_detail`
--

CREATE TABLE IF NOT EXISTS `student_detail` (
  `student_name` varchar(50) NOT NULL,
  `roll_no` varchar(10) NOT NULL,
  `department` varchar(20) NOT NULL,
  `Academic_year` varchar(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `m1` int(11) NOT NULL,
  `m2` int(11) NOT NULL,
  `m3` int(11) NOT NULL,
  `m4` int(11) NOT NULL,
  `m5` int(11) NOT NULL,
  `attendance` int(11) NOT NULL,
  `percentage` varchar(10) NOT NULL,
  `result` varchar(10) NOT NULL,
  `psw` varchar(20) NOT NULL,
  PRIMARY KEY (`roll_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_detail`
--

INSERT INTO `student_detail` (`student_name`, `roll_no`, `department`, `Academic_year`, `gender`, `m1`, `m2`, `m3`, `m4`, `m5`, `attendance`, `percentage`, `result`, `psw`) VALUES
('arpit', '1212112', 'CSE', '2005-2006', 'Male', 84, 84, 84, 84, 84, 110, '84.0', 'Pass', '1212112'),
('rajats', '123456', 'CSE', '2009-2010', 'Male', 45, 45, 45, 45, 45, 115, '45.0', 'Pass', '123456'),
('raja', '1236', 'CSE', '2005-2006', 'MALE', 89, 89, 56, 85, 26, 115, '69.0', 'Fail', ''),
('ramesh', '145', 'CSE', '2005-2006', 'Male', 12, 45, 56, 56, 56, 108, '45.0', 'Pass', ''),
('rajat success', '1779', 'CSE', '2005-2006', 'Male', 89, 90, 90, 90, 90, 90, '89.8', 'Pass', ''),
('rajat great', '179', 'CSE', '2012-2013', 'MALE', 89, 90, 90, 90, 90, 90, '89.8', 'Fail', ''),
('raj', '785', 'CSE', '2005-2006', 'Male', 45, 90, 90, 90, 90, 111, '81.0', 'Pass', ''),
('sp', '89', 'CSE', '2005-2006', 'Female', 89, 89, 78, 89, 90, 70, '87.0', 'Pass', '89'),
('vaibhav c', 'cun1234', 'CSE', '2005-2006', 'Female', 78, 45, 45, 45, 45, 106, '51.6', 'Pass', 'cun1234'),
('parveen', 'cun156', 'CSE', '2012-2013', 'MALE', 85, 90, 85, 85, 85, 107, '86.0', 'Fail', 'cun156'),
('rahul', 'cun176', 'CSE', '2012-2013', 'MALE', 24, 25, 85, 85, 41, 99, '52.0', 'Fail', 'cun176'),
('Rajat Sharma', 'cun179', 'CSE', '2012-2013', 'FEMALE', 95, 96, 95, 98, 95, 95, '95.8', 'Fail', 'cun179'),
('Vaibhav Sharma', 'CUN248', 'CSE', '2012-2013', 'MALE', 100, 90, 90, 70, 99, 100, '89.8', 'Fail', 'CUN248'),
('yogi', 'cun253', 'CSE', '2012-2013', 'Male', 80, 85, 90, 95, 80, 115, '86.0', 'Pass', 'cun253'),
('yogi gupta', 'cun420', 'CSE', '2011-2012', 'Male', 85, 84, 82, 83, 81, 98, '83.0', 'Pass', 'cun420'),
('rajashi', 'ksjkam', 'CSE', '2005-2006', 'Male', 89, 89, 56, 85, 26, 115, '0.0', 'Fail', '');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

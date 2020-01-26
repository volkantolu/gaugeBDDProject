-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2020 at 10:29 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `automation`
--

-- --------------------------------------------------------

--
-- Table structure for table `elements_repo`
--

CREATE TABLE `elements_repo` (
  `pid` int(11) NOT NULL,
  `project` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `language` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `alias` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `value` varchar(500) COLLATE utf8_turkish_ci NOT NULL,
  `selector` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `active` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `elements_repo`
--

INSERT INTO `elements_repo` (`pid`, `project`, `language`, `alias`, `value`, `selector`, `active`) VALUES
(1, 'amazon', 'english', 'name', 'ap_customer_name', 'id', 1),
(2, 'amazon', 'german', 'name', 'ap_customer_name', 'id', 1),
(3, 'amazon', 'english', 'email', 'ap_email', 'id', 1),
(4, 'amazon', 'german', 'email', 'ap_email', 'id', 1),
(5, 'amazon', 'english', 'repassword', 'ap_password_check', 'id', 1),
(6, 'amazon', 'german', 'repassword', 'ap_password_check', 'id', 1),
(7, 'amazon', 'english', 'password', 'ap_password', 'id', 1),
(8, 'amazon', 'german', 'password', 'ap_password', 'id', 1),
(9, 'amazon', 'english', 'createAccountVerify', 'continue', 'id', 1),
(10, 'amazon', 'german', 'createAccountVerify', 'continue', 'id', 1),
(11, 'amazon', 'english', 'newUser', 'nav-flyout-ya-newCust', 'id', 1),
(12, 'amazon', 'german', 'newUser', 'nav-flyout-ya-newCust', 'id', 1),
(13, 'amazon', 'english', 'createAccount', 'createAccountSubmit', 'id', 1),
(14, 'amazon', 'german', 'createAccount', 'createAccountSubmit', 'id', 1),
(15, 'amazon', 'english', 'NewAccount', 'nav-link-accountList', 'id', 1),
(16, 'amazon', 'german', 'NewAccount', 'nav-link-accountList', 'id', 1),
(17, 'amazon', 'english', 'login', 'signInSubmit', 'id', 1),
(18, 'amazon', 'german', 'login', 'signInSubmit', 'id', 1),
(19, 'amazon', 'english', 'Menu', 'nav-hamburger-menu', 'id', 1),
(20, 'amazon', 'german', 'Menu', 'nav-hamburger-menu', 'id', 1),
(21, 'amazon', 'english', 'Elektronik Menu', '//a[@data-menu-id=13]', 'xpath', 1),
(22, 'amazon', 'german', 'Elektronik Menu', '//a[@data-menu-id=13]', 'xpath', 1),
(23, 'amazon', 'english', 'SearchBar', 'twotabsearchtextbox', 'id', 1),
(24, 'amazon', 'german', 'SearchBar', 'twotabsearchtextbox', 'id', 1),
(25, 'amazon', 'english', 'SearchButton', '//span[@id=\'nav-search-submit-text\']//following-sibling::input', 'xpath', 1),
(26, 'amazon', 'german', 'SearchButton', '//span[@id=\'nav-search-submit-text\']//following-sibling::input', 'xpath', 1),
(27, 'amazon', 'english', 'ANC', '//span[text()=\'Noise-Canceling\']//ancestor::a', 'xpath', 1),
(28, 'amazon', 'german', 'ANC', '//span[text()=\'Noise-Canceling\']//ancestor::a', 'xpath', 1),
(29, 'amazon', 'english', 'FirstProduct', '(//span[@class=\'a-price-whole\'])[1]', 'xpath', 1),
(30, 'amazon', 'german', 'FirstProduct', '(//span[@class=\'a-price-whole\'])[1]', 'xpath', 1),
(31, 'amazon', 'english', 'AddToBasket', 'add-to-cart-button', 'id', 1),
(32, 'amazon', 'german', 'AddToBasket', 'add-to-cart-button', 'id', 1),
(33, 'amazon', 'english', 'NoThanks', 'siNoCoverage-announce', 'id', 1),
(34, 'amazon', 'german', 'NoThanks', 'siNoCoverage-announce', 'id', 1),
(35, 'amazon', 'english', 'ProceedToCheckout', 'hlb-ptc-btn-native', 'id', 1),
(36, 'amazon', 'german', 'ProceedToCheckout', 'hlb-ptc-btn-native', 'id', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `elements_repo`
--
ALTER TABLE `elements_repo`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `elements_repo`
--
ALTER TABLE `elements_repo`
  MODIFY `pid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

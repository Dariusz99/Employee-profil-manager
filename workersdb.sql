-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 19 Sie 2019, 15:13
-- Wersja serwera: 10.1.40-MariaDB
-- Wersja PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `workersdb`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `workersdata`
--

CREATE TABLE `workersdata` (
  `ID` int(11) NOT NULL,
  `First_name` text COLLATE utf8_polish_ci NOT NULL,
  `Last_name` text COLLATE utf8_polish_ci NOT NULL,
  `login` text COLLATE utf8_polish_ci NOT NULL,
  `password` text COLLATE utf8_polish_ci NOT NULL,
  `salary` int(11) NOT NULL,
  `free_days` int(11) NOT NULL,
  `sick_days` int(11) NOT NULL,
  `worked_hours` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `workersdata`
--

INSERT INTO `workersdata` (`ID`, `First_name`, `Last_name`, `login`, `password`, `salary`, `free_days`, `sick_days`, `worked_hours`) VALUES
(1, 'Marek', 'Test', 'marecki', 'haslo', 4500, 5, 4, 0),
(2, 'Enrique', 'Iglasias', 'enriq', 'pass19', 4555, 4, 5, 0);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `workersdata`
--
ALTER TABLE `workersdata`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `workersdata`
--
ALTER TABLE `workersdata`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

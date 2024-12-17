-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 17, 2024 at 08:15 PM
-- Server version: 8.3.0
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projetihm`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `num_permis` bigint DEFAULT NULL,
  `telephone` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id_client`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id_client`, `nom`, `prenom`, `num_permis`, `telephone`, `email`) VALUES
(3, 'Slimani', 'Faouzi', 3659651, '0793642323', 'fouzi@gmail.com'),
(4, 'Benhebbadj', 'Ayoub', 319415419, '072256629', 'ayoiub@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `paiement`
--

DROP TABLE IF EXISTS `paiement`;
CREATE TABLE IF NOT EXISTS `paiement` (
  `id_paiement` int NOT NULL AUTO_INCREMENT,
  `id_reservation` int NOT NULL,
  `montant` decimal(10,2) NOT NULL,
  `date_paiement` date NOT NULL,
  `mode_paiement` varchar(50) NOT NULL,
  PRIMARY KEY (`id_paiement`),
  KEY `fk_reservation` (`id_reservation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `id_reservation` int NOT NULL AUTO_INCREMENT,
  `id_vehicule` int DEFAULT NULL,
  `id_client` int DEFAULT NULL,
  `date_debut` date NOT NULL,
  `date_fin` date NOT NULL,
  `montant_total` decimal(10,2) NOT NULL,
  `statut` varchar(20) NOT NULL,
  PRIMARY KEY (`id_reservation`),
  KEY `id_vehicule` (`id_vehicule`),
  KEY `id_client` (`id_client`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `id_vehicule`, `id_client`, `date_debut`, `date_fin`, `montant_total`, `statut`) VALUES
(6, 4, 3, '2024-12-03', '2024-12-04', 20000.00, 'terminée'),
(5, 2, 1, '2024-12-07', '2024-12-09', 22000.00, 'terminée'),
(4, 1, 1, '2024-12-07', '2024-12-08', 7000.00, 'terminée');

-- --------------------------------------------------------

--
-- Table structure for table `retour`
--

DROP TABLE IF EXISTS `retour`;
CREATE TABLE IF NOT EXISTS `retour` (
  `id_retour` int NOT NULL AUTO_INCREMENT,
  `id_reservation` int DEFAULT NULL,
  `date_retour` date NOT NULL,
  `etat_retour` varchar(50) NOT NULL,
  `frais_supplementaires` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id_retour`),
  KEY `id_reservation` (`id_reservation`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
CREATE TABLE IF NOT EXISTS `utilisateur` (
  `id_utilisateur` int NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mot_de_passe` varchar(60) DEFAULT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`id_utilisateur`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `utilisateur`
--

INSERT INTO `utilisateur` (`id_utilisateur`, `nom`, `prenom`, `email`, `mot_de_passe`, `role`) VALUES
(10, 'Slimani', 'Faouzi', 'fouzi@gmail.com', '$2a$10$8GrLrefpmTmTYkPErgpiqOT0SiWxCkRFBqHR9OMRjy4VsfCifqxGa', 'Gestionnaire'),
(5, 'Benamrouch', 'mahdi', 'mahdi@gmail.com', '$2a$10$a4/Q4bfMPFNHnGsurUCd1.KG9zroHVli4votbmx0V20JpU0QwCK7i', 'Admin'),
(9, 'idjeri', 'lina', 'lina@gmail.com', '$2a$10$2Wyi9Q7alNhcHwvc22TVPuBA7RXwKl3fGAFMGUNa5DARKW/WYtuZW', 'Admin'),
(8, 'ait ali', 'idir', 'idir@gmail.com', '$2a$10$WZlgxt6HpipcRKlRVQphbeN1J7lRwXLnU8S3HqnyCsp4Uzge8oK.i', 'Admin'),
(11, 'Benhebbadj', 'Ayoub', 'ayoub@gmail.com', '$2a$10$4VG9r9b9XewtaSPPitnsE.OGB43MXdLRK7Ft1MNT/xWUrQjaTJbDK', 'Gestionnaire'),
(12, 'Merdas', 'Manel', 'manel@gmail.com', '$2a$10$4oegP7dZtToOZa.8EVkDv.R07dfVRQ/3ElZK0LKJKg4XQo8R4ik.K', 'Admin'),
(13, 'merdas', 'manel', 'manel20052017@gmail.com', '$2a$10$ZsTbycP5pYQniL8yPHMoK.Rplcyz3e2Mczocfq8OKJ1hciC4biYZC', 'Gestionnaire');

-- --------------------------------------------------------

--
-- Table structure for table `vehicule`
--

DROP TABLE IF EXISTS `vehicule`;
CREATE TABLE IF NOT EXISTS `vehicule` (
  `id_vehicule` int NOT NULL AUTO_INCREMENT,
  `marque` varchar(50) NOT NULL,
  `modele` varchar(50) NOT NULL,
  `annee` int NOT NULL,
  `type` varchar(20) NOT NULL,
  `carburant` varchar(20) NOT NULL,
  `prix_location_jour` decimal(10,2) NOT NULL,
  `etat` enum('disponible','louée','maintenance') DEFAULT 'disponible',
  PRIMARY KEY (`id_vehicule`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `vehicule`
--

INSERT INTO `vehicule` (`id_vehicule`, `marque`, `modele`, `annee`, `type`, `carburant`, `prix_location_jour`, `etat`) VALUES
(1, 'BMW', 'x5', 2020, '4x4', 'Diesel', 7000.00, 'louée'),
(2, 'Mercedes-benz', 'G-class', 2022, '4x4', 'Diesel', 11000.00, 'louée'),
(4, 'porshe', 'turbo s', 2024, 'idk', 'essence', 20000.00, 'louée'),
(5, 'Peugout', '308', 2015, 'kch haja', 'Diesel', 5000.00, 'disponible');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

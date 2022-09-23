-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 26, 2022 at 05:53 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `esfot`
--

-- --------------------------------------------------------

--
-- Table structure for table `alumnos`
--

CREATE TABLE `alumnos` (
  `id_alumno` int(11) NOT NULL,
  `nombre` varchar(32) NOT NULL,
  `apellidos` varchar(64) NOT NULL,
  `fecha_nac` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alumnos`
--

INSERT INTO `alumnos` (`id_alumno`, `nombre`, `apellidos`, `fecha_nac`) VALUES
(1, 'TOMAS DANIEL', 'BERNAL GAIBOR', '2001-02-18'),
(2, 'JIMY BRYAN', 'CALVO MULLO', '2001-11-13'),
(3, 'KATHERINE IVONNE', 'CANGAHUAMIN ANDRANGO', '2001-12-05'),
(4, 'ROBERTO ANDRES', 'CHACON LOPEZ', '2001-04-15'),
(5, 'MARIA JOSE', 'CHALA SANTACRUZ', '2001-09-29');

-- --------------------------------------------------------

--
-- Table structure for table `asignaturas`
--

CREATE TABLE `asignaturas` (
  `id_asignatura` int(11) NOT NULL,
  `nombre` varchar(64) NOT NULL,
  `profesor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `asignaturas`
--

INSERT INTO `asignaturas` (`id_asignatura`, `nombre`, `profesor`) VALUES
(6, 'Programación Orientada a Objetos', 1),
(7, 'Arquitectura de Computadores', 2),
(8, 'Diseño de Interfaces', 1),
(9, 'Sistemas Operativos', 3);

-- --------------------------------------------------------

--
-- Table structure for table `matriculas`
--

CREATE TABLE `matriculas` (
  `alumno` int(11) NOT NULL,
  `asignatura` int(11) NOT NULL,
  `fecha` year(4) NOT NULL,
  `nota` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `profesores`
--

CREATE TABLE `profesores` (
  `id_profesor` int(11) NOT NULL,
  `nombre` varchar(32) NOT NULL,
  `apellidos` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesores`
--

INSERT INTO `profesores` (`id_profesor`, `nombre`, `apellidos`) VALUES
(1, 'Ivonne', 'Maldonado'),
(2, 'Byron', 'Loarte'),
(3, 'Richard', 'Rivera'),
(4, 'Monica', 'Vinueza');

-- --------------------------------------------------------

--
-- Table structure for table `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `user_name` varchar(32) NOT NULL,
  `password` varchar(64) NOT NULL,
  `privilegio` varchar(32) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `user_name`, `password`, `privilegio`, `ID`) VALUES
(1, 'TOMAS@EPN', '1234', 'alumno', 1),
(2, 'JIMY@EPN', 'alum1234', 'alumno', 2),
(3, 'KATHERINE@EPN', 'kat1234', 'alumno', 3),
(4, 'ROBERTO@EPN', 'rob1234', 'alumno', 4),
(5, 'MARIA@EPN', 'mari1234', 'alumno', 5),
(6, 'IVONNE@EPN', 'ivon1234', 'profesor', 1),
(7, 'BYRON@EPN', 'byron1234', 'profesor', 2),
(8, 'RICHARD@EPN', 'rich1234', 'profesor', 3),
(9, 'MONICA@EPN', 'mon1234', 'administrador', 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alumnos`
--
ALTER TABLE `alumnos`
  ADD UNIQUE KEY `id_alumno_uq` (`id_alumno`);

--
-- Indexes for table `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD UNIQUE KEY `id_asignatura_uq` (`id_asignatura`),
  ADD KEY `profesor_asignatura` (`profesor`);

--
-- Indexes for table `matriculas`
--
ALTER TABLE `matriculas`
  ADD PRIMARY KEY (`alumno`,`asignatura`,`fecha`),
  ADD KEY `asignatura_matriculada` (`asignatura`);

--
-- Indexes for table `profesores`
--
ALTER TABLE `profesores`
  ADD UNIQUE KEY `id_profesor_uq` (`id_profesor`);

--
-- Indexes for table `usuarios`
--
ALTER TABLE `usuarios`
  ADD UNIQUE KEY `id_usuario_uq` (`id_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `id_asignatura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `profesores`
--
ALTER TABLE `profesores`
  MODIFY `id_profesor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD CONSTRAINT `profesor_asignatura` FOREIGN KEY (`profesor`) REFERENCES `profesores` (`id_profesor`);

--
-- Constraints for table `matriculas`
--
ALTER TABLE `matriculas`
  ADD CONSTRAINT `alumno_matriculado` FOREIGN KEY (`alumno`) REFERENCES `alumnos` (`id_alumno`),
  ADD CONSTRAINT `asignatura_matriculada` FOREIGN KEY (`asignatura`) REFERENCES `asignaturas` (`id_asignatura`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

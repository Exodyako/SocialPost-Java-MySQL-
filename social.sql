-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-04-2018 a las 18:23:00
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `social`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(120) DEFAULT NULL,
  `genero` varchar(6) DEFAULT NULL,
  `fechanacimiento` varchar(60) DEFAULT NULL,
  `contraseña` varchar(8) DEFAULT NULL,
  `imagenperfil` text,
  `imagenportada` text,
  `slogan` varchar(47) DEFAULT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `descripcion` varchar(230) DEFAULT NULL,
  `posteados` mediumtext
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre`, `apellido`, `genero`, `fechanacimiento`, `contraseña`, `imagenperfil`, `imagenportada`, `slogan`, `correo`, `telefono`, `direccion`, `descripcion`, `posteados`) VALUES
('Edgar', 'Carrascal', 'Hombre', '08/Septiembre/1996', '1234', NULL, NULL, 'laralala lala', 'fabi1@hotmail.com', NULL, NULL, NULL, NULL),
('Julian', 'Sequeda', 'Hombre', '17/10/1996', 'julian', 'C:\\Users\\Familia S Q\\Pictures\\Fotos\\ConJheilyn2.jpg', NULL, 'fhajksfgsdsdkjfsd', 'js@hotmail.com', NULL, 'Av 9E # 6N - 59 Santa Lucia', 'me la pelan todos', '\nhols soy un pos\n\n\nno chingues wey\n\n'),
('Jheilyn', 'Jimenez', 'Mujer', '01/Enero/2018', 'jheilyn', NULL, NULL, 'dhsfkjfhsdjk', 'jt@hotmail.com', NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`correo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

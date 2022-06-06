-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20220521.3d3010916e
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2022 a las 12:50:54
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `banco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `banco`
--

CREATE TABLE `banco` (
  `nombreBanco` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `banco`
--

INSERT INTO `banco` (`nombreBanco`) VALUES
('BBVA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cajadeahorro`
--

CREATE TABLE `cajadeahorro` (
  `numCajaDeAhorro` int(11) NOT NULL,
  `cbu` varchar(50) NOT NULL,
  `saldo` double NOT NULL,
  `tipoMoneda` varchar(40) NOT NULL,
  `dnicliente` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cajadeahorro`
--

INSERT INTO `cajadeahorro` (`numCajaDeAhorro`, `cbu`, `saldo`, `tipoMoneda`, `dnicliente`) VALUES
(2, '8888', 253000, 'EUROS', '405050'),
(3, '46445', 5456, 'PESOS', '405050'),
(4, '502', 5465919, 'DOLARES', '402'),
(6, '656', 400, 'DOLARES', '402');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `dni` varchar(40) NOT NULL,
  `nombreCliente` varchar(40) NOT NULL,
  `apellidoCliente` varchar(40) NOT NULL,
  `telefono` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `nombreSucursalfk` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`dni`, `nombreCliente`, `apellidoCliente`, `telefono`, `email`, `nombreSucursalfk`) VALUES
('1323123', 'franco', 'cortina', '54654', 'franco.cug@gmail.com', 'La Plata'),
('402', 'Fernandoo', 'Faacia', '4665', 'dsadsa', 'La Plata'),
('4040', 'Franco', 'Cortina', '40404', 'franco.cug@gmail.com', 'Man'),
('405050', 'das', 'sasd', '54654', 'fd', 'La Plata'),
('465', 'Diego', 'Vasquez', '646545', 'Diego@gmail.com', 'La Plata'),
('6666', 'Manuel', 'Fernadez', '6545465', 'manuel@gmail.com', 'Man');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentacorriente`
--

CREATE TABLE `cuentacorriente` (
  `numCuentaCorriente` int(11) NOT NULL,
  `saldo` double NOT NULL,
  `cbu` varchar(40) NOT NULL,
  `dnicliente` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cuentacorriente`
--

INSERT INTO `cuentacorriente` (`numCuentaCorriente`, `saldo`, `cbu`, `dnicliente`) VALUES
(7, 433, '78421', '405050'),
(13, 440, '505', '402'),
(14, 296, '400', '402'),
(15, 27000, '555', '402'),
(16, 40000, '6565656', '465');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `numEmpleado` int(11) NOT NULL,
  `dni` varchar(40) NOT NULL,
  `nombreEmpleado` varchar(40) NOT NULL,
  `apellidoEmpleado` varchar(40) NOT NULL,
  `telefono` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `nombreSucursalfk` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`numEmpleado`, `dni`, `nombreEmpleado`, `apellidoEmpleado`, `telefono`, `email`, `nombreSucursalfk`) VALUES
(3, '4546666', 'franco', 'camaro', '46544', 'fara@dsa', 'La Plata'),
(7, '40', 'carla', 'amorati', '15115', 'amorati@sd.com', 'La Plata'),
(13, '455656', 'francoCU', 'Cortitinu', '4564', 'franco.cug@yahoo', 'La Plata'),
(14, '4080656', 'fra', 'cor', '564', 'franco.cu', 'La Plata'),
(15, '56456', 'sdadsa', 'sada', '465', 'fsd', 'La Plata'),
(16, '456', 'awdsa', 'sada', '748', 'sfdfsd', 'La Plata'),
(17, '6666', 'Meachel', 'Connor', '556546', 'franco.cug@gmail.com', 'La Plata');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursal`
--

CREATE TABLE `sucursal` (
  `nombreSucursal` varchar(40) NOT NULL,
  `bancoNombrefk` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sucursal`
--

INSERT INTO `sucursal` (`nombreSucursal`, `bancoNombrefk`) VALUES
('La Plata', 'BBVA'),
('Man', 'BBVA'),
('Man Hack', 'BBVA'),
('Manchester', 'BBVA'),
('Monte', 'BBVA'),
('NEW YORK', 'BBVA'),
('Softek', 'BBVA'),
('Villa Funciona', 'BBVA');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `banco`
--
ALTER TABLE `banco`
  ADD PRIMARY KEY (`nombreBanco`);

--
-- Indices de la tabla `cajadeahorro`
--
ALTER TABLE `cajadeahorro`
  ADD PRIMARY KEY (`numCajaDeAhorro`),
  ADD KEY `dnicliente` (`dnicliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `nombreSucursalfk` (`nombreSucursalfk`);

--
-- Indices de la tabla `cuentacorriente`
--
ALTER TABLE `cuentacorriente`
  ADD PRIMARY KEY (`numCuentaCorriente`),
  ADD KEY `dnicliente` (`dnicliente`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`numEmpleado`),
  ADD KEY `nombreSucursalfk` (`nombreSucursalfk`);

--
-- Indices de la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD PRIMARY KEY (`nombreSucursal`),
  ADD KEY `bancoNombrefk` (`bancoNombrefk`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cajadeahorro`
--
ALTER TABLE `cajadeahorro`
  MODIFY `numCajaDeAhorro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `cuentacorriente`
--
ALTER TABLE `cuentacorriente`
  MODIFY `numCuentaCorriente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `numEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cajadeahorro`
--
ALTER TABLE `cajadeahorro`
  ADD CONSTRAINT `cajadeahorro_ibfk_1` FOREIGN KEY (`dnicliente`) REFERENCES `cliente` (`dni`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`nombreSucursalfk`) REFERENCES `sucursal` (`nombreSucursal`);

--
-- Filtros para la tabla `cuentacorriente`
--
ALTER TABLE `cuentacorriente`
  ADD CONSTRAINT `cuentacorriente_ibfk_1` FOREIGN KEY (`dnicliente`) REFERENCES `cliente` (`dni`);

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`nombreSucursalfk`) REFERENCES `sucursal` (`nombreSucursal`);

--
-- Filtros para la tabla `sucursal`
--
ALTER TABLE `sucursal`
  ADD CONSTRAINT `sucursal_ibfk_1` FOREIGN KEY (`bancoNombrefk`) REFERENCES `banco` (`nombreBanco`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;




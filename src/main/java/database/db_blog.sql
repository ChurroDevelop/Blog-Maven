-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 05-06-2024 a las 21:23:35
-- Versión del servidor: 8.0.30
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `blog`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_documento`
--

CREATE TABLE `tb_documento` (
  `id_documento` int NOT NULL,
  `extension_documento` varchar(10) NOT NULL,
  `documento` blob NOT NULL,
  `id_post_fk` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_operaciones`
--

CREATE TABLE `tb_operaciones` (
  `id_operacion` int NOT NULL,
  `nombre_operacion` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_perfil`
--

CREATE TABLE `tb_perfil` (
  `nombre_usuario` varchar(255) NOT NULL,
  `apellido_usuario` varchar(255) NOT NULL,
  `num_documento` varchar(255) DEFAULT NULL,
  `centro_formacion` varchar(255) NOT NULL,
  `id_usuario_fk` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_post`
--

CREATE TABLE `tb_post` (
  `id_post` int NOT NULL,
  `titulo_post` varchar(255) NOT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `observacion` varchar(255) DEFAULT NULL,
  `id_usuario_fk` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_rol`
--

CREATE TABLE `tb_rol` (
  `id_rol` int NOT NULL,
  `nombre_rol` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_rol_operacion`
--

CREATE TABLE `tb_rol_operacion` (
  `id_operacion_fk` int NOT NULL,
  `id_rol_fk` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuarios`
--

CREATE TABLE `tb_usuarios` (
  `id_usuario` int NOT NULL,
  `correo_inst` varchar(255) NOT NULL,
  `num_doc` int NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `id_rol_fk` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_documento`
--
ALTER TABLE `tb_documento`
  ADD PRIMARY KEY (`id_documento`),
  ADD KEY `id_post_fk` (`id_post_fk`);

--
-- Indices de la tabla `tb_operaciones`
--
ALTER TABLE `tb_operaciones`
  ADD PRIMARY KEY (`id_operacion`);

--
-- Indices de la tabla `tb_perfil`
--
ALTER TABLE `tb_perfil`
  ADD KEY `id_usuario_fk` (`id_usuario_fk`);

--
-- Indices de la tabla `tb_post`
--
ALTER TABLE `tb_post`
  ADD PRIMARY KEY (`id_post`),
  ADD KEY `id_usuario_fk` (`id_usuario_fk`);

--
-- Indices de la tabla `tb_rol`
--
ALTER TABLE `tb_rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `tb_rol_operacion`
--
ALTER TABLE `tb_rol_operacion`
  ADD KEY `id_operacion_fk` (`id_operacion_fk`),
  ADD KEY `id_rol_fk` (`id_rol_fk`);

--
-- Indices de la tabla `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `id_rol_fk` (`id_rol_fk`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_documento`
--
ALTER TABLE `tb_documento`
  MODIFY `id_documento` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_operaciones`
--
ALTER TABLE `tb_operaciones`
  MODIFY `id_operacion` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_perfil`
--
ALTER TABLE `tb_perfil`
  MODIFY `id_usuario_fk` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_post`
--
ALTER TABLE `tb_post`
  MODIFY `id_post` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_rol`
--
ALTER TABLE `tb_rol`
  MODIFY `id_rol` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  MODIFY `id_usuario` int NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_documento`
--
ALTER TABLE `tb_documento`
  ADD CONSTRAINT `tb_documento_ibfk_1` FOREIGN KEY (`id_post_fk`) REFERENCES `tb_post` (`id_post`);

--
-- Filtros para la tabla `tb_perfil`
--
ALTER TABLE `tb_perfil`
  ADD CONSTRAINT `tb_perfil_ibfk_1` FOREIGN KEY (`id_usuario_fk`) REFERENCES `tb_usuarios` (`id_usuario`);

--
-- Filtros para la tabla `tb_post`
--
ALTER TABLE `tb_post`
  ADD CONSTRAINT `tb_post_ibfk_1` FOREIGN KEY (`id_usuario_fk`) REFERENCES `tb_usuarios` (`id_usuario`);

--
-- Filtros para la tabla `tb_rol_operacion`
--
ALTER TABLE `tb_rol_operacion`
  ADD CONSTRAINT `tb_rol_operacion_ibfk_1` FOREIGN KEY (`id_operacion_fk`) REFERENCES `tb_operaciones` (`id_operacion`),
  ADD CONSTRAINT `tb_rol_operacion_ibfk_2` FOREIGN KEY (`id_rol_fk`) REFERENCES `tb_rol` (`id_rol`);

--
-- Filtros para la tabla `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  ADD CONSTRAINT `tb_usuarios_ibfk_1` FOREIGN KEY (`id_rol_fk`) REFERENCES `tb_rol` (`id_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: farmacia
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `fabricante`
--

DROP TABLE IF EXISTS `fabricante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fabricante` (
  `CNPJ` varchar(14) NOT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Rua` varchar(100) DEFAULT NULL,
  `Numero` int DEFAULT NULL,
  `Bairro` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricante`
--

LOCK TABLES `fabricante` WRITE;
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
INSERT INTO `fabricante` VALUES ('232.342.092-10','jaime victor','avenida arterial norte externa',210,'maiobinha'),('233.233.232-10','jaime','avenida arterial',210,'maiobinha');
/*!40000 ALTER TABLE `fabricante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicamento` (
  `Numero` int NOT NULL,
  `Tarja` varchar(10) DEFAULT NULL,
  `Formula` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `medicamento_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfumaria`
--

DROP TABLE IF EXISTS `perfumaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfumaria` (
  `Numero` int NOT NULL,
  `Tipo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `perfumaria_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfumaria`
--

LOCK TABLES `perfumaria` WRITE;
/*!40000 ALTER TABLE `perfumaria` DISABLE KEYS */;
INSERT INTO `perfumaria` VALUES (1234,'cheiroso');
/*!40000 ALTER TABLE `perfumaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `Numero` int NOT NULL,
  `Preco_unitario` double DEFAULT NULL,
  `Nome_comercial` varchar(100) DEFAULT NULL,
  `Tipo_embalagem` varchar(50) DEFAULT NULL,
  `Quantidade` int DEFAULT NULL,
  `CNPJ` varchar(100) NOT NULL,
  PRIMARY KEY (`Numero`),
  KEY `CNPJ` (`CNPJ`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`CNPJ`) REFERENCES `fabricante` (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1234,23.45,'produto legal','ruim',12,'232.342.092-10'),(2342,2,'produto nassa','boa',12,'232.342.092-10'),(12312,12.45,'asdasd','sadadas',12,'232.342.092-10'),(343123,32.4,'boma','ruim',32,'233.233.232-10');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receita_medica`
--

DROP TABLE IF EXISTS `receita_medica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receita_medica` (
  `CRM` varchar(20) NOT NULL,
  `Numero` int NOT NULL,
  `Data` date DEFAULT NULL,
  PRIMARY KEY (`CRM`,`Numero`),
  KEY `Numero` (`Numero`),
  CONSTRAINT `receita_medica_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `medicamento` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receita_medica`
--

LOCK TABLES `receita_medica` WRITE;
/*!40000 ALTER TABLE `receita_medica` DISABLE KEYS */;
/*!40000 ALTER TABLE `receita_medica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `Numero_nota` int NOT NULL,
  `Data` date DEFAULT NULL,
  `Nome_cliente` varchar(100) DEFAULT NULL,
  `CNPJ` varchar(100) NOT NULL,
  PRIMARY KEY (`Numero_nota`),
  KEY `CNPJ` (`CNPJ`),
  CONSTRAINT `venda_ibfk_1` FOREIGN KEY (`CNPJ`) REFERENCES `fabricante` (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendamedicamento`
--

DROP TABLE IF EXISTS `vendamedicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendamedicamento` (
  `Numero_produto` int NOT NULL,
  `Numero_nota` int NOT NULL,
  `Numero_receita` int NOT NULL,
  `imposto` double DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_nota`,`Numero_receita`),
  KEY `fk_venda_perfumaria_idx` (`Numero_nota`),
  KEY `fk_receita_medicamento_idx` (`Numero_receita`),
  CONSTRAINT `fk_produto_medicamento` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`),
  CONSTRAINT `fk_receita_medicamento` FOREIGN KEY (`Numero_receita`) REFERENCES `receita_medica` (`Numero`),
  CONSTRAINT `fk_venda_medicamento` FOREIGN KEY (`Numero_nota`) REFERENCES `venda` (`Numero_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendamedicamento`
--

LOCK TABLES `vendamedicamento` WRITE;
/*!40000 ALTER TABLE `vendamedicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendamedicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendaperfumaria`
--

DROP TABLE IF EXISTS `vendaperfumaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendaperfumaria` (
  `Numero_produto` int NOT NULL,
  `Numero_venda` int NOT NULL,
  `imposto` double DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_venda`),
  KEY `fk_venda_perfumaria_idx` (`Numero_venda`),
  CONSTRAINT `fk_produto_perfumaria` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`),
  CONSTRAINT `fk_venda_perfumaria` FOREIGN KEY (`Numero_venda`) REFERENCES `venda` (`Numero_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendaperfumaria`
--

LOCK TABLES `vendaperfumaria` WRITE;
/*!40000 ALTER TABLE `vendaperfumaria` DISABLE KEYS */;
/*!40000 ALTER TABLE `vendaperfumaria` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-11 20:54:20

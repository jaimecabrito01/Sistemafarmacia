-- MariaDB dump 10.19  Distrib 10.4.20-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: farmacia
-- ------------------------------------------------------
-- Server version	10.4.20-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fabricante` (
  `CNPJ` varchar(14) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nome` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Rua` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Numero` int(11) DEFAULT NULL,
  `Bairro` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricante`
--

LOCK TABLES `fabricante` WRITE;
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
INSERT INTO `fabricante` VALUES ('233.234.454-43','pedro henrique','sla',123,'Cohama');
/*!40000 ALTER TABLE `fabricante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamento` (
  `Numero` int(11) NOT NULL,
  `Tarja` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Formula` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `medicamento_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (234,'Sem Tarja','fsfsfsg');
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfumaria`
--

DROP TABLE IF EXISTS `perfumaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfumaria` (
  `Numero` int(11) NOT NULL,
  `Tipo` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `perfumaria_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfumaria`
--

LOCK TABLES `perfumaria` WRITE;
/*!40000 ALTER TABLE `perfumaria` DISABLE KEYS */;
INSERT INTO `perfumaria` VALUES (124214,'sdgsfsg');
/*!40000 ALTER TABLE `perfumaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `Numero` int(11) NOT NULL,
  `Preco_unitario` decimal(10,2) DEFAULT NULL,
  `Nome_comercial` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Tipo_embalagem` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  `CNPJ` varchar(14) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  KEY `produto_ibfk_1` (`CNPJ`),
  CONSTRAINT `produto_ibfk_1` FOREIGN KEY (`CNPJ`) REFERENCES `fabricante` (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (234,241.00,'dfsdgsg','dfsgs',123,'233.234.454-43'),(12341,100.00,'Piroquicilina','papel',13,'233.234.454-43'),(24123,213.00,'sfsafaf','sfsfsdf',123,'233.234.454-43'),(123434,23.45,'Produto bom','boa',3,'233.234.454-43'),(124214,24214.00,'dasfsaf','gsdgsdg',123,'233.234.454-43'),(124214213,12342.00,'sfsafsaf','sfdsafa',24,'233.234.454-43');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receita_medica`
--

DROP TABLE IF EXISTS `receita_medica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receita_medica` (
  `Numero` int(11) NOT NULL,
  `CRM` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Data` date DEFAULT NULL,
  PRIMARY KEY (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `Numero_nota` int(11) NOT NULL,
  `Data` date DEFAULT NULL,
  `Nome_cliente` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendamedicamento` (
  `Numero_produto` int(11) NOT NULL,
  `Numero_venda` int(11) NOT NULL,
  `Numero_receita` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `imposto` double DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_venda`,`Numero_receita`),
  KEY `fk_venda_idx` (`Numero_venda`),
  KEY `fk_receita_idx` (`Numero_receita`),
  CONSTRAINT `fk_produto` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_receita` FOREIGN KEY (`Numero_receita`) REFERENCES `receita_medica` (`Numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda` FOREIGN KEY (`Numero_venda`) REFERENCES `venda` (`Numero_nota`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
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
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vendaperfumaria` (
  `Numero_produto` int(11) NOT NULL,
  `Numero_nota` int(11) NOT NULL,
  `imposto` double DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_nota`),
  KEY `fk_venda_idx` (`Numero_nota`),
  CONSTRAINT `Numero_produto` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_perfumaria` FOREIGN KEY (`Numero_nota`) REFERENCES `venda` (`Numero_nota`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
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

-- Dump completed on 2023-06-16 12:24:44

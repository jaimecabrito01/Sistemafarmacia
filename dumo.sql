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
  `CNPJ` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nome` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Rua` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Numero` int DEFAULT NULL,
  `Bairro` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`CNPJ`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fabricante`
--

LOCK TABLES `fabricante` WRITE;
/*!40000 ALTER TABLE `fabricante` DISABLE KEYS */;
INSERT INTO `fabricante` VALUES ('123.456.789-10','pedro','sla',12,'CID.OPERARIA'),('234.032.345-97','jaime','avenida arterial norte externa',210,'Maiobinha'),('234.244.782-09','Alan robert','rua 03',40,'Gancharia'),('342.232.757-43','Carneiro','Estrela',23,'Cid.Operaria');
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
  `Tarja` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Formula` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `medicamento_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
INSERT INTO `medicamento` VALUES (423,'Tarja Preta','fsdfsd'),(1234,'Sem Tarja','SAL'),(2342,'Tarja Amarela','adsfs'),(3211,'Tarja Vermelha','dasdad'),(335342,'Tarja Amarela','não tem');
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
  `Tipo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero`),
  CONSTRAINT `perfumaria_ibfk_1` FOREIGN KEY (`Numero`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfumaria`
--

LOCK TABLES `perfumaria` WRITE;
/*!40000 ALTER TABLE `perfumaria` DISABLE KEYS */;
INSERT INTO `perfumaria` VALUES (321,'Masculino'),(3242,'Feminino');
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
  `Preco_unitario` decimal(10,2) DEFAULT NULL,
  `Nome_comercial` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Tipo_embalagem` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Quantidade` int DEFAULT NULL,
  `CNPJ` varchar(14) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
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
INSERT INTO `produto` VALUES (101,12.76,'Aoba','Plastico',13,'342.232.757-43'),(203,12.50,'Neosaldina','Papelão',23,'342.232.757-43'),(321,31.65,'Boaoli','pessima',2,'234.032.345-97'),(423,23.54,'osas','sdasf',12,'342.232.757-43'),(1234,12.50,'Remedio','papel',1,'123.456.789-10'),(2342,1241.00,'sfdsfs','dfdsf',12,'234.244.782-09'),(3211,21.34,'sla','ruim',2,'234.032.345-97'),(3242,31.89,'Tiao','papel',12,'342.232.757-43'),(8738,21.98,'Dorflex','Plastico',12,'234.032.345-97'),(335342,13.99,'Dipirona','Papel',12,'342.232.757-43');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receita_medica`
--

DROP TABLE IF EXISTS `receita_medica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `receita_medica` (
  `Numero` int NOT NULL,
  `CRM` int NOT NULL,
  `Data` date DEFAULT NULL,
  PRIMARY KEY (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receita_medica`
--

LOCK TABLES `receita_medica` WRITE;
/*!40000 ALTER TABLE `receita_medica` DISABLE KEYS */;
INSERT INTO `receita_medica` VALUES (2345,12423,'2022-02-20'),(3421,34453,'2021-02-21'),(3422,23424,'2005-02-23'),(32334,1243223,'2022-12-20');
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
  `Nome_cliente` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`Numero_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1188,'2023-06-17','MArcio joao'),(2087,'2023-06-17','Alberto Prestes'),(3169,'2023-06-17','Marcelo Mato'),(3848,'2023-06-20','pedro'),(4347,'2023-06-17','jão pedro'),(5079,'2023-06-17','Maro Aurelio'),(5946,'2023-06-17','Marcos Andre');
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
  `Numero_venda` int NOT NULL,
  `Numero_receita` int NOT NULL,
  `quantidade` int DEFAULT NULL,
  `imposto` double DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_venda`,`Numero_receita`),
  KEY `fk_venda_idx` (`Numero_venda`),
  KEY `fk_receita_idx` (`Numero_receita`),
  CONSTRAINT `fk_produto` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`),
  CONSTRAINT `fk_receita` FOREIGN KEY (`Numero_receita`) REFERENCES `receita_medica` (`Numero`),
  CONSTRAINT `fk_venda` FOREIGN KEY (`Numero_venda`) REFERENCES `venda` (`Numero_nota`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendamedicamento`
--

LOCK TABLES `vendamedicamento` WRITE;
/*!40000 ALTER TABLE `vendamedicamento` DISABLE KEYS */;
INSERT INTO `vendamedicamento` VALUES (335342,3848,3422,2,12.3);
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
  `Numero_nota` int NOT NULL,
  `imposto` double DEFAULT NULL,
  `quantidade` int DEFAULT NULL,
  PRIMARY KEY (`Numero_produto`,`Numero_nota`),
  KEY `fk_venda_idx` (`Numero_nota`),
  CONSTRAINT `fk_venda_perfumaria` FOREIGN KEY (`Numero_nota`) REFERENCES `venda` (`Numero_nota`),
  CONSTRAINT `Numero_produto` FOREIGN KEY (`Numero_produto`) REFERENCES `produto` (`Numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendaperfumaria`
--

LOCK TABLES `vendaperfumaria` WRITE;
/*!40000 ALTER TABLE `vendaperfumaria` DISABLE KEYS */;
INSERT INTO `vendaperfumaria` VALUES (3242,3848,12.5,3);
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

-- Dump completed on 2023-06-21  9:11:00

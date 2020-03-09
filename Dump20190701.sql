CREATE DATABASE  IF NOT EXISTS `gerenciadorevento` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gerenciadorevento`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: gerenciadorevento
-- ------------------------------------------------------
-- Server version	5.7.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `aluno` (
  `idaluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `ra` varchar(45) DEFAULT NULL,
  `turma` varchar(10) DEFAULT NULL,
  `curso` varchar(255) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idaluno`)
) ENGINE=MyISAM AUTO_INCREMENT=41 DEFAULT CHARSET=latin1 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Jaqueline Luiza Araújo Leite','14330448629-3','1° ano','Tecnológo em Análise e Desenvolvimento de Sistemas','jaquelineluiza4444@gmail.com'),(3,'João Vitor Gomes Silva','14330448629','2° ano','Engenharia de Computação','jvgsilva180@gmail.com'),(4,'carlos','f','1° ano','g','h'),(5,'Jose','f','1° ano','g','j'),(6,'Robson','kjk','1° ano','k','k'),(18,'Maia das Graças','14235896456','2° ano','TCG','kaskjakdas'),(17,'João Henrique de Souza Rafael','146546874687','1° ano','fgdfg','646484'),(11,'Amanda','24654','1° ano','dfdf','dfdsf'),(16,'Djalma de Almeida Mendonça','56846798416-2','1° ano','MSI','djalma@iftm.edu.br'),(19,'Lazaro','21654','1° ano','dfsf','dgdg'),(20,'Júnior','146456464','1° ano','msi','junior@dominio.com'),(21,'Júnior','146456464','1° ano','msi','junior@dominio.com'),(22,'Júnior','146456464','1° ano','msi','junior@dominio.com'),(23,'Júnior','146456464','1° ano','msi','junior@dominio.com'),(27,'Paulo Henrique','21454','2° ano','dfdfds','gfdgdfgdfg'),(28,'Maria Eduarda','254544','3° ano','TMSI','maria@'),(35,'Na luiza','21321312','1° ano','dfdf','gdsgd'),(30,'ana','2435','2° ano','dfdsg','ggd'),(31,'MAri','544554','2° ano','fdfds','fgdfg'),(34,'Paula','35435345','2° ano','dfdf','fddfd'),(36,'fgfgf','fhfh','2° ano','hghgf','ghfh'),(37,'fgfgf','fhfh','2° ano','hghgf','ghfh'),(38,'fgfgf','fhfh','2° ano','hghgf','ghfh'),(39,'hmhj','hjghk','2° ano','kghk','hkghk'),(40,'jhgjg','534345','2° ano','jhgjg','gjgjh');
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aluno_trabalho`
--

DROP TABLE IF EXISTS `aluno_trabalho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `aluno_trabalho` (
  `idaluno_trabalho` int(11) NOT NULL AUTO_INCREMENT,
  `aluno_trabalho` int(11) NOT NULL,
  `trabalho` int(11) NOT NULL,
  PRIMARY KEY (`idaluno_trabalho`),
  KEY `aluno_trabalho_fk_idx` (`aluno_trabalho`),
  KEY `trabalho_fk_idx` (`trabalho`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno_trabalho`
--

LOCK TABLES `aluno_trabalho` WRITE;
/*!40000 ALTER TABLE `aluno_trabalho` DISABLE KEYS */;
/*!40000 ALTER TABLE `aluno_trabalho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avaliacao`
--

DROP TABLE IF EXISTS `avaliacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `avaliacao` (
  `idavaliacao` int(11) NOT NULL AUTO_INCREMENT,
  `avaliador` int(11) NOT NULL,
  `trabalho_avaliado` int(11) NOT NULL,
  `notaCriterio1` int(11) NOT NULL,
  `notaCriterio2` int(11) NOT NULL,
  `notaCriterio3` int(11) NOT NULL,
  `notaCriterio4` int(11) NOT NULL,
  `notaCriterio5` int(11) NOT NULL,
  `notaCriterio6` int(11) NOT NULL,
  `notaCriterio7` int(11) NOT NULL,
  `notaCriterio8` int(11) NOT NULL,
  `notaCriterio9` int(11) NOT NULL,
  `notaCriterio10` int(11) NOT NULL,
  `notaCriterio11` int(11) NOT NULL,
  `notaCriterio12` int(11) NOT NULL,
  `notaCriterio13` int(11) NOT NULL,
  `data` date NOT NULL,
  `periodo` varchar(255) NOT NULL,
  PRIMARY KEY (`idavaliacao`),
  KEY `avaliador_fk_idx` (`avaliador`),
  KEY `trabalho_avaliado_idx` (`trabalho_avaliado`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avaliacao`
--

LOCK TABLES `avaliacao` WRITE;
/*!40000 ALTER TABLE `avaliacao` DISABLE KEYS */;
INSERT INTO `avaliacao` VALUES (1,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,'2019-07-12','Manhã'),(2,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,'2019-07-04','Manhã'),(3,3,1,3,3,3,3,3,3,3,3,3,3,3,3,3,'2019-07-11','Manhã');
/*!40000 ALTER TABLE `avaliacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `avaliador_trabalho`
--

DROP TABLE IF EXISTS `avaliador_trabalho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `avaliador_trabalho` (
  `idavaliador_trabalho` int(11) NOT NULL AUTO_INCREMENT,
  `pessoa_avaliador` int(11) NOT NULL,
  `trabalho_avaliar` int(11) NOT NULL,
  PRIMARY KEY (`idavaliador_trabalho`),
  KEY `pessoa_avaliador_idx` (`pessoa_avaliador`),
  KEY `trabalho_avaliar_idx` (`trabalho_avaliar`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `avaliador_trabalho`
--

LOCK TABLES `avaliador_trabalho` WRITE;
/*!40000 ALTER TABLE `avaliador_trabalho` DISABLE KEYS */;
INSERT INTO `avaliador_trabalho` VALUES (1,4,1),(2,3,1),(3,7,5);
/*!40000 ALTER TABLE `avaliador_trabalho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criterio`
--

DROP TABLE IF EXISTS `criterio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `criterio` (
  `idcriterio` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(255) NOT NULL,
  PRIMARY KEY (`idcriterio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criterio`
--

LOCK TABLES `criterio` WRITE;
/*!40000 ALTER TABLE `criterio` DISABLE KEYS */;
/*!40000 ALTER TABLE `criterio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `evento` (
  `idevento` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `ano` varchar(20) NOT NULL,
  `dtInicio` date NOT NULL,
  `dtTermino` date NOT NULL,
  `qtMinMenbro` int(11) NOT NULL,
  `qtMaxMenbro` int(11) NOT NULL,
  `nota` double NOT NULL,
  `qtAvaliador` int(11) NOT NULL,
  `criterio` varchar(255) NOT NULL,
  PRIMARY KEY (`idevento`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` VALUES (1,'MTEC','2019','2019-12-12','2019-12-13',1,3,5,3,'a'),(6,'Educ','2019','1970-01-01','1970-01-01',1,1,1,1,'1'),(8,'ConInter EPT','2019','2019-06-22','2019-06-28',1,2,3,1,'fgdfgdf');
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penalizacao`
--

DROP TABLE IF EXISTS `penalizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `penalizacao` (
  `idpenalizacao` int(11) NOT NULL AUTO_INCREMENT,
  `razao` varchar(255) NOT NULL,
  `aluno_pen` int(11) NOT NULL,
  `evento_pen` int(11) NOT NULL,
  PRIMARY KEY (`idpenalizacao`),
  KEY `aluno_pen_fk_idx` (`aluno_pen`),
  KEY `evento_pen_idx` (`evento_pen`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penalizacao`
--

LOCK TABLES `penalizacao` WRITE;
/*!40000 ALTER TABLE `penalizacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `penalizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa`
--

DROP TABLE IF EXISTS `pessoa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `pessoa` (
  `idpessoa` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `siape` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `login` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`idpessoa`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa`
--

LOCK TABLES `pessoa` WRITE;
/*!40000 ALTER TABLE `pessoa` DISABLE KEYS */;
INSERT INTO `pessoa` VALUES (1,'as','ds','Administrador','gg','hh'),(3,'João das Neves de Oliveira','35464875465','Avaliador','joão','123456'),(4,'Amado Batista','21365445','Administrador','amado@batista','13464644'),(6,'Ana vitoria','54654654','Administrador','@','A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3'),(7,'Mauro','54574544','Administrador','mau','1'),(8,'Ana cecilia','35465684','Administrador','ana','A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3');
/*!40000 ALTER TABLE `pessoa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabalho`
--

DROP TABLE IF EXISTS `trabalho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `trabalho` (
  `idtrabalho` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(255) NOT NULL,
  `alunoLider` int(11) NOT NULL,
  `integrantes` int(11) NOT NULL,
  `orientador` int(11) NOT NULL,
  `coorientador` int(11) NOT NULL,
  `resumo` varchar(255) NOT NULL,
  `equipamentos` varchar(255) NOT NULL,
  `evento` int(11) NOT NULL,
  PRIMARY KEY (`idtrabalho`),
  KEY `alunoLider_fk_idx` (`alunoLider`),
  KEY `integrantes_fk_idx` (`integrantes`),
  KEY `orientador_idx` (`orientador`),
  KEY `coorientador_idx` (`coorientador`),
  KEY `evento_idx` (`evento`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabalho`
--

LOCK TABLES `trabalho` WRITE;
/*!40000 ALTER TABLE `trabalho` DISABLE KEYS */;
INSERT INTO `trabalho` VALUES (1,'Bus',1,2,1,2,'dsadsad','dfsdfsd',1),(2,'Bus',2,2,2,2,'dsadsad','dfsdfsd',2),(3,'fdsfsd',1,1,4,4,'dsfdsf','dfsdf',0),(4,'hfhdfh',3,3,1,1,'fgdf','hdfhdh',0),(5,'hjg',6,6,1,1,'ugkgkg','uhkgkg',0),(6,'kjgfhgf',18,18,3,3,'kkgkg','kjhkhh',0);
/*!40000 ALTER TABLE `trabalho` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-01 16:45:11

-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: localhost    Database: oauth2
-- ------------------------------------------------------
-- Server version	5.6.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--
create database if not exists oauth2;
DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isbn` varchar(45) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `sub_title` text,
  `description` text,
  `author` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (3,'9781932394061','Art of Java Web Development','A guide to the topics required for state of the art web development','A guide to the topics required for state of the art web development, this book covers wide-ranging topics, including a variety of web development frameworks and best practices. Beginning with coverage of the history of the architecture of web applications, highlighting the uses of the standard web API to create applications with increasingly sophisticated architectures, developers are led through a discussion on the development of industry accepted best practices for architecture.Described is the history and evolution towards this architecture and the reasons that it is superior to previous efforts. Also provided is an overview of the most popular web application frameworks, covering their architecture and use. Numerous frameworks exist, but trying to evaluate them is difficult because their documentation stresses their advantages but hides their deficiencies. Here, the same application is built in six different frameworks, providing a way to perform an informed comparison. Also provided is an evaluation of the pros and cons of each framework to assist in making a decision or evaluating a framework on your own. Finally, best practices are covered, including sophisticated user interface techniques, intelligent caching and resource management, performance tuning, debugging, testing, and Web services.','Neal Ford'),(4,'1930110936','AspectJ in Action','Practical Aspect-Oriented Programming','A software system is the realization of a set of concerns. One of the central premises of object-oriented programming is that each concern should be implemented as a separate module. However, there are certain system-wide concerns, such as logging, security, performance, and so forth, that often need to be addressed in many, if not all of the modules. Consequently, the code to handle these system-wide concerns may be mixed in with the core logic of a huge number of modules, resulting in lower productivity, poor quality, and systems that are hard to evolve.','Ramnivas Laddad'),(5,'1933988940','ActiveMQ In Action','source implementation of the Java Message Service spec','The Apache ActiveMQ message broker is an open source implementation of the Java Message Service spec. It makes for a reliable hub in any message-oriented enterprise application and integrates beautifully with Java EE containers, ESBs, and other JMS providers.ActiveMQ in Action is all you\'ll need to master ActiveMQ. It starts from the anatomy of a JMS message and moves quickly through connectors, message persistence, authentication, and authorization. By following a running example (a stock portfolio app), you\'ll pick up the best practices distilled by the authors from their long and deep involvement with this technology.','Bruce Snyder, Dejan Bosanac, and Rob Davies'),(6,'1930110936','AspectJ in Action','Practical Aspect-Oriented Programming','A software system is the realization of a set of concerns. One of the central premises of object-oriented programming is that each concern should be implemented as a separate module. However, there are certain system-wide concerns, such as logging, security, performance, and so forth, that often need to be addressed in many, if not all of the modules. Consequently, the code to handle these system-wide concerns may be mixed in with the core logic of a huge number of modules, resulting in lower productivity, poor quality, and systems that are hard to evolve.','Ramnivas Laddad'),(7,'1930110936','AspectJ in Action','Practical Aspect-Oriented Programming','A software system is the realization of a set of concerns. One of the central premises of object-oriented programming is that each concern should be implemented as a separate module. However, there are certain system-wide concerns, such as logging, security, performance, and so forth, that often need to be addressed in many, if not all of the modules. Consequently, the code to handle these system-wide concerns may be mixed in with the core logic of a huge number of modules, resulting in lower productivity, poor quality, and systems that are hard to evolve.','Ramnivas Laddad'),(8,'1933988940','ActiveMQ In Action','source implementation of the Java Message Service spec','The Apache ActiveMQ message broker is an open source implementation of the Java Message Service spec. It makes for a reliable hub in any message-oriented enterprise application and integrates beautifully with Java EE containers, ESBs, and other JMS providers.ActiveMQ in Action is all you\'ll need to master ActiveMQ. It starts from the anatomy of a JMS message and moves quickly through connectors, message persistence, authentication, and authorization. By following a running example (a stock portfolio app), you\'ll pick up the best practices distilled by the authors from their long and deep involvement with this technology.','Bosanac, and Rob Davies'),(9,'1930110936','AspectJ in Action','Practical Aspect-Oriented Programming','A software system is the realization of a set of concerns. One of the central premises of object-oriented programming is that each concern should be implemented as a separate module. However, there are certain system-wide concerns, such as logging, security, performance, and so forth, that often need to be addressed in many, if not all of the modules. Consequently, the code to handle these system-wide concerns may be mixed in with the core logic of a huge number of modules, resulting in lower productivity, poor quality, and systems that are hard to evolve.','Ramnivas Laddad');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-09 20:52:45

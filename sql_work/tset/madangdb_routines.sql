-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: madangdb
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Temporary view structure for view `vw_total`
--

DROP TABLE IF EXISTS `vw_total`;
/*!50001 DROP VIEW IF EXISTS `vw_total`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_total` AS SELECT 
 1 AS `name`,
 1 AS `orderid`,
 1 AS `bookid`,
 1 AS `bookname`,
 1 AS `saleprice`,
 1 AS `custid`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vorders`
--

DROP TABLE IF EXISTS `vorders`;
/*!50001 DROP VIEW IF EXISTS `vorders`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vorders` AS SELECT 
 1 AS `orderid`,
 1 AS `custid`,
 1 AS `name`,
 1 AS `bookid`,
 1 AS `bookname`,
 1 AS `saleprice`,
 1 AS `orderdate`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `vw_customer`
--

DROP TABLE IF EXISTS `vw_customer`;
/*!50001 DROP VIEW IF EXISTS `vw_customer`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `vw_customer` AS SELECT 
 1 AS `custid`,
 1 AS `name`,
 1 AS `address`,
 1 AS `phone`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `vw_total`
--

/*!50001 DROP VIEW IF EXISTS `vw_total`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_total` AS select `c`.`name` AS `name`,`o`.`orderid` AS `orderid`,`o`.`bookid` AS `bookid`,`b`.`bookname` AS `bookname`,`o`.`saleprice` AS `saleprice`,`o`.`custid` AS `custid` from ((`orders` `o` join `book` `b`) join `customer` `c`) where ((`o`.`custid` = `c`.`custid`) and (`b`.`bookid` = `o`.`bookid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vorders`
--

/*!50001 DROP VIEW IF EXISTS `vorders`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vorders` AS select `o`.`orderid` AS `orderid`,`o`.`custid` AS `custid`,`c`.`name` AS `name`,`o`.`bookid` AS `bookid`,`b`.`bookname` AS `bookname`,`o`.`saleprice` AS `saleprice`,`o`.`orderdate` AS `orderdate` from ((`customer` `c` join `orders` `o`) join `book` `b`) where ((`c`.`custid` = `o`.`custid`) and (`b`.`bookid` = `o`.`bookid`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `vw_customer`
--

/*!50001 DROP VIEW IF EXISTS `vw_customer`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `vw_customer` AS select `c`.`custid` AS `custid`,`c`.`name` AS `name`,`c`.`address` AS `address`,`c`.`phone` AS `phone` from `customer` `c` where (`c`.`address` = '%대한민국%') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-06 15:35:40

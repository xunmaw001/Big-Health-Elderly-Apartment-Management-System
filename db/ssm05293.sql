-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm05293
-- ------------------------------------------------------
-- Server version	5.7.31

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
-- Current Database: `ssm05293`
--

/*!40000 DROP DATABASE IF EXISTS `ssm05293`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm05293` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm05293`;

--
-- Table structure for table `chuangweixinxi`
--

DROP TABLE IF EXISTS `chuangweixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chuangweixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangjianhao` varchar(200) DEFAULT NULL COMMENT '房间号',
  `chuangweihao` varchar(200) NOT NULL COMMENT '床位号',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `chuangweizhuangtai` varchar(200) DEFAULT NULL COMMENT '床位状态',
  `xiangxijieshao` longtext COMMENT '详细介绍',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `chuangweihao` (`chuangweihao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='床位信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chuangweixinxi`
--

LOCK TABLES `chuangweixinxi` WRITE;
/*!40000 ALTER TABLE `chuangweixinxi` DISABLE KEYS */;
INSERT INTO `chuangweixinxi` VALUES (71,'2022-03-10 02:39:59','房间号1','床位号1','upload/chuangweixinxi_tupian1.jpg','位置1','空置','详细介绍1','2022-03-10 10:39:59',1),(72,'2022-03-10 02:39:59','房间号2','床位号2','upload/chuangweixinxi_tupian2.jpg','位置2','空置','详细介绍2','2022-03-10 10:39:59',2),(73,'2022-03-10 02:39:59','房间号3','床位号3','upload/chuangweixinxi_tupian3.jpg','位置3','空置','详细介绍3','2022-03-10 10:39:59',3),(74,'2022-03-10 02:39:59','房间号4','床位号4','upload/chuangweixinxi_tupian4.jpg','位置4','空置','详细介绍4','2022-03-10 10:39:59',4),(75,'2022-03-10 02:39:59','房间号5','床位号5','upload/chuangweixinxi_tupian5.jpg','位置5','空置','详细介绍5','2022-03-10 10:39:59',5),(76,'2022-03-10 02:39:59','房间号6','床位号6','upload/chuangweixinxi_tupian6.jpg','位置6','空置','详细介绍6','2022-03-10 10:39:59',6);
/*!40000 ALTER TABLE `chuangweixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fangjianxinxi`
--

DROP TABLE IF EXISTS `fangjianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fangjianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangjianhao` varchar(200) NOT NULL COMMENT '房间号',
  `louceng` varchar(200) DEFAULT NULL COMMENT '楼层',
  `kefangleixing` varchar(200) DEFAULT NULL COMMENT '客房类型',
  `fangjiantupian` varchar(200) DEFAULT NULL COMMENT '房间图片',
  `fangjianmianji` varchar(200) DEFAULT NULL COMMENT '房间面积',
  `fangjianzhuangtai` varchar(200) DEFAULT NULL COMMENT '房间状态',
  `kongxianchuangwei` int(11) DEFAULT NULL COMMENT '空闲床位',
  `fangjianhuanjing` longtext COMMENT '房间环境',
  `fangjianjieshao` longtext COMMENT '房间介绍',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='房间信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fangjianxinxi`
--

LOCK TABLES `fangjianxinxi` WRITE;
/*!40000 ALTER TABLE `fangjianxinxi` DISABLE KEYS */;
INSERT INTO `fangjianxinxi` VALUES (61,'2022-03-10 02:39:59','房间号1','楼层1','客房类型1','upload/fangjianxinxi_fangjiantupian1.jpg','房间面积1','已满',1,'房间环境1','房间介绍1','2022-03-10 10:39:59',1),(62,'2022-03-10 02:39:59','房间号2','楼层2','客房类型2','upload/fangjianxinxi_fangjiantupian2.jpg','房间面积2','已满',2,'房间环境2','房间介绍2','2022-03-10 10:39:59',2),(63,'2022-03-10 02:39:59','房间号3','楼层3','客房类型3','upload/fangjianxinxi_fangjiantupian3.jpg','房间面积3','已满',3,'房间环境3','房间介绍3','2022-03-10 10:39:59',3),(64,'2022-03-10 02:39:59','房间号4','楼层4','客房类型4','upload/fangjianxinxi_fangjiantupian4.jpg','房间面积4','已满',4,'房间环境4','房间介绍4','2022-03-10 10:39:59',4),(65,'2022-03-10 02:39:59','房间号5','楼层5','客房类型5','upload/fangjianxinxi_fangjiantupian5.jpg','房间面积5','已满',5,'房间环境5','房间介绍5','2022-03-10 10:39:59',5),(66,'2022-03-10 02:39:59','房间号6','楼层6','客房类型6','upload/fangjianxinxi_fangjiantupian6.jpg','房间面积6','已满',6,'房间环境6','房间介绍6','2022-03-10 10:39:59',6);
/*!40000 ALTER TABLE `fangjianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hulijilu`
--

DROP TABLE IF EXISTS `hulijilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hulijilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `hulidengji` varchar(200) DEFAULT NULL COMMENT '护理等级',
  `hulineirong` longtext COMMENT '护理内容',
  `hulishijian` datetime DEFAULT NULL COMMENT '护理时间',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='护理记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hulijilu`
--

LOCK TABLES `hulijilu` WRITE;
/*!40000 ALTER TABLE `hulijilu` DISABLE KEYS */;
INSERT INTO `hulijilu` VALUES (131,'2022-03-10 02:39:59','姓名1','年龄1','手机1','特级护理','护理内容1','2022-03-10 10:39:59','备注1','护理账号1','护理姓名1'),(132,'2022-03-10 02:39:59','姓名2','年龄2','手机2','特级护理','护理内容2','2022-03-10 10:39:59','备注2','护理账号2','护理姓名2'),(133,'2022-03-10 02:39:59','姓名3','年龄3','手机3','特级护理','护理内容3','2022-03-10 10:39:59','备注3','护理账号3','护理姓名3'),(134,'2022-03-10 02:39:59','姓名4','年龄4','手机4','特级护理','护理内容4','2022-03-10 10:39:59','备注4','护理账号4','护理姓名4'),(135,'2022-03-10 02:39:59','姓名5','年龄5','手机5','特级护理','护理内容5','2022-03-10 10:39:59','备注5','护理账号5','护理姓名5'),(136,'2022-03-10 02:39:59','姓名6','年龄6','手机6','特级护理','护理内容6','2022-03-10 10:39:59','备注6','护理账号6','护理姓名6');
/*!40000 ALTER TABLE `hulijilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hulirenyuan`
--

DROP TABLE IF EXISTS `hulirenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hulirenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hulizhanghao` varchar(200) NOT NULL COMMENT '护理账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `hulixingming` varchar(200) NOT NULL COMMENT '护理姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `ruzhiriqi` date DEFAULT NULL COMMENT '入职日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hulizhanghao` (`hulizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='护理人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hulirenyuan`
--

LOCK TABLES `hulirenyuan` WRITE;
/*!40000 ALTER TABLE `hulirenyuan` DISABLE KEYS */;
INSERT INTO `hulirenyuan` VALUES (41,'2022-03-10 02:39:59','44','44','护理姓名1',1,'男','13823888881','upload/hulirenyuan_zhaopian1.jpg','2022-03-10'),(42,'2022-03-10 02:39:59','护理账号2','123456','护理姓名2',2,'男','13823888882','upload/hulirenyuan_zhaopian2.jpg','2022-03-10'),(43,'2022-03-10 02:39:59','护理账号3','123456','护理姓名3',3,'男','13823888883','upload/hulirenyuan_zhaopian3.jpg','2022-03-10'),(44,'2022-03-10 02:39:59','护理账号4','123456','护理姓名4',4,'男','13823888884','upload/hulirenyuan_zhaopian4.jpg','2022-03-10'),(45,'2022-03-10 02:39:59','护理账号5','123456','护理姓名5',5,'男','13823888885','upload/hulirenyuan_zhaopian5.jpg','2022-03-10'),(46,'2022-03-10 02:39:59','护理账号6','123456','护理姓名6',6,'男','13823888886','upload/hulirenyuan_zhaopian6.jpg','2022-03-10');
/*!40000 ALTER TABLE `hulirenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiedaidengji`
--

DROP TABLE IF EXISTS `jiedaidengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiedaidengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dengjibianhao` varchar(200) DEFAULT NULL COMMENT '登记编号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `jiedaishijian` datetime DEFAULT NULL COMMENT '接待时间',
  `jiedaiqingkuang` longtext COMMENT '接待情况',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dengjibianhao` (`dengjibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='接待登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiedaidengji`
--

LOCK TABLES `jiedaidengji` WRITE;
/*!40000 ALTER TABLE `jiedaidengji` DISABLE KEYS */;
INSERT INTO `jiedaidengji` VALUES (101,'2022-03-10 02:39:59','1111111111','姓名1','性别1','13823888881','年龄1','2022-03-10 10:39:59','接待情况1',1),(102,'2022-03-10 02:39:59','2222222222','姓名2','性别2','13823888882','年龄2','2022-03-10 10:39:59','接待情况2',2),(103,'2022-03-10 02:39:59','3333333333','姓名3','性别3','13823888883','年龄3','2022-03-10 10:39:59','接待情况3',3),(104,'2022-03-10 02:39:59','4444444444','姓名4','性别4','13823888884','年龄4','2022-03-10 10:39:59','接待情况4',4),(105,'2022-03-10 02:39:59','5555555555','姓名5','性别5','13823888885','年龄5','2022-03-10 10:39:59','接待情况5',5),(106,'2022-03-10 02:39:59','6666666666','姓名6','性别6','13823888886','年龄6','2022-03-10 10:39:59','接待情况6',6);
/*!40000 ALTER TABLE `jiedaidengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiedairenyuan`
--

DROP TABLE IF EXISTS `jiedairenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiedairenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiedaizhanghao` varchar(200) NOT NULL COMMENT '接待账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jiedaixingming` varchar(200) NOT NULL COMMENT '接待姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `ruzhiriqi` date DEFAULT NULL COMMENT '入职日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiedaizhanghao` (`jiedaizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='接待人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiedairenyuan`
--

LOCK TABLES `jiedairenyuan` WRITE;
/*!40000 ALTER TABLE `jiedairenyuan` DISABLE KEYS */;
INSERT INTO `jiedairenyuan` VALUES (21,'2022-03-10 02:39:59','22','22','接待姓名1',1,'男','13823888881','upload/jiedairenyuan_zhaopian1.jpg','2022-03-10'),(22,'2022-03-10 02:39:59','接待账号2','123456','接待姓名2',2,'男','13823888882','upload/jiedairenyuan_zhaopian2.jpg','2022-03-10'),(23,'2022-03-10 02:39:59','接待账号3','123456','接待姓名3',3,'男','13823888883','upload/jiedairenyuan_zhaopian3.jpg','2022-03-10'),(24,'2022-03-10 02:39:59','接待账号4','123456','接待姓名4',4,'男','13823888884','upload/jiedairenyuan_zhaopian4.jpg','2022-03-10'),(25,'2022-03-10 02:39:59','接待账号5','123456','接待姓名5',5,'男','13823888885','upload/jiedairenyuan_zhaopian5.jpg','2022-03-10'),(26,'2022-03-10 02:39:59','接待账号6','123456','接待姓名6',6,'男','13823888886','upload/jiedairenyuan_zhaopian6.jpg','2022-03-10');
/*!40000 ALTER TABLE `jiedairenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiesuanqingdan`
--

DROP TABLE IF EXISTS `jiesuanqingdan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiesuanqingdan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qingdanbianhao` varchar(200) DEFAULT NULL COMMENT '清单编号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `yajin` int(11) DEFAULT NULL COMMENT '押金',
  `qitafeiyong` int(11) DEFAULT NULL COMMENT '其它费用',
  `xuzhufeiyong` int(11) DEFAULT NULL COMMENT '续住费用',
  `zhusufei` int(11) DEFAULT NULL COMMENT '住宿费',
  `tuizhufeiyong` int(11) DEFAULT NULL COMMENT '退住费用',
  `zongfeiyong` int(11) DEFAULT NULL COMMENT '总费用',
  `lurushijian` datetime DEFAULT NULL COMMENT '录入时间',
  `shoufeizhanghao` varchar(200) DEFAULT NULL COMMENT '收费账号',
  `shoufeixingming` varchar(200) DEFAULT NULL COMMENT '收费姓名',
  `ispay` varchar(200) DEFAULT '未支付' COMMENT '是否支付',
  PRIMARY KEY (`id`),
  UNIQUE KEY `qingdanbianhao` (`qingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=167 DEFAULT CHARSET=utf8 COMMENT='结算清单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiesuanqingdan`
--

LOCK TABLES `jiesuanqingdan` WRITE;
/*!40000 ALTER TABLE `jiesuanqingdan` DISABLE KEYS */;
INSERT INTO `jiesuanqingdan` VALUES (161,'2022-03-10 02:39:59','1111111111','姓名1','身份证1','手机1',1,1,1,1,1,1,'2022-03-10 10:39:59','收费账号1','收费姓名1','未支付'),(162,'2022-03-10 02:39:59','2222222222','姓名2','身份证2','手机2',2,2,2,2,2,2,'2022-03-10 10:39:59','收费账号2','收费姓名2','未支付'),(163,'2022-03-10 02:39:59','3333333333','姓名3','身份证3','手机3',3,3,3,3,3,3,'2022-03-10 10:39:59','收费账号3','收费姓名3','未支付'),(164,'2022-03-10 02:39:59','4444444444','姓名4','身份证4','手机4',4,4,4,4,4,4,'2022-03-10 10:39:59','收费账号4','收费姓名4','未支付'),(165,'2022-03-10 02:39:59','5555555555','姓名5','身份证5','手机5',5,5,5,5,5,5,'2022-03-10 10:39:59','收费账号5','收费姓名5','未支付'),(166,'2022-03-10 02:39:59','6666666666','姓名6','身份证6','手机6',6,6,6,6,6,6,'2022-03-10 10:39:59','收费账号6','收费姓名6','未支付');
/*!40000 ALTER TABLE `jiesuanqingdan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laoren`
--

DROP TABLE IF EXISTS `laoren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laoren` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `nianling` varchar(200) NOT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) NOT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='老人';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laoren`
--

LOCK TABLES `laoren` WRITE;
/*!40000 ALTER TABLE `laoren` DISABLE KEYS */;
INSERT INTO `laoren` VALUES (11,'2022-03-10 02:39:59','11','11','年龄1','男','13823888881','440300199101010001','upload/laoren_zhaopian1.jpg'),(12,'2022-03-10 02:39:59','姓名2','123456','年龄2','男','13823888882','440300199202020002','upload/laoren_zhaopian2.jpg'),(13,'2022-03-10 02:39:59','姓名3','123456','年龄3','男','13823888883','440300199303030003','upload/laoren_zhaopian3.jpg'),(14,'2022-03-10 02:39:59','姓名4','123456','年龄4','男','13823888884','440300199404040004','upload/laoren_zhaopian4.jpg'),(15,'2022-03-10 02:39:59','姓名5','123456','年龄5','男','13823888885','440300199505050005','upload/laoren_zhaopian5.jpg'),(16,'2022-03-10 02:39:59','姓名6','123456','年龄6','男','13823888886','440300199606060006','upload/laoren_zhaopian6.jpg');
/*!40000 ALTER TABLE `laoren` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laorendangan`
--

DROP TABLE IF EXISTS `laorendangan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laorendangan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shengao` varchar(200) DEFAULT NULL COMMENT '身高',
  `tizhong` varchar(200) DEFAULT NULL COMMENT '体重',
  `jiwangbingshi` longtext COMMENT '既往病史',
  `zhuyishixiang` longtext COMMENT '注意事项',
  `beizhu` longtext COMMENT '备注',
  `lurushijian` date DEFAULT NULL COMMENT '录入时间',
  `hulineirong` longtext COMMENT '护理内容',
  `jiankangqingkuang` longtext COMMENT '健康情况',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='老人档案';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laorendangan`
--

LOCK TABLES `laorendangan` WRITE;
/*!40000 ALTER TABLE `laorendangan` DISABLE KEYS */;
INSERT INTO `laorendangan` VALUES (121,'2022-03-10 02:39:59','姓名1','男','年龄1','手机1','身份证1','身高1','体重1','既往病史1','注意事项1','备注1','2022-03-10','护理内容1','健康情况1'),(122,'2022-03-10 02:39:59','姓名2','男','年龄2','手机2','身份证2','身高2','体重2','既往病史2','注意事项2','备注2','2022-03-10','护理内容2','健康情况2'),(123,'2022-03-10 02:39:59','姓名3','男','年龄3','手机3','身份证3','身高3','体重3','既往病史3','注意事项3','备注3','2022-03-10','护理内容3','健康情况3'),(124,'2022-03-10 02:39:59','姓名4','男','年龄4','手机4','身份证4','身高4','体重4','既往病史4','注意事项4','备注4','2022-03-10','护理内容4','健康情况4'),(125,'2022-03-10 02:39:59','姓名5','男','年龄5','手机5','身份证5','身高5','体重5','既往病史5','注意事项5','备注5','2022-03-10','护理内容5','健康情况5'),(126,'2022-03-10 02:39:59','姓名6','男','年龄6','手机6','身份证6','身高6','体重6','既往病史6','注意事项6','备注6','2022-03-10','护理内容6','健康情况6');
/*!40000 ALTER TABLE `laorendangan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laorenqingjia`
--

DROP TABLE IF EXISTS `laorenqingjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laorenqingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `qishishijian` datetime DEFAULT NULL COMMENT '起始时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `qingjiatianshu` varchar(200) DEFAULT NULL COMMENT '请假天数',
  `shifouxiaojia` varchar(200) DEFAULT NULL COMMENT '是否销假',
  `qingjiayuanyin` longtext COMMENT '请假原因',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='老人请假';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laorenqingjia`
--

LOCK TABLES `laorenqingjia` WRITE;
/*!40000 ALTER TABLE `laorenqingjia` DISABLE KEYS */;
INSERT INTO `laorenqingjia` VALUES (141,'2022-03-10 02:39:59','姓名1','手机1','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数1','是','请假原因1','是',''),(142,'2022-03-10 02:39:59','姓名2','手机2','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数2','是','请假原因2','是',''),(143,'2022-03-10 02:39:59','姓名3','手机3','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数3','是','请假原因3','是',''),(144,'2022-03-10 02:39:59','姓名4','手机4','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数4','是','请假原因4','是',''),(145,'2022-03-10 02:39:59','姓名5','手机5','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数5','是','请假原因5','是',''),(146,'2022-03-10 02:39:59','姓名6','手机6','2022-03-10 10:39:59','2022-03-10 10:39:59','请假天数6','是','请假原因6','是','');
/*!40000 ALTER TABLE `laorenqingjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laorenyuyue`
--

DROP TABLE IF EXISTS `laorenyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laorenyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `yuyueshijian` datetime DEFAULT NULL COMMENT '预约时间',
  `beizhu` longtext COMMENT '备注',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646880351439 DEFAULT CHARSET=utf8 COMMENT='老人预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laorenyuyue`
--

LOCK TABLES `laorenyuyue` WRITE;
/*!40000 ALTER TABLE `laorenyuyue` DISABLE KEYS */;
INSERT INTO `laorenyuyue` VALUES (81,'2022-03-10 02:39:59','1111111111','姓名1','年龄1','性别1','手机1','2022-03-10 10:39:59','备注1','联系电话1',1),(82,'2022-03-10 02:39:59','2222222222','姓名2','年龄2','性别2','手机2','2022-03-10 10:39:59','备注2','联系电话2',2),(83,'2022-03-10 02:39:59','3333333333','姓名3','年龄3','性别3','手机3','2022-03-10 10:39:59','备注3','联系电话3',3),(84,'2022-03-10 02:39:59','4444444444','姓名4','年龄4','性别4','手机4','2022-03-10 10:39:59','备注4','联系电话4',4),(85,'2022-03-10 02:39:59','5555555555','姓名5','年龄5','性别5','手机5','2022-03-10 10:39:59','备注5','联系电话5',5),(86,'2022-03-10 02:39:59','6666666666','姓名6','年龄6','性别6','手机6','2022-03-10 10:39:59','备注6','联系电话6',6),(1646880351438,'2022-03-10 02:45:51','1646880348212','水电费','2','男','水电费是','2022-03-10 10:45:48','时代','1112221111',22);
/*!40000 ALTER TABLE `laorenyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaoyuyue`
--

DROP TABLE IF EXISTS `quxiaoyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaoyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) DEFAULT NULL COMMENT '预约编号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `quxiaoshijian` datetime DEFAULT NULL COMMENT '取消时间',
  `quxiaoyuanyin` longtext COMMENT '取消原因',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1646880392198 DEFAULT CHARSET=utf8 COMMENT='取消预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaoyuyue`
--

LOCK TABLES `quxiaoyuyue` WRITE;
/*!40000 ALTER TABLE `quxiaoyuyue` DISABLE KEYS */;
INSERT INTO `quxiaoyuyue` VALUES (91,'2022-03-10 02:39:59','预约编号1','姓名1','年龄1','性别1','手机1','2022-03-10 10:39:59','取消原因1','联系电话1',1),(92,'2022-03-10 02:39:59','预约编号2','姓名2','年龄2','性别2','手机2','2022-03-10 10:39:59','取消原因2','联系电话2',2),(93,'2022-03-10 02:39:59','预约编号3','姓名3','年龄3','性别3','手机3','2022-03-10 10:39:59','取消原因3','联系电话3',3),(94,'2022-03-10 02:39:59','预约编号4','姓名4','年龄4','性别4','手机4','2022-03-10 10:39:59','取消原因4','联系电话4',4),(95,'2022-03-10 02:39:59','预约编号5','姓名5','年龄5','性别5','手机5','2022-03-10 10:39:59','取消原因5','联系电话5',5),(96,'2022-03-10 02:39:59','预约编号6','姓名6','年龄6','性别6','手机6','2022-03-10 10:39:59','取消原因6','联系电话6',6),(1646880392197,'2022-03-10 02:46:31','22','22','2','男','2211122','2022-03-10 10:46:26','时代','',22);
/*!40000 ALTER TABLE `quxiaoyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruzhudengji`
--

DROP TABLE IF EXISTS `ruzhudengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruzhudengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangjianhao` varchar(200) DEFAULT NULL COMMENT '房间号',
  `chuangweihao` varchar(200) DEFAULT NULL COMMENT '床位号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `ruzhuzhuangtai` varchar(200) DEFAULT NULL COMMENT '入住状态',
  `ruzhushijian` datetime DEFAULT NULL COMMENT '入住时间',
  `hulizhanghao` varchar(200) DEFAULT NULL COMMENT '护理账号',
  `hulixingming` varchar(200) DEFAULT NULL COMMENT '护理姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=117 DEFAULT CHARSET=utf8 COMMENT='入住登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruzhudengji`
--

LOCK TABLES `ruzhudengji` WRITE;
/*!40000 ALTER TABLE `ruzhudengji` DISABLE KEYS */;
INSERT INTO `ruzhudengji` VALUES (111,'2022-03-10 02:39:59','房间号1','床位号1','姓名1','身份证1','手机1','已入住','2022-03-10 10:39:59','护理账号1','护理姓名1'),(112,'2022-03-10 02:39:59','房间号2','床位号2','姓名2','身份证2','手机2','已入住','2022-03-10 10:39:59','护理账号2','护理姓名2'),(113,'2022-03-10 02:39:59','房间号3','床位号3','姓名3','身份证3','手机3','已入住','2022-03-10 10:39:59','护理账号3','护理姓名3'),(114,'2022-03-10 02:39:59','房间号4','床位号4','姓名4','身份证4','手机4','已入住','2022-03-10 10:39:59','护理账号4','护理姓名4'),(115,'2022-03-10 02:39:59','房间号5','床位号5','姓名5','身份证5','手机5','已入住','2022-03-10 10:39:59','护理账号5','护理姓名5'),(116,'2022-03-10 02:39:59','房间号6','床位号6','姓名6','身份证6','手机6','已入住','2022-03-10 10:39:59','护理账号6','护理姓名6');
/*!40000 ALTER TABLE `ruzhudengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shengritixing`
--

DROP TABLE IF EXISTS `shengritixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shengritixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tixingbianhao` varchar(200) DEFAULT NULL COMMENT '提醒编号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `tixingneirong` longtext COMMENT '提醒内容',
  `tixingshijian` datetime DEFAULT NULL COMMENT '提醒时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `tixingbianhao` (`tixingbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1646880141897 DEFAULT CHARSET=utf8 COMMENT='生日提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shengritixing`
--

LOCK TABLES `shengritixing` WRITE;
/*!40000 ALTER TABLE `shengritixing` DISABLE KEYS */;
INSERT INTO `shengritixing` VALUES (151,'2022-03-10 02:39:59','1111111111','姓名1','提醒内容1','2022-03-10 10:39:59'),(152,'2022-03-10 02:39:59','2222222222','姓名2','提醒内容2','2022-03-10 10:39:59'),(153,'2022-03-10 02:39:59','3333333333','姓名3','提醒内容3','2022-03-10 10:39:59'),(154,'2022-03-10 02:39:59','4444444444','姓名4','提醒内容4','2022-03-10 10:39:59'),(155,'2022-03-10 02:39:59','5555555555','姓名5','提醒内容5','2022-03-10 10:39:59'),(156,'2022-03-10 02:39:59','6666666666','姓名6','提醒内容6','2022-03-10 10:39:59'),(1646880141896,'2022-03-10 02:42:21','1646880140003','11','阿萨德','2022-03-10 10:42:20');
/*!40000 ALTER TABLE `shengritixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoufeibiaozhun`
--

DROP TABLE IF EXISTS `shoufeibiaozhun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoufeibiaozhun` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `shoufeijiage` float DEFAULT NULL COMMENT '收费价格',
  `shoufeishuoming` longtext COMMENT '收费说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='收费标准';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoufeibiaozhun`
--

LOCK TABLES `shoufeibiaozhun` WRITE;
/*!40000 ALTER TABLE `shoufeibiaozhun` DISABLE KEYS */;
INSERT INTO `shoufeibiaozhun` VALUES (51,'2022-03-10 02:39:59','名称1',1,'收费说明1'),(52,'2022-03-10 02:39:59','名称2',2,'收费说明2'),(53,'2022-03-10 02:39:59','名称3',3,'收费说明3'),(54,'2022-03-10 02:39:59','名称4',4,'收费说明4'),(55,'2022-03-10 02:39:59','名称5',5,'收费说明5'),(56,'2022-03-10 02:39:59','名称6',6,'收费说明6');
/*!40000 ALTER TABLE `shoufeibiaozhun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoufeirenyuan`
--

DROP TABLE IF EXISTS `shoufeirenyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoufeirenyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shoufeizhanghao` varchar(200) NOT NULL COMMENT '收费账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `shoufeixingming` varchar(200) NOT NULL COMMENT '收费姓名',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `ruzhiriqi` date DEFAULT NULL COMMENT '入职日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shoufeizhanghao` (`shoufeizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='收费人员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoufeirenyuan`
--

LOCK TABLES `shoufeirenyuan` WRITE;
/*!40000 ALTER TABLE `shoufeirenyuan` DISABLE KEYS */;
INSERT INTO `shoufeirenyuan` VALUES (31,'2022-03-10 02:39:59','33','33','收费姓名1',1,'男','13823888881','upload/shoufeirenyuan_zhaopian1.jpg','2022-03-10'),(32,'2022-03-10 02:39:59','收费账号2','123456','收费姓名2',2,'男','13823888882','upload/shoufeirenyuan_zhaopian2.jpg','2022-03-10'),(33,'2022-03-10 02:39:59','收费账号3','123456','收费姓名3',3,'男','13823888883','upload/shoufeirenyuan_zhaopian3.jpg','2022-03-10'),(34,'2022-03-10 02:39:59','收费账号4','123456','收费姓名4',4,'男','13823888884','upload/shoufeirenyuan_zhaopian4.jpg','2022-03-10'),(35,'2022-03-10 02:39:59','收费账号5','123456','收费姓名5',5,'男','13823888885','upload/shoufeirenyuan_zhaopian5.jpg','2022-03-10'),(36,'2022-03-10 02:39:59','收费账号6','123456','收费姓名6',6,'男','13823888886','upload/shoufeirenyuan_zhaopian6.jpg','2022-03-10');
/*!40000 ALTER TABLE `shoufeirenyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','kcn9wbjevfw6nh5riwabmbe7905uldft','2022-03-10 02:41:10','2022-03-10 03:50:47'),(2,11,'11','laoren','老人','b1neqzzs21q9d6qmgri9jptp8bk609wc','2022-03-10 02:41:54','2022-03-10 03:41:55'),(3,21,'22','jiedairenyuan','接待人员','lgdgobd0hb7e3thdf5jdf12kdk25bat3','2022-03-10 02:44:01','2022-03-10 03:44:01'),(4,22,'接待账号2','jiedairenyuan','接待人员','xti9c7z3950265c7ble5bdlo3tvtkxeh','2022-03-10 02:44:40','2022-03-10 03:45:43'),(5,32,'收费账号2','shoufeirenyuan','收费人员','xyxggy1d6a57afbzh77ipcy95s4cpwcc','2022-03-10 02:48:01','2022-03-10 03:48:02');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tuifangdengji`
--

DROP TABLE IF EXISTS `tuifangdengji`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tuifangdengji` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fangjianhao` varchar(200) DEFAULT NULL COMMENT '房间号',
  `chuangweihao` varchar(200) DEFAULT NULL COMMENT '床位号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `kefangzhuangtai` varchar(200) DEFAULT NULL COMMENT '客房状态',
  `tuifangshijian` datetime DEFAULT NULL COMMENT '退房时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COMMENT='退房登记';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tuifangdengji`
--

LOCK TABLES `tuifangdengji` WRITE;
/*!40000 ALTER TABLE `tuifangdengji` DISABLE KEYS */;
INSERT INTO `tuifangdengji` VALUES (171,'2022-03-10 02:39:59','房间号1','床位号1','姓名1','身份证1','手机1','已退房','2022-03-10 10:39:59'),(172,'2022-03-10 02:39:59','房间号2','床位号2','姓名2','身份证2','手机2','已退房','2022-03-10 10:39:59'),(173,'2022-03-10 02:39:59','房间号3','床位号3','姓名3','身份证3','手机3','已退房','2022-03-10 10:39:59'),(174,'2022-03-10 02:39:59','房间号4','床位号4','姓名4','身份证4','手机4','已退房','2022-03-10 10:39:59'),(175,'2022-03-10 02:39:59','房间号5','床位号5','姓名5','身份证5','手机5','已退房','2022-03-10 10:39:59'),(176,'2022-03-10 02:39:59','房间号6','床位号6','姓名6','身份证6','手机6','已退房','2022-03-10 10:39:59');
/*!40000 ALTER TABLE `tuifangdengji` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-03-10 02:40:00');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-10 11:12:45

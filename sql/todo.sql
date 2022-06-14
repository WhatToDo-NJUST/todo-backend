/*
Navicat MySQL Data Transfer

Source Server         : localmysql
Source Server Version : 50017
Source Host           : localhost:3306
Source Database       : todo

Target Server Type    : MYSQL
Target Server Version : 50017
File Encoding         : 65001

Date: 2022-06-14 22:51:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for todo_user
-- ----------------------------
DROP TABLE IF EXISTS `todo_user`;
CREATE TABLE `todo_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) default NULL,
  `phone` varchar(255) default NULL,
  `password` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of todo_user
-- ----------------------------

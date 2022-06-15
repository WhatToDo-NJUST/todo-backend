/*
Navicat MySQL Data Transfer

Source Server         : localmysql
Source Server Version : 50017
Source Host           : localhost:3306
Source Database       : todo

Target Server Type    : MYSQL
Target Server Version : 50017
File Encoding         : 65001

Date: 2022-06-15 20:54:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for todo_todo
-- ----------------------------
DROP TABLE IF EXISTS `todo_todo`;
CREATE TABLE `todo_todo` (
  `id` varchar(255) NOT NULL,
  `userId` varchar(255) default NULL,
  `title` varchar(255) default NULL,
  `priority` varchar(255) default NULL,
  `description` varchar(255) default NULL,
  `isDone` tinyint(255) default NULL,
  `registerTime` datetime default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of todo_todo
-- ----------------------------

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

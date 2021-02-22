/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3306
 Source Schema         : ds1

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 22/02/2021 19:11:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for active_user0
-- ----------------------------
DROP TABLE IF EXISTS `active_user0`;
CREATE TABLE `active_user0`  (
  `last_login_time` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `province` int(16) NOT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for active_user1
-- ----------------------------
DROP TABLE IF EXISTS `active_user1`;
CREATE TABLE `active_user1`  (
  `last_login_time` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `province` int(16) NOT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for active_user2
-- ----------------------------
DROP TABLE IF EXISTS `active_user2`;
CREATE TABLE `active_user2`  (
  `last_login_time` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int(20) NOT NULL,
  `province` int(16) NOT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for active_user3
-- ----------------------------
DROP TABLE IF EXISTS `active_user3`;
CREATE TABLE `active_user3`  (
  `last_login_time` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL,
  `province` int(16) NOT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user0
-- ----------------------------
DROP TABLE IF EXISTS `user0`;
CREATE TABLE `user0`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `province` int(16) DEFAULT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `province` int(16) DEFAULT NULL COMMENT '省份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 570678234480513026 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

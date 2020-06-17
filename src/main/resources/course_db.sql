/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : course_db

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 17/06/2020 21:46:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course_1
-- ----------------------------
DROP TABLE IF EXISTS `course_1`;
CREATE TABLE `course_1`  (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_1
-- ----------------------------
INSERT INTO `course_1` VALUES (480124807547977728, 'java1', 100, 'Normal1');
INSERT INTO `course_1` VALUES (480124807577337856, 'java3', 100, 'Normal3');
INSERT INTO `course_1` VALUES (480124807615086592, 'java5', 100, 'Normal5');
INSERT INTO `course_1` VALUES (480124807648641024, 'java7', 100, 'Normal7');
INSERT INTO `course_1` VALUES (480124807673806848, 'java9', 100, 'Normal9');

-- ----------------------------
-- Table structure for course_2
-- ----------------------------
DROP TABLE IF EXISTS `course_2`;
CREATE TABLE `course_2`  (
  `cid` bigint(20) NOT NULL,
  `cname` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `cstatus` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course_2
-- ----------------------------
INSERT INTO `course_2` VALUES (480124807065632769, 'java0', 100, 'Normal0');
INSERT INTO `course_2` VALUES (480124807560560641, 'java2', 100, 'Normal2');
INSERT INTO `course_2` VALUES (480124807594115073, 'java4', 100, 'Normal4');
INSERT INTO `course_2` VALUES (480124807631863809, 'java6', 100, 'Normal6');
INSERT INTO `course_2` VALUES (480124807661223937, 'java8', 100, 'Normal8');

SET FOREIGN_KEY_CHECKS = 1;

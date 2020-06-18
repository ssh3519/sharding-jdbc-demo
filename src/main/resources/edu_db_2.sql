/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : edu_db_2

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 18/06/2020 23:07:03
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
INSERT INTO `course_1` VALUES (480137797529763840, 'java1', 1, 'Normal1');
INSERT INTO `course_1` VALUES (480137797559123968, 'java3', 3, 'Normal3');
INSERT INTO `course_1` VALUES (480137797592678400, 'java5', 5, 'Normal5');
INSERT INTO `course_1` VALUES (480137797622038528, 'java7', 7, 'Normal7');
INSERT INTO `course_1` VALUES (480137797651398656, 'java9', 9, 'Normal9');

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

-- ----------------------------
-- Table structure for t_udict
-- ----------------------------
DROP TABLE IF EXISTS `t_udict`;
CREATE TABLE `t_udict`  (
  `dictid` bigint(20) NOT NULL,
  `ustatus` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `uvalue` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  PRIMARY KEY (`dictid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_udict
-- ----------------------------
INSERT INTO `t_udict` VALUES (480512928299089921, 'a', '已启用');

SET FOREIGN_KEY_CHECKS = 1;

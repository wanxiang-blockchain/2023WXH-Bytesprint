CREATE DATABASE `bytesprint` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

use bytesprint;

-- bytesprint.bytesprint_attachment definition

CREATE TABLE `bytesprint_attachment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `project_id` bigint NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `path` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bytesprint_attachment_project_id_IDX` (`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_company definition

CREATE TABLE `bytesprint_company` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_developer definition

CREATE TABLE `bytesprint_developer` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_plan definition

CREATE TABLE `bytesprint_plan` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `uid` varchar(100) NOT NULL,
  `requirement_id` bigint NOT NULL,
  `requirement_time` int DEFAULT NULL,
  `requirement_status` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `expected_finish_time` datetime DEFAULT NULL,
  `actual_finish_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bytesprint_plan_project_id_IDX` (`requirement_id`) USING BTREE,
  KEY `bytesprint_plan_uid_IDX` (`uid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_project definition

CREATE TABLE `bytesprint_project` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `no` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `description` text,
  `contact_name` varchar(100) DEFAULT NULL,
  `contact_phone` varchar(100) DEFAULT NULL,
  `contact_email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `company_code` varchar(100) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `join_member_count` int DEFAULT NULL,
  `max_join_member_count` int DEFAULT NULL,
  `category_Id` bigint DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_project_category definition

CREATE TABLE `bytesprint_project_category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_requirement definition

CREATE TABLE `bytesprint_requirement` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `project_id` bigint NOT NULL,
  `name` varchar(300) DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`id`),
  KEY `bytesprint_requirement_project_id_IDX` (`project_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- bytesprint.bytesprint_user definition

CREATE TABLE `bytesprint_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` varchar(100) NOT NULL,
  `user_type` char(1) DEFAULT NULL COMMENT '1=运营商，2=开发人员',
  `wallet_address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `bytesprint_user_user_id_IDX` (`user_id`) USING BTREE,
  KEY `bytesprint_user_wallet_address_IDX` (`wallet_address`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
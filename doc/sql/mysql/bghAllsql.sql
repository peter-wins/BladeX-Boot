/*
 Navicat Premium Data Transfer

 Source Server         : mysql_localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : bladex_flow

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 01/08/2019 11:09:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ACT_APP_APPDEF
-- ----------------------------
DROP TABLE IF EXISTS `bgh_listings`;
CREATE TABLE `bgh_listings` (
                                `id` bigint(64) NOT NULL COMMENT '主键id',
                                `customer_id` bigint(64) DEFAULT NULL COMMENT '客户id',
                                `listing_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房源名字',
                                `broker_name` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '经纪人名字',
                                `listing_type` int(2) DEFAULT '0' COMMENT '1：毛坯房，2：正常房',
                                `area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '默认 Dubai',
                                `property_remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '物业情况备注',
                                `image_url` varchar(124) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '上传图片URL',
                                `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                `status` int(2) NOT NULL DEFAULT '0' COMMENT '1：海量房源,2:签单房源,3设计中,4已上线',
                                `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='房源信息表';



DROP TABLE IF EXISTS `bgh_customer`;
CREATE TABLE `bgh_customer` (
                                `id` bigint(64) NOT NULL COMMENT '主键id',
                                `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
                                `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
                                `nickname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '昵称',
                                `customer_phone` bigint(32) NOT NULL COMMENT '客户电话',
                                `customer_type` int(2) DEFAULT NULL COMMENT '(客户类型)1：房东,2:租户',
                                `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '租户邮箱',
                                `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '租户地址',
                                `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                `status` int(2) NOT NULL DEFAULT '0' COMMENT '(预约状态)1：已预订,2:未预订',
                                `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='客户信息表';


DROP TABLE IF EXISTS `bgh_tenantpool`;
CREATE TABLE `bgh_tenantpool` (
                                  `id` bigint(64) NOT NULL COMMENT '主键id',
                                  `blade_user_id` bigint(64) NOT NULL COMMENT '员工表id',
                                  `tenantname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '租客姓名',
                                  `tenant_phone` bigint(32) NOT NULL COMMENT '租客电话',
                                  `tenant_country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '租户国籍',
                                  `rental_location` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '意向租房位置',
                                  `demand_type` int(2) DEFAULT NULL COMMENT '(需求户型)1：整租一室,2:整租二室',
                                  `tenant_type` int(2) DEFAULT NULL COMMENT '(租户类型)1：租客, 2:业主',
                                  `price_range` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '可接受价格范围',
                                  `stay_period` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '入住周期',
                                  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                  `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                  `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                  `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                  `status` int(2) NOT NULL DEFAULT '0' COMMENT '(租客状态状态)1：私客,2:公客',
                                  `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='租客池表';


DROP TABLE IF EXISTS `bgh_online_appointment`;
CREATE TABLE `bgh_online_appointment` (
                                          `id` bigint(64) NOT NULL COMMENT '主键id',
                                          `tenantpool_id` bigint(64) DEFAULT NULL COMMENT '租客池id',
                                          `tenantname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '租客预约姓名',
                                          `tenant_phone` bigint(32) NOT NULL COMMENT '租客预约电话',
                                          `rental_location` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '预约租房位置',
                                          `reservation_time` datetime DEFAULT NULL COMMENT '预约看房时间',
                                          `process_result` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '处理结果',
                                          `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                          `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                          `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                          `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                          `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                          `status` int(2) NOT NULL DEFAULT '0' COMMENT '(租客状态状态)1：私客,2:公客',
                                          `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                          PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='租客池线上预约表';



DROP TABLE IF EXISTS `bgh_ownerpool`;
CREATE TABLE `bgh_ownerpool` (
                                 `id` bigint(64) NOT NULL COMMENT '主键id',
                                 `blade_user_id` bigint(64) NOT NULL COMMENT '员工表id',
                                 `owner_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '业主姓名',
                                 `owner_phone` bigint(32) NOT NULL COMMENT '业主电话',
                                 `owner_country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '业主国籍',
                                 `owner_type` int(2) DEFAULT NULL COMMENT '(业主类型)1：公盘, 2:私盘',
                                 `price_range` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '可接受价格范围',
                                 `stay_period` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '入住周期',
                                 `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                 `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                 `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                 `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                 `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                 `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                 `status` int(2) NOT NULL DEFAULT '0' COMMENT '(租客状态状态)1：私客,2:公客',
                                 `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                 PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='业主池表';


DROP TABLE IF EXISTS `bgh_listings_management`;
CREATE TABLE `bgh_listings_management` (
                                           `id` bigint(64) NOT NULL COMMENT '主键id',
                                           `customer_id` bigint(64) DEFAULT NULL COMMENT '客户id',
                                           `listings_type` int(2) DEFAULT NULL COMMENT '(房源类型)1：整租, 2:独栋',
                                           `vacant_listings` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '空置房源',
                                           `rented_listings` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '已租房源',
                                           `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                           `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                           `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                           `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                           `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                           `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                           `status` int(2) NOT NULL DEFAULT '0' COMMENT '(房源状态)1：锁房,2:关闭',
                                           `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                           PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='房源管理表';


DROP TABLE IF EXISTS `bgh_listings_details`;
CREATE TABLE `bgh_listings_details` (
                                        `id` bigint(64) NOT NULL COMMENT '主键id',
                                        `listings_management_id` bigint(64) DEFAULT NULL COMMENT '房源管理id',
                                        `rent_price` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '出租价格',
                                        `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '小区地址',
                                        `rent_area` bigint(20) DEFAULT NULL COMMENT '出租面积',
                                        `viewing time` datetime DEFAULT NULL COMMENT '看房时间',
                                        `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
                                        `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                        `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                        `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                        `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                        `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                        `status` int(2) NOT NULL DEFAULT '0' COMMENT '(当前状态)1：空置,2:配置,3锁房',
                                        `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                        PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='房源详情表';


DROP TABLE IF EXISTS `bgh_approval_management`;
CREATE TABLE `bgh_approval_management` (
                                           `id` bigint(64) NOT NULL COMMENT '主键id',
                                           `approval_type` int(2) DEFAULT NULL COMMENT '(审批类型)1：财务流水',
                                           `approval_classification` int(4) DEFAULT NULL COMMENT '(审批分类)1：待我审批,2:我已审批,3:我发起的,4:抄送我的',
                                           `approval_title` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '审批标题',
                                           `approval_context` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '审批内容',
                                           `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                           `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                           `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                           `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                           `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                           `status` int(2) NOT NULL DEFAULT '0' COMMENT '(审批状态)1：审批中,2:审批通过,3:审批驳回,4:已撤销',
                                           `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                           PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='审批管理表';


DROP TABLE IF EXISTS `bgh_finance_management`;
CREATE TABLE `bgh_finance_management` (
                                          `id` bigint(64) NOT NULL COMMENT '主键id',
                                          `listings_management_id` bigint(64) DEFAULT NULL COMMENT '房源管理id',
                                          `amount` bigint(20) DEFAULT NULL COMMENT '审批金额 单位:元）',
                                          `receive payment_type` int(2) DEFAULT NULL COMMENT '(收款类型)1：现金,2:支付宝,3:POS机刷卡,4:微信',
                                          `actual_pay_time` datetime DEFAULT NULL COMMENT '实际支付时间',
                                          `order_resource` int(4) DEFAULT NULL COMMENT '(订单来源)1：租约,2:退款',
                                          `order_status` int(4) DEFAULT NULL COMMENT '(订单状态)1：正常,2:已作废',
                                          `finance_classification` int(4) DEFAULT NULL COMMENT '(财务分类)1：账单管理,2:账单流水',
                                          `cost_summary` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '费用摘要',
                                          `confirmor` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '确认人',
                                          `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                          `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                          `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                          `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                          `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                          `status` int(2) NOT NULL DEFAULT '0' COMMENT '(财务状态)1：已结算,2:待收',
                                          `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                          PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='财务管理表';


DROP TABLE IF EXISTS `bgh_after_service`;
CREATE TABLE `bgh_after_service` (
                                     `id` bigint(64) NOT NULL COMMENT '主键id',
                                     `customer_id` bigint(64) DEFAULT NULL COMMENT '客户id',
                                     `listings_management_id` bigint(64) DEFAULT NULL COMMENT '房源管理id',
                                     `repair_address` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '报修地址',
                                     `expect_doortodoor_time` datetime DEFAULT NULL COMMENT '期望上门时间',
                                     `service_object_type` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '维修物件类型',
                                     `service_classification` int(4) DEFAULT NULL COMMENT '(售后服务分类)1：维修,2:保洁',
                                     `describer` varchar(124) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '故障描述',
                                     `declare_time` datetime DEFAULT NULL COMMENT '申报时间',
                                     `create_user` bigint(64) DEFAULT NULL COMMENT '创建人',
                                     `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                                     `update_user` bigint(64) DEFAULT NULL COMMENT '修改人',
                                     `update_time` datetime DEFAULT NULL COMMENT '修改时间',
                                     `create_dept` bigint(64) DEFAULT NULL COMMENT '创建部门',
                                     `status` int(2) NOT NULL DEFAULT '0' COMMENT '(租后服务状态)1：待处理,2:处理中，3：待验收,4:已完成,5:已取消',
                                     `is_deleted` int(2) DEFAULT '0' COMMENT '是否已删除',
                                     PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci ROW_FORMAT=COMPACT COMMENT='租后服务表';


SET FOREIGN_KEY_CHECKS = 1;

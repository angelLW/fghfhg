SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS base_data;
DROP TABLE IF EXISTS base_data_summary;
DROP TABLE IF EXISTS base_dim_area;
DROP TABLE IF EXISTS base_dim_datatype;
DROP TABLE IF EXISTS base_dim_datetype;
DROP TABLE IF EXISTS base_dim_index;
DROP TABLE IF EXISTS base_dim_industry;
DROP TABLE IF EXISTS base_dim_source;
DROP TABLE IF EXISTS base_item;
DROP TABLE IF EXISTS base_theme;
DROP TABLE IF EXISTS base_theme_mapping;
DROP TABLE IF EXISTS data_dim_unit;




/* Create Tables */

CREATE TABLE base_data
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	ITEM_ID int unsigned,
	STAT_DATE varchar(24) NOT NULL,
	VALUE double(30,9),
	LAST_UPDATE_TIME datetime,
	REMARK varchar(512),
	PRIMARY KEY (ID),
	UNIQUE (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_data_summary
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	ITEM_ID int unsigned,
	LAST_DATE varchar(64),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_area
(
	ID mediumint unsigned NOT NULL AUTO_INCREMENT,
	PARENT_ID mediumint unsigned,
	LEVEL tinyint unsigned,
	AREA_CODE bigint unsigned,
	ZIP_CODE mediumint unsigned,
	CITY_CODE char(6),
	NAME varchar(50),
	SHORT_NAME varchar(50),
	MERGER_NAME varchar(50),
	PINYIN varchar(30),
	LNG decimal(10,6),
	LAT decimal(10,6),
	PRIMARY KEY (ID),
	UNIQUE (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_datatype
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	DATATYPE_ID int unsigned,
	DATATYPE_NAME varbinary(64),
	DATATYPE_CODE varchar(64),
	DATATYPE_SHORTNAME varchar(64),
	REMARKS varchar(256),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_datetype
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	DATETYPE_ID int unsigned,
	DATETYPE_NAME varchar(64),
	DATETYPE_CODE varchar(64),
	DATETYPE_SHORTNAME varchar(64),
	REMARKS varchar(256),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_index
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	INDEX_ID int unsigned,
	INDEX_NAME varchar(64),
	INDEX_CODE varchar(64),
	INDEX_SHORT_NAME varchar(64),
	REMARKS varchar(256),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_industry
(
	ID int unsigned NOT NULL,
	INDUS_ID bigint unsigned,
	INDUS_NAME varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci,
	INDUS_CODE varchar(64),
	INDUS_SHORTNAME varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci,
	REMARK varchar(256),
	PRIMARY KEY (ID),
	UNIQUE (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_dim_source
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	SOURCE_ID int unsigned NOT NULL,
	SOURCE_NAME varchar(64),
	SOURCE_CODE varchar(64),
	REMARK varchar(256),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_item
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	ITEM_ID int unsigned NOT NULL,
	ITEM_NAME varchar(64),
	ITEM_CODE varchar(64),
	INDUS_ID int unsigned,
	INDEX_ID int unsigned,
	DATATYPE_ID int,
	-- 1-年，2-季，3-月，4-日，5-旬，6-周
	DATETYPE_ID int COMMENT '1-年，2-季，3-月，4-日，5-旬，6-周',
	SOURCE_ID int unsigned,
	UNIT_ID int unsigned,
	AREA_CODE bigint unsigned,
	LAST_UPDATE_TIME datetime,
	IS_VALID tinyint unsigned,
	REMARK varchar(512),
	PRIMARY KEY (ID),
	UNIQUE (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_theme
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	THEME_ID int unsigned NOT NULL,
	THEME_NAME varchar(64),
	THEME_CODE varchar(64),
	REMARK varchar(64),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE base_theme_mapping
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	THEME_ID int unsigned,
	ITEM_ID int unsigned,
	PARENT_ID int unsigned,
	NODENAME varchar(64),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE data_dim_unit
(
	ID int unsigned NOT NULL AUTO_INCREMENT,
	UNIT_ID int,
	UNIT_NAME varchar(64),
	UNIT_CODE varchar(64),
	REMARK varchar(256),
	PRIMARY KEY (ID)
) DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;




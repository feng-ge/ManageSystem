#USE world;

#SHOW DATABASES;

#CREATE DATABASE system_database;

#DROP DATABASE cdatabase;

#DESC city;

#SELECT * FROM city;

#SELECT id AS 编码 ,NAME AS 名称 FROM city;

#SELECT DISTINCT CountryCode AS 国家编码 FROM city;

#SELECT CONCAT(id,NAME) AS 国家信息 FROM city;

#SELECT CONCAT(GNP,'+',IFNULL(GNPold,0)) AS nima FROM country;

#SELECT NAME,Population AS 人数 FROM country WHERE population >= 100000000;

#SELECT NAME,Population AS 人数 FROM country WHERE population >= 100000000 AND population <= 1000000000;

#SELECT NAME ,population AS 人数 FROM country WHERE NOT(population <= 100000000 OR population >= 1000000000); 

#SELECT NAME ,population AS 人数 FROM country WHERE NAME LIKE '%c%'; 

#SELECT NAME ,population AS 人数 FROM country WHERE NAME LIKE 'c%';

#SELECT NAME ,population AS 人数 FROM country WHERE NAME LIKE '_h%';

#SELECT NAME ,population AS 人数 FROM country WHERE NAME LIKE '_\_%';
#转义字符\将下划线等关键字转换为字符

#SELECT NAME AS 国家 FROM country WHERE NAME LIKE '_$_%' ESCAPE '$';
#表明转义字符为$

#SELECT NAME ,population AS 人数 FROM country WHERE population BETWEEN 100000000 AND 1000000000;

#SELECT NAME ,population AS 人数 FROM country WHERE population IN('126714000','212107000');

#SELECT NAME ,population AS 人数,GNPold FROM country WHERE GNPold IS NULL;

#SELECT NAME ,population AS 人数,GNPold FROM country WHERE GNPold IS NOT NULL;
 
#SELECT NAME ,population AS 人数 FROM country ORDER BY population ASC;

#SELECT NAME ,population AS 人数 FROM country ORDER BY population DESC;

#SELECT NAME ,population AS 人数 FROM country WHERE population >=100000000 ORDER BY population ASC;

#SELECT NAME ,population AS 人数 FROM country WHERE population >=100000000 ORDER BY 人数 ASC;

#SELECT NAME  AS 国家 FROM country  ORDER BY LENGTH(NAME) ASC;

#SELECT UPPER (NAME) 国家 FROM country ;

#SELECT LOWER (NAME) 国家 FROM country ;

#select country.* from country as country inner join (select max(population) as population from country GROUP BY continent) as 最大人数 on country.population=最大人数.population;

#select count(*),continent from country group by continent having count(*)>30;
CREATE DATABASE manager_system_database;
USE manager_system_database;
CREATE TABLE USER
(
	id INT(20) NOT NULL PRIMARY KEY,#用户ID
	username VARCHAR(30) NOT NULL,#账号
	PASSWORD VARCHAR(30) NOT NULL,#密码
	email VARCHAR(30) NOT NULL,#邮箱
	TYPE INT(10) NOT NULL #权限
);
CREATE TABLE USER_info
(
	id INT(20) NOT NULL ,#用户ID
	nickname VARCHAR(30) NOT NULL,#昵称
	phone INT(30) ,#电话
	sex VARCHAR(10),#性别
	education VARCHAR(30) ,#学历
	introduce VARCHAR(384)  #简历
);
CREATE TABLE essay
(
	eid INT(20) NOT NULL ,#稿件ID
	ename VARCHAR(150) NOT NULL,#稿件名称
	eclass VARCHAR(30) NOT NULL,#稿件类型
	ctime DATETIME NOT NULL,#投稿时间
	modified DATETIME NOT NULL,#评分时间
	e_score INT(10) NOT NULL,#分数
	publish DATETIME NOT NULL,#发表时间
	writer VARCHAR(60) NOT NULL#作者
);
CREATE TABLE classify
(
	cid INT(10) NOT NULL,#分类编号
	cname VARCHAR(30) NOT NULL #分类名称
);
CREATE TABLE reply 
(
	rid INT(10),#回复id
	repuser_id INT(10),#回复者ID
	topic_id INT(10),#主题id
	user_id INT(10),#被回复者id
	create_time DATETIME,#回复时间
	update_time DATETIME#修改时间 
);
CREATE TABLE pro
(
	id INT(10),#专家id
	last_check_time DATETIME#上次审稿时间
);







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
/*--------------------------------------------------------------------------*/
DROP DATABASE IF EXISTS manager_system_database;
CREATE DATABASE manager_system_database CHARACTER SET utf8;
USE manager_system_database;
CREATE TABLE t_user (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  #用户ID 外键
  username VARCHAR(20) NOT NULL,
  #账号
  PASSWORD VARCHAR(20) NOT NULL,
  #密码
  email VARCHAR(30) NOT NULL,
  #邮箱
  p_type INT NOT NULL DEFAULT 1,
  #权限
  c_time TIMESTAMP #上一次审稿时间
);
#drop table user_info;
CREATE TABLE user_info (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  #用户ID 外键
  nickname VARCHAR(30) NOT NULL,
  #昵称
  phone INT,
  #电话
  sex VARCHAR(10),
  #性别
  education VARCHAR(30),
  #学历
  introduce VARCHAR(384),
  #简历
  CONSTRAINT fk_userinfo_user FOREIGN KEY(id) REFERENCES t_user(id)
);
CREATE TABLE essay (
  eid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  #稿件ID 外键
  ename VARCHAR(150) NOT NULL,
  #稿件名称
  eclass_id INT NOT NULL,
  #稿件ID类型
  c_time DATETIME NOT NULL,
  #投稿时间
  modified DATETIME NOT NULL,
  #修改时间
  e_score INT NOT NULL,
  #分数
  publish DATETIME NOT NULL,
  #发表时间
  writer_id INT NOT NULL,
  #作者id 外键
  FOREIGN KEY(writer_id) REFERENCES t_user(id)
);
CREATE TABLE classify (
  cid INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  #分类编号 外键
  cname VARCHAR(30) NOT NULL,
  #分类名称
  c_num INT DEFAULT 0 #分类书数量
);
CREATE TABLE reply (
  rid INT PRIMARY KEY AUTO_INCREMENT,
  #回复id
  e_id INT,
  #被回复稿件的ID 外键
  pro_id INT,
  #回复者ID 外键
  user_id INT,
  #被回复者id 外键
  create_time TIMESTAMP,
  #回复时间
  update_time TIMESTAMP,
  #留言修改时间
  FOREIGN KEY(e_id) REFERENCES essay(eid),
  FOREIGN KEY(user_id) REFERENCES t_user(id)
);
CREATE TABLE POWER (
  p_id INT NOT NULL PRIMARY KEY,
  #权限编号 外键
  p_name VARCHAR(30) NOT NULL,
  #权限名称
  p_num INT #该权限人数
);

#查询账号和密码
#select username,PASSWORD from t_user WHERE username=;


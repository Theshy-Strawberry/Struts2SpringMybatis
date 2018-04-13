
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment COMMENT 'pre',
  `name` varchar(100) default NULL COMMENT '姓名',
  `age` int(11) default NULL COMMENT '年龄',
  `jointime` timestamp NULL default CURRENT_TIMESTAMP COMMENT '入职时间',
  `bikou` varchar(100) default NULL COMMENT '备注',
  PRIMARY KEY  ( `id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

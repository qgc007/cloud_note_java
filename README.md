# cloud_note_java
#DDL

CREATE TABLE `tb_user` (
  `u_id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `u_mail` varchar(50) NOT NULL COMMENT '登录邮箱',
  `u_name` varchar(30) NOT NULL COMMENT '用户名',
  `u_pwd` varchar(100) NOT NULL COMMENT '密码',
  `u_level` char(1) NOT NULL COMMENT '级别',
  `u_gendar` char(1) DEFAULT NULL COMMENT '性别',
  `u_address` varchar(50) DEFAULT NULL COMMENT '地址',
  `u_phone` varchar(20) DEFAULT NULL COMMENT '电话',
  `u_avatar` varchar(250) DEFAULT NULL COMMENT '头像',
  `u_create_time` datetime DEFAULT NULL COMMENT '登录时间',
  `u_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `u_del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_mail` (`u_mail`),
  UNIQUE KEY `u_mail_2` (`u_mail`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci


CREATE TABLE `tb_user_blog` (
  `b_id` varchar(50) NOT NULL COMMENT 'blog id',
  `u_id` int unsigned NOT NULL COMMENT 'user id',
  `b_title` varchar(50) NOT NULL COMMENT 'blog 标题',
  `b_text_link` varchar(50) NOT NULL COMMENT 'blog 内容链接',
  `b_rec_level` varchar(1) DEFAULT NULL COMMENT '推荐级别',
  `b_like_num` int DEFAULT '0' COMMENT '被点赞数',
  `b_rec_admin` tinyint(1) DEFAULT NULL COMMENT '管理员推荐',
  `b_del_flag` char(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `b_create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `b_update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`u_id`,`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户博客'

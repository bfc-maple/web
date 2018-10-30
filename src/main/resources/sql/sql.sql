CREATE TABLE tab_user(
  id int(8) PRIMARY KEY AUTO_INCREMENT NOT NULL ,
  name VARCHAR(32) NOT NULL comment '姓名',
  gender int(1) NOT NULL default 1  comment '1:男,0:女',,
  user_name VARCHAR(32) NOT NULL ,
  password VARCHAR(64) NOT NULL ,
  phone VARCHAR(16) ,
  email VARCHAR(32) ,
  address VARCHAR(256) ,
  create_time datetime ,
  update_time datetime ,
  login_time datetime ,
  last_login_time datetime ,
  online INT(1) DEFAULT 0 NOT null comment'0:不在线,1:在线',
  count int NOT null DEFAULT 0 comment '登录次数',
  del int(1) DEFAULT 0 NOT NULL  comment '0:有效,1无效'
);

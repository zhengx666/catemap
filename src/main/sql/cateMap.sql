CREATE DATABASE catemap;
use catemap;

CREATE TABLE restaurant(
restaurant_id bigint NOT NULL  AUTO_INCREMENT COMMENT '饭店id',
restaurant_name varchar(120) NOT NULL COMMENT '饭店名称',
user_name varchar(120) NOT NULL COMMENT '昵称',
latitude DOUBLE NOT NULL COMMENT '维度',
longitude DOUBLE NOT NULL COMMENT '经度',
recommended_stars int NOT NULL COMMENT '推荐星级',
recommended_reason TEXT NOT NULL COMMENT '推荐理由',
create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间',
PRIMARY KEY (restaurant_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='饭店信息表';

INSERT INTO restaurant(restaurant_name,user_name,latitude,longitude,recommended_stars,recommended_reason)
VALUE
  ('测试用例1','用户1',39.868635,116.341781,4,'推荐'),
  ('测试用例2','用户2',39.820133,116.460571,4,'推荐'),
  ('测试用例3','用户3',39.842806,116.508636,4,'推荐'),
  ('测试用例4','用户4',39.919736,116.301269,4,'推荐');


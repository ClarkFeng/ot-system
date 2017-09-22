package demo.sql;

public class Demomemo {
/**
 * 
 * CREATE TABLE `t_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `rolename` varchar(20) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `role_id` int(11) DEFAULT NULL COMMENT '外键关联role表',
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `t_user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8

CREATE TABLE `t_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `permissionname` varchar(50) NOT NULL COMMENT '权限名',
  `role_id` int(11) DEFAULT NULL COMMENT '外键关联role',
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `t_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8

t_permission

1	user:*	1
2	student:*	2


t_user
1	admin
2	teacher
3	student

t_role
1	csdn1	123	1
2	csdn2	123	2
3	csdn3	123	3

test:
根据spring的配置文件中对shiro的url拦截配置，我们首先请求：http://localhost:8080/ShiroSpring/user/admin.do来测试身份认证，然后会跳转到登录页面让我们登陆，登陆成功后，再次请求这个url就会进入success.jsp页面了。 
　　再测试角色和权限认证，可以先后输入http://localhost:8080/ShiroSpring/user/student.do来测试角色认证，输入http://localhost:8080/ShiroSpring/user/teacher.do来测试权限认证。通过登陆不同的用户去测试即可

 * 
 */
}

# ByteSprint

## 模块划分
- bytesprint-web 项目的入口、接口定义
  - bytesprint-application 应用层，用于聚合领域层、基础设施层
    - bytesprint-domain 领域层，实现核心业务逻辑
    - bytesprint-infrastructure 基础设施层，实现与外部系统的交互
    - bytesprint-presentation 表现层，实现与用户的交互
  - bytesprint-log 日志模块

## 技术栈

| 技术栈          | 资源                                             |
|--------------|------------------------------------------------|
| Spring boot  | https://spring.io/projects/spring-boot         |
| mybatis      | http://www.mybatis.org/mybatis-3/zh/index.html |
| mybatis-plus | http://mp.baomidou.com/                        |

## 发布

发布过程

1. 本地打包
   - 测试环境： mvn clean package -Dmaven.test.skip=true -P test
   - 生产环境： mvn clean package -Dmaven.test.skip=true -P prod

## 问题
1. 启动报错：Failed to create parent directories for [/opt/log/bytesprint.xxx.log]
> 修改文件权限，执行命令下面命令
> ```
> sudo chmod -R 777 /opt/log
> ```
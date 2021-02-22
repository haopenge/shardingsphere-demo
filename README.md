# shardingsphere-demo 项目

主要包括一下内容：

- 分库分表
- 主从配置
- 主键生成

> 因ShardingSphere 不同版本差别较大，现注明版本：4.0.0-RC1


# 运行描述

## 环境配置
mysql环境：

docker 一键安装命令：`docker run -p 3306:3306 --name mysql-5.7 -e MYSQL_ROOT_PASSWORD=123456 -d mysql:5.7`

## 分库分表测试

### 1. application.properties 中启动 相应profile

```java
    spring.profiles.active=sharding-db-table
```
### 启动 ShardingDataBasesTest测试类


## 传统主从配置测试

### 1.application.properties 中启动 相应profile 

```java
    spring.profiles.active=master-slave
```

### 2. MaterSlaveTest 启动相应测试类测试

## 分库分表+主从配置

// TODO：待补充


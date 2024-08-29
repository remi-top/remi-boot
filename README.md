<h1 align="center" style="margin: 30px 0 30px; font-weight: bold;">Remi Boot</h1>

## 平台简介

Remi Boot (瑞米) 是一款企业级单体架构的开发平台，是采用领域驱动模型(DDD)设计思想的、遵循SpringBoot 编程思想，高度模块化和可配置化。

## 项目文档

https://remi.yuque.com/r/organizations/homepage

## 体验地址

https://remi.run

RemiAdmin/123456

## 项目源码

### Gitee

https://gitee.com/remi-top

### GitTok

https://gittok.com/remi-top

### Gitlab

https://gitlab.com/remi-top

### Github

https://github.com/remi-top

## 系统模块

~~~
remi-boot     
├── docker                                        // 容器部署
├── docs                                          // 说明文档
│   └── drawio                                    // 流程图设计
│   └── pdman                                     // 数据库设计
│   └── sqls                                      // 数据库脚本
│   └── envs                                      // 多环境配置
├── remi-boot-api                                  // 服务间门面接口模块
├── remi-boot-app                                  // H5、小程序、App等C端门面接口模块 [18082]
├── startdis-comm                                 // 通用模块(领域模型、异常模块、工具类等)
├── remi-boot-domain                               // 领域实体模块，包含实体、值对象、聚合、事件等
├── remi-boot-infra                                // 领域基础设施模块，包含持久化
├── startdis-gen                                  // 基础数据代码生成模块
├── remi-boot-job                                  // 分布式任务实现模块
├── remi-boot-server                               // 业务服务实现模块
├── remi-boot-web                                  // B端门户接口模块 [18081]
├── pom.xml                                       // 公共依赖
~~~


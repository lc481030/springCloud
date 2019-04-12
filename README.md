 <p align="center">
  <img src="https://img.shields.io/badge/Avue-1.5.0-green.svg" alt="Build Status">
   <img src="https://img.shields.io/badge/Spring%20Cloud-Greenwich.RELEASE-blue.svg" alt="Coverage Status">
   <img src="https://img.shields.io/badge/Spring%20Boot-2.1.3.RELEASE-blue.svg" alt="Downloads">
 </p>  
 
**夕阳果果信息科技**   
   
- 基于 Spring Cloud Greenwich 、Spring Security OAuth2 的RBAC权限管理系统  
- 基于数据驱动视图的理念封装 Element-ui，即使没有 vue 的使用经验也能快速上手  
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持  
- 提供 lambda 、stream api 、webflux 的生产实践   aaa

#### 核心依赖 


依赖 | 版本
---|---
Spring Boot |  2.1.3.RELEASE  
Spring Cloud | Greenwich.RELEASE   
Spring Security OAuth2 | 2.3.3
Mybatis Plus | 3.1.0
hutool | 4.5.0
Avue | 1.5.0
   


#### 模块说明
```lua
xygg
├── xygg-ui -- 前端工程[8080]
├── xygg-auth -- 授权服务提供[3000]
└── xygg-common -- 系统公共模块 
     ├── xygg-common-core -- 公共工具类核心包
     ├── xygg-common-log -- 日志服务
     └── xygg-common-security -- 安全工具类
├── xygg-config -- 配置中心[8888]
├── xygg-eureka -- 服务注册与发现[8761]
├── xygg-gateway -- Spring Cloud Gateway网关[9999]
└── xygg-upms -- 通用用户权限管理模块
     └── xyggx-upms-api -- 通用用户权限管理系统公共api模块
     └── xyggx-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── xyggx-visual  -- 图形化模块 
     ├── xyggx-monitor -- Spring Boot Admin监控 [5001]
     └── xyggx-codegen -- 图形化代码生成[5003]
	 
```


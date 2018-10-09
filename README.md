# demos
示例程序
## 目录：

 |项目|描述|
 |:--|:--|
 |demo_ssm02|基于spring boot进行配置构建的SSM框架|
 |demo_ssm03|基于spring/spring mvc/mybatis手动配置构建的SSM框架|
 |demo_mJ1|mybatis框架搭建使用|
### [mybatis汇总](demo_ssm03/README.md)
1. 配置
* 环境配置 -- (各种环境变量)<br />
  environments<br />
  mappers<br />
  typeAliases<br />
  properties<br />
  settings<br />
  ..等
* 映射配置 -- (关系型数据到对象的映射，以及映射时使用的各种设计)<br />
  cache<br />
  select/insert/update/delete<br />
  parameterType<br />
  flushCache/useCache<br />
  resultType<br />
  resultMap<br />
    association<br />
      懒加载<br />
    collection<br />
      懒加载<br />
  动态sql<br /><br />
2. 主要类介绍
  * SqlSessionFactory<br />
  * SqlSession<br />
    selectOne(<xml中id>,参数)  查询一个<br />
    getMapper  通过接口获取映射实例<br />
    ..等<br /><br />
3. 缓存
  * 一级缓存<br />
  session本地缓存<br />
  session有效期内有效
  * 二级缓存<br />
  映射文件中配置<cache />开启二级缓存，或在单独的select中配置使用缓存。在环境配置文件中，可通过setting设置cacheEnable来控制所有映射器已经配置的任何缓存<br />
  mybatis运行有效期间有效
  <br /><br />
4. 懒加载
 * 开启方式<br />
  在association与collection中设置fetchType为lazy  
 * 全局控制<br />
  在config.xml中设置lazyLoadingEnabled控制全局  
  <br />
  
### 手动搭建SSM框架
1. 创建webapp原型的maven项目
2. 添加servlet依赖
3. 更改project facets中的dynamic web module 为3.1
4. 添加spring/spring mvc的依赖
5. 搭建spring框架
6. 搭建spring mvc框架
7. 搭建mybatis框架
8. 添加spring-mybatis依赖
9. 使用spring-jdbc集成SSM框架
10. 添加c3p0数据库连接池，集成框架
  
  

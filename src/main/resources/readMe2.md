1、集成数据库的pom依赖配置
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-jdbc</artifactId>
</dependency>
<dependency>
<groupId>com.alibaba</groupId>
<artifactId>druid-spring-boot-starter</artifactId>
<version>1.1.9</version>
</dependency>
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<version>5.1.6</version>
</dependency>

一个数据库jdbc驱动，一个mysql连接，一个具体用哪个数据库，3个缺一不可，连接mysql

2、添加security依赖后会挡住druid登录验证
<!--添加该依赖后会挡住druid登录验证-->
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>

3、登录地址：
http://localhost:8030/druid/login.html
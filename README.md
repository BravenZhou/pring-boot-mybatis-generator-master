# spring-boot-mybatis-generator

To configure and run mybatis generator, you need to:

1. add `mybatis-generator-maven-plugin` in `pom.xml`
2. configure `application.properties`
3. configure `generatorConfig.xml`
4. run as maven-build: goals: `mybatis-generator:generate` 即可自动生成

To integrate Spring Boot with Mybatis, you need to:

1. configure `/config/spring-mybatis.xml`
2. configure `/config/mybatis-config.xml`
3. configure `/config/MybatisConfig.java`
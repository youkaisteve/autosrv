# autosrv

loading...

## DEV

### auto restart

```bash
./gradlew :api:build --continuous
```

### run

```bash
./gradlew bootRun
```


## AOP

### 依赖

```
dependencies {
    ...
    compile group: 'org.springframework.boot', name: 'spring-boot-starter-aop'
}
```

### 使用

- @Aspect 将一个java类定义为切面类
- @Pointcut [Pointcut Expressions](http://www.baeldung.com/spring-aop-pointcut-tutorial)
- @Before 在切入点开始处切入内容
- @After 在切入点结尾处切入内容
- @AfterReturning 在切入点return内容之后切入内容（可以用来对处理返回值做一些加工处理）
- @Around 在切入点前后切入内容，并自己控制何时执行切入点自身的内容
- @AfterThrowing 用来处理当切入内容部分抛出异常之后的处理逻辑

## LOG

使用logback [Why](https://www.oschina.net/translate/reasons-to-prefer-logbak-over-log4j)

### 依赖

springboot 默认已支持

### 配置

配置文件:src/main/resources/logback-spring.xml
更多配置请参考[The logback manual](https://logback.qos.ch/manual/index.html)

## 安全认证

使用Spring Security + JWT

[Spring Security Reference](http://docs.spring.io/spring-security/site/docs/4.1.0.RELEASE/reference/htmlsingle/)

[JWT Introduction](https://jwt.io/introduction/)

### 依赖

```
dependencies {
    ...
    compile("org.springframework.boot:spring-boot-starter-security")
    compile("io.jsonwebtoken:jjwt:0.7.0")
}
```

### 配置&使用

writing...

``TODO``

- [ ] 优化认证功能的结构,独立成单独一个项目
- [ ] 详细介绍WebSecurity机制

## 依赖注入

``TODO``

- [ ] 介绍使用方法

[参考文章](https://stormpath.com/blog/spring-boot-dependency-injection)

## MyBatis

writing...

``TODO``

- [ ] MyBatis 易用性封装
- [ ] MyBatis 性能优化

## TODO

- [ ] figure out how to disable liveload in none dev environment
- [x] integrate swagger2
    - [ ] swagger authtoken integrate
- [x] 统一处理业务异常
- [x] Security with jwts [Refer to](https://auth0.com/blog/securing-spring-boot-with-jwts/)
- [x] logback integration
- [ ] cache integration
- [x] MyBatis integration


## References

[SpringBoot-Learning](http://git.oschina.net/didispace/SpringBoot-Learning)

[springboot-learning-example](https://git.oschina.net/jeff1993/springboot-learning-example)
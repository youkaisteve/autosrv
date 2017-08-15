# autosrv

loading...

## DEV

### auto restart

```bash
./gradlew build --continuous
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

这里使用log4j

### 依赖

```
compile group: 'org.springframework.boot', name: 'spring-boot-starter-log4j', version: '1.3.8.RELEASE'
```

由于log4j和springboot自带的logback有冲突,需要排除logback
```
configurations {
    all*.exclude module: 'spring-boot-starter-logging'
    all*.exclude module: "logback-classic"
}
```

### 配置

目前使用log4j 1.x, 如果要切换到log4j 2.x,请参考[Apache Log4j 2](https://logging.apache.org/log4j/2.x/manual/index.html)

具体配置参考src/main/resources/log4j.properties

## TODO

- [ ] figure out how to disable liveload in none dev environment
- [x] integrate swagger2
- [x] 统一处理业务异常
- [ ] log integration
- [ ] cache integration
- [ ] MyBatis integration
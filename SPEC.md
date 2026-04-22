# SPEC.md - test-dataAuthorityControl

## 1. Project Overview

- **Project Name**: test-dataAuthorityControl
- **Project Type**: Maven Java Project (Spring Boot)
- **Description**: 数据权限控制测试项目，基于Spring Boot实现数据权限管理。
- **Location**: /Users/junw/Documents/GitHub/test-dataAuthorityControl

## 2. Build Status

**Compilation: FAILED**

### Compilation Errors
```
mybatisPlusInterceptor.java:[16,8] implicitly declared classes are not supported in -source 17
mybatisPlusInterceptor.java:[1,1] compact source file should not have package declaration
```
**Root Cause**: Source file has package declaration issue - file may be using Java 16+ compact source format incorrectly.

## 3. Project Structure

```
test-dataAuthorityControl/
├── pom.xml
├── mvnw / mvnw.cmd
├── src/main/java/wo1261931780/stdataAuthorityControl/
│   ├── StDataAuthorityControlApplication.java
│   ├── config/
│   │   ├── mybatisPlusInterceptor.java
│   │   ├── myInterceptor.java
│   │   ├── UserDataPermission.java
│   │   ├── MyDataPermissionInterceptor.java
│   │   ├── MyDataPermissionHandler.java
│   │   ├── MyDataPermissionHandler2.java
│   │   ├── DataScope.java
│   │   ├── DataPermissionMapper.java
│   │   └── DataPermission.java
│   └── test/
├── src/main/resources/
│   └── application.properties
└── target/
```

## 4. Technology Stack

- Java 17
- Spring Boot
- MyBatis-Plus
- MySQL
- AOP (数据权限拦截)

## 5. Key Features

- 数据权限过滤器
- 权限注解
- AOP切面
- MyBatis拦截器
- 用户权限范围控制

## 6. README Status

- README.md: EXISTS
- SPEC.md: CREATED (this file)

## 7. Gitignore

Standard Java gitignore covering:
- Compiled class files (*.class)
- Log files (*.log)
- Package archives (*.jar, *.war, etc.)
- IDE files (.idea, .iml)
- OS files (.DS_Store)

## 8. Build Fix Suggestions

Fix the `mybatisPlusInterceptor.java` file:
1. Ensure proper class declaration with `public class`
2. Remove compact source format or add proper `package` statement at top

## 9. Last Updated

2026-04-22

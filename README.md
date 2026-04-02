# Personal-Blog 个人博客系统
基于 **Spring Boot + MySQL + HTML** 开发的简易个人博客系统，实现文章管理、用户登录、评论互动等核心功能，适合作为计算机专业课程设计与个人项目实践。

## 技术栈
- **后端**：Spring Boot、MyBatis、MySQL
- **前端**：HTML、CSS、JavaScript
- **工具**：Maven、Git、IntelliJ IDEA

## 功能模块
1. **用户模块**：管理员登录、身份验证
2. **文章模块**：文章新增、编辑、删除、列表展示、详情查看
3. **评论模块**：文章评论提交与展示
4. **页面模块**：登录页、文章列表页、新增文章页

## 项目结构
```
blog/
├── src/main/java/com/example/blog/
│   ├── controller/       # 控制层（接口处理）
│   ├── service/          # 业务层
│   ├── mapper/           # 数据访问层
│   ├── entity/           # 实体类
│   ├── common/           # 通用工具（统一返回结果）
│   └── BlogApplication.java  # 启动类
├── src/main/resources/
│   └── application.yml   # 配置文件
├── add.html              # 新增文章页面
├── list.html             # 文章列表页面
├── login.html            # 登录页面
└── pom.xml               # Maven 依赖配置
```

## 运行步骤
1. **环境准备**：安装 JDK 1.8+、MySQL 8.0、IntelliJ IDEA
2. **数据库配置**：创建 `blog` 数据库，执行项目内 SQL 脚本
3. **修改配置**：在 `application.yml` 中配置 MySQL 用户名与密码
4. **启动项目**：运行 `BlogApplication.java`，访问 `http://localhost:8080`

## 项目特点
- 前后端分离设计，结构清晰易扩展
- 完整的 CRUD 操作，覆盖后端开发核心知识点
- 适配新手学习，代码注释完善，便于理解与二次开发

## 许可证
MIT License

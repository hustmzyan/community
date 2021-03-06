## 亦风社区

## 资料
[Spring](https://spring.io/guides)
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[es 社区](https://elasticsearch.cn/explore)
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)
[Bootstrap 文档](https://v3.bootcss.com/getting-started/)
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[Spring 文档](https://docs.spring.io/spring-boot/docs/)

## 工具
[Git](https://git-scm.com/download)
[Visual Paradigm](https://www.visual-paradigm.com)
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

```sql
CREATE TABLE user
(
    id int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    accountId VARCHAR(100),
    name VARCHAR(50),
    token VARCHAR(36),
    gmtCreate BIGINT,
    gmtModified BIGINT
);
```

```bash
mvn flyway:migrate
```
CREATE TABLE user
(
    id int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    accountId VARCHAR(100),
    name VARCHAR(50),
    token VARCHAR(36),
    gmtCreate BIGINT,
    gmtModified BIGINT
);
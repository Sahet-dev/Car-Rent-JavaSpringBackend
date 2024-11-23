
CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       username VARCHAR(100) UNIQUE NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email_verified_at DATETIME DEFAULT NULL,
                       remember_token VARCHAR(255) DEFAULT NULL,
                       enabled BOOLEAN DEFAULT TRUE,
                       created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
                       updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

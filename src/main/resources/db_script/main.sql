-- Database Name:
CREATE DATABASE schedule_master_users;

USE schedule_master_users;

GRANT ALL PRIVILEGES ON schedule_master_users.* TO 'root'@'localhost' IDENTIFIED BY 'root';

-- USER TABLE STRUCTURE:
CREATE TABLE users(
                      user_id INT NOT NULL AUTO_INCREMENT,
                      first_name VARCHAR(50) NOT NULL,
                      last_name VARCHAR(50) NOT NULL,
                      email VARCHAR(255) NOT NULL UNIQUE,
                      password VARCHAR(255) NOT NULL,
                      created_at TIMESTAMP,
                      updated_at TIMESTAMP,
                      PRIMARY KEY(user_id)
);
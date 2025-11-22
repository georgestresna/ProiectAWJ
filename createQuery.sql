CREATE DATABASE traveljournal;

CREATE USER 'user'@'localhost' IDENTIFIED BY 'passkey';
GRANT ALL PRIVILEGES ON traveljournal.* TO 'user'@'localhost';
FLUSH PRIVILEGES;


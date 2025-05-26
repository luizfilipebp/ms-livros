CREATE TABLE livros (
    liv_isbn VARCHAR(13) PRIMARY KEY,
    liv_titulo VARCHAR(100) NOT NULL UNIQUE,
    liv_autor VARCHAR(100)  NOT NULL,
    liv_editora VARCHAR(100)  NOT NULL,
    liv_quantidade INT NOT NULL DEFAULT 0
);
CREATE TABLE pokemon (
	id INTEGER auto_increment PRIMARY KEY,
	nome varchar(255) NOT NULL,
	numero varchar(255) NOT NULL,
    tipo INTEGER,
    FOREIGN KEY(tipo) REFERENCES tipo(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
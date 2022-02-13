CREATE TABLE pokemon (
	id INTEGER auto_increment PRIMARY KEY,
	nome varchar(255) NOT NULL COMMENT 'Nome do Pokémon.',
	numero varchar(255) NOT NULL COMMENT 'Número do Pokémon no Pokedex Nacional.',
    geracao varchar(255) NOT NULL COMMENT 'Geracao que o pokemon pertence',
    tipo INTEGER,
    FOREIGN KEY(tipo) REFERENCES tipo(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
CREATE TABLE pokemon (
	id INTEGER auto_increment PRIMARY KEY,
	nome varchar(255) NOT NULL COMMENT 'Nome do Pokémon',
	numero varchar(255) NOT NULL COMMENT 'Número do Pokémon no Pokedex Nacional',
    geracao_id INTEGER NOT NULL COMMENT 'Geracao que o pokemon pertence',
    FOREIGN KEY(geracao_id) REFERENCES geracao(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
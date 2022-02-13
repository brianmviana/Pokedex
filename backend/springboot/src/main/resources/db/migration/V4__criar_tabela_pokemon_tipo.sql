CREATE TABLE pokemon_tipo (
	id INTEGER auto_increment PRIMARY KEY,
	id_pokemon INTEGER,
	id_tipo INTEGER,
    FOREIGN KEY(id_pokemon) REFERENCES pokemon(id),
    FOREIGN KEY(id_tipo) REFERENCES tipo(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;
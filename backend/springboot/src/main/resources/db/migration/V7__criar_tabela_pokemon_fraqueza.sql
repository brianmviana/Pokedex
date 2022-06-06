CREATE TABLE pokemon_fraqueza (
	id_pokemon INTEGER,
	id_fraqueza INTEGER,
    FOREIGN KEY(id_pokemon) REFERENCES pokemon(id),
    FOREIGN KEY(id_fraqueza) REFERENCES tipo(id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci;

package dev.brianmviana.apis.pokedex.entities;

public enum Geracao {

    GERACAO_1("1ª Geração"),
    GERACAO_2("2ª Geração"),
    GERACAO_3("3ª Geração"),
    GERACAO_4("4ª Geração");

    private final String geracao;

    /**
     * @param geracao
     */
    Geracao(final String geracao) {
        this.geracao = geracao;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return geracao;
    }


}

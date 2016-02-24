package esi.atl.g39121.cards;

/**
 * Enumération des treize valeurs possibles dans un jeu de 52 cartes.
 */
public enum Value {
    /**
     * L'As.
     */
    ACE("As"),
    /**
     * Le deux.
     */
    TWO("2"),
    /**
     * Le trois.
     */
    THREE("3"),
    /**
     * Le quatre.
     */
    FOUR("4"),
    /**
     * Le cinq.
     */
    FIVE("5"),
    /**
     * Le six.
     */
    SIX("6"),
    /**
     * Le sept.
     */
    SEVEN("7"),
    /**
     * Le huit.
     */
    EIGHT("8"),
    /**
     * Le neuf.
     */
    NINE("9"),
    /**
     * Le dix.
     */
    TEN("10"),
    /**
     * Le valet.
     */
    JACK("Valet"),
    /**
     * La reine.
     */
    QUEEN("Reine"),
    /**
     * Le roi.
     */
    KING("Roi");

    private String s;

    Value(String s) {
        this.s = s;
    }

    /**
     * Retourne un String qui représente une valeur d'un carte d'un jeu de Carte.
     * @return un String
     */
    @Override
    public String toString() {
        return s;
    }
}

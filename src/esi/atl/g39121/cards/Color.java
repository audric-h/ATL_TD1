package esi.atl.g39121.cards;

/**
 * Enumération des 4 enseignes possibles dans un jeu de 52 cartes.
 */
public enum Color {
    /**
     * L'enseigne Trèfle
     */
    CLUB("Trèfle"),
    /**
     * L'enseigne Carreau
     */
    DIAMOND("carreau"),
    /**
     * L'enseigne Coeur
     */
    HEART("Coeur"),
    /**
     * L'enseigne Pique
     */
    SPADE("Pique");

    private String s;

    Color(String s) {
        this.s = s;
    }

    /**
     * Retourne un String qui représente une enseigne d'un jeu de Carte.
     * @return Un String.
     */
    @Override
    public String toString() {
        return s;
    }
}

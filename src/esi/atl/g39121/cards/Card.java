package esi.atl.g39121.cards;

/**
 * <p>Une carte d'un jeu de 52 cartes.
 * Chacune des 52 cartes est unique.</p>
 * Elle est représenté avec une {@link Value} et une {@link Color}.
 */
public class Card {
    private Color color;
    private Value value;

    /**
     * <p>Constructeur.</p>
     * <p>Il vérifie que ses paramètres ne sont pas null.</p>
     * @param color L'enseigne de la {@link Card}.
     * @param value La valeur de la {@link Card}.
     * @throws IllegalArgumentException Si un des 2 paramètres est null.
     */
    public Card(Color color, Value value) {
        if(color == null || value == null) {
            throw new IllegalArgumentException("Constructor of Card failed");
        }
        this.color = color;
        this.value = value;
    }

    /**
     * Retourne un String qui représente une Carte d'un jeu de Carte.
     * @return un String
     */
    @Override
    public String toString() {
        return value.toString() + " de " + color.toString();
    }
}

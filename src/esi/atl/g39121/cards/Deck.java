package esi.atl.g39121.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Représente un jeu de 52 cartes. Chaque carte est unique.
 */
public class Deck {
    private List<Card> listCard = new ArrayList<>();

    /**
     * <p>Constructeur.</p>
     * <p>Initialise les 52 cartes du jeu.</p>
     */
    public Deck() {
        for(Color a : Color.values()) {
            for(Value b : Value.values()) {
                listCard.add(new Card(a,b));
            }
        }
    }

    /**
     * Mélange les cartes du jeu.
     */
    public void shuffle() {
        Collections.shuffle(listCard);
    }

    /**
     * Vérifie si le {@link Deck} possède encore des cartes.
     * @return true si le {@link Deck} est vide, false sinon.
     */
    public boolean isEmpty() {
        return !(listCard.size() > 0);
    }

    /**
     * <p>Retourne la première {@link Card} du deck, et la retire de celui-ci.</p>
     * <p>Elle ne se trouve donc plus dans le {@link Deck} après.</p>
     * @return La première {@link Card} du {@link Deck}.
     */
    public Card takeCard() {
        if(!isEmpty()) return listCard.remove(0);
        else return null;
    }

    /**
     * Retourne un String qui représente le jeu de carte.
     * @return un String.
     */
    @Override
    public String toString() {
        return listCard.toString();
    }
}

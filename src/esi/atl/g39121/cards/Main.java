package esi.atl.g39121.cards;

public class Main {
    public static void main(String[] args) {
        // Crée un paquet de cartes.
        Deck deck = new Deck();

        // Mélange le paquet de cartes.
        deck.shuffle();

        int nbCard = 0;
        try {
            // Vérifie si il n'y a bien qu'un seul argument.
            if(args.length < 0 || args.length > 1) throw new IllegalArgumentException("Nombre de paramètres invalide");

            // Vérifie si le nombre de Carte est bien comprise entre 1 et 52.
            nbCard = Integer.parseInt(args[0]);
            if(nbCard < 1 || nbCard > 52) throw new IllegalArgumentException("Nombre invalide.");
        } catch (Exception e) {
            System.out.println("Usage : <java Main x>, Ou x est un nombre compris entre 1 et 52");
        }

        // Affiche les Cartes désirées.
        for(int i=0;i<nbCard;i++) {
            System.out.println(deck.takeCard().toString());
        }
    }
}

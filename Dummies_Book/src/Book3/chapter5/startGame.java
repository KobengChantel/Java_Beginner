package Book3.chapter5;
//Now suppose that you have a method called startGame that accepts two param-
//eters: a Dealable object and a String that indicates what game to play
public class startGame {
    private void startGame(Dealable deck, String game) {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equals("Hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);

    }
}

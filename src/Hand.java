import java.util.ArrayList;
import java.util.Comparator;

public class Hand {
    private ArrayList<Card> hand = new ArrayList<>(13);
    public Hand() {
    }
    public void addCard(@org.jetbrains.annotations.NotNull Deck deck){
        hand.add(deck.removeCard());
        hand.sort(Card::compareTo);
    }

    @Override
    public String toString() {
        return hand.toString();
    }
}

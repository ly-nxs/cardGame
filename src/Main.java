public class Main {
    public static void main(String[] args){
        Deck deck = new Deck();
        System.out.println("Deck:");
        System.out.println(deck.toString());
        deck.shuffle();
        System.out.println("Shuffle:");
        System.out.println(deck.toString());
        System.out.println();
        System.out.println("Deal Cards");
        Hand[] players = new Hand[4];

        for (int i = 0; i < players.length; i++){
            for(int j = 0; j < 13; j++){
                players[i].addCard(deck);
            }
            System.out.println("Player " + (i+1) + ": " + players[i]);
        }
    }
}
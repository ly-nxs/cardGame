import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> list = new ArrayList<>();

    public  Deck(){
        for(int i = 0; i < 4; i++){
            if(i == 0){
                for(int j = 1; j < 14; j++){
                    String skibidi = "D";
                    Card temp = new Card(j,skibidi);
                    list.add(temp);
                }
            }
            if(i == 1){
                for(int j = 1; j < 14; j++){
                    String skibidi = "C";
                    Card temp = new Card(j,skibidi);
                    list.add(temp);
                }
            }
            if(i == 2){
                for(int j = 1; j < 14; j++){
                    String skibidi = "H";
                    Card temp = new Card(j,skibidi);
                    list.add(temp);
                }
            }
            if(i == 3){
                for(int j = 1; j < 14; j++){
                    String skibidi = "S";
                    Card temp = new Card(j,skibidi);
                    list.add(temp);
                }
            }
        }
    }

    public Card removeCard(){
        Card sigma = list.get(0);
        list.removeFirst();
        return sigma;
    }

    public void shuffle() {
        Collections.shuffle(list);
    }

    @Override
    public String toString() {
       return list.toString();
    }
}

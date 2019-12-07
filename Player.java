import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class Player{
    private int totalPoints;
    private ArrayList<Card> hand;

    public Player(){
        hand = new ArrayList<Card>();
        totalPoints = 0;
    }

    public int getTotalPoints(){
        totalPoints = 0;
        for(int i = 0; i<hand.size(); i++ )
            totalPoints += hand.get(i).getNum();
        return totalPoints;
    }

    public String showHand(){
        String x = "";
        for(int i = 0; i<hand.size(); i++ ){
            x = x + hand.get(i).toString();
            x = x + ",  ";
        }
        return x;
    }

    public void addaCard(Card y){
        hand.add(y);
    }

    public void resetHand(){
        hand = new ArrayList<Card>();
        totalPoints =0;
    }

    public Card getFirst(){
        return hand.get(0);
    }

    
}
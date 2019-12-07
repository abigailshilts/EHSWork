import java.util.*;
public class Deck{
    private int numDel;
    private ArrayList<Card> cardz;

    public Deck(){
        numDel = 0;
        cardz = new ArrayList<Card>();
            for(int i = 0; i<52; i++)
                cardz.add(new Card());
    }

    public void printer(){
        for(int y = 0; y < 13; y++)
            System.out.print(cardz.get(y) + " ");
        System.out.println();
        for(int x = 13; x < 26; x++)
            System.out.print(cardz.get(x) + " ");
        System.out.println();
        for(int a = 26; a < 39; a++)
            System.out.print(cardz.get(a) + " ");
        System.out.println();
        for(int b = 39; b < 52; b++)
            System.out.print(cardz.get(b) + " ");


    }


}
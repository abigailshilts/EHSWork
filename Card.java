import javax.lang.model.util.Element4anner6;

public class Card{
    private int cardVal;
    private int suit;
    private static int cardNum =  1;
    private static int suitNum = 0;


    public Card(){
        if(cardNum==27){
            cardNum++;
            cardVal = 1;
        }
        else if(cardNum/1 < 14)
            cardVal = cardNum;
        else if(cardNum/14 <= 1){
            if(cardNum == 26)
                cardVal =13;
            else
                cardVal = cardNum%13;
        }
        else if(cardNum/26 == 1&&cardNum<41)
            cardVal = cardNum%27;
        else{
            if(cardNum== 52)
                cardVal = 12;
            else if(cardNum== 53)
                cardVal = 13;
            else
                cardVal = cardNum%39 -1;
        }
           
        if(cardNum == 41)
            suitNum = 3;
        else
            suitNum = cardNum/14;
        cardNum ++;
        if(cardNum>=54){
            cardNum=1;
        }
        suit = suitNum;

    }

    public int getNum(){
        if(cardVal == 1)
            return 11;
        else if (cardVal<10)
            return cardVal;
        else
            return 10;
    }

    public String toString(){
        String n;
        if(cardVal == 1)
            n = "  Ace";
        else if (cardVal == 11)
            n = "  Jack";
        else if (cardVal == 12)
            n = "  Queen";
        else if (cardVal == 13)
            n = "  King";
        else 
            n = "  " + cardVal;

        String s;
        if(suit == 0)
            s = " ♥️ ";
        else if(suit == 1)
            s = " ♦️ ";
        else if(suit == 2)
            s = " ♠️ ";
        else
            s = " ♣️ ";
        
        return n + s;
        
        }
    }


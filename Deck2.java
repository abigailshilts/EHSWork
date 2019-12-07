public class Deck2{
    private int numDel;
    private Card[][] deckz;

    public Deck2(){
        numDel = 0;
        deckz = new Card[4][13];
    }

    public Card getCard(int r, int c){
        return deckz[r][c];
    }

    public void setArray(){
        for(int i = 0; i <4;i++){
            for(int y = 0; y < 13; y++){
                deckz[i][y] = new Card();
            }
        }
    }

    public void printer(){
        for(int i = 0; i <4;i++){
            for(int y = 0; y < 13; y++){
                if(deckz[i][y]== null)
                    System.out.print("  --  ");
                else
                    System.out.print(deckz[i][y]);
            
            }
            System.out.println();
        }
        System.out.println();
    }

    public void removeCard(int i, int y){
        deckz[i][y] = null;
        numDel += 1;
        printer();
        if(numDel>39){
            setArray();
            printer();
            numDel = 0;
        }
    }
}
public class Dealer extends Player{
    private Deck2 dec;

    public Dealer(){
        super();
        dec = new Deck2();
        dec.setArray();
    }

    public void showDeck(){
        dec.printer();
    }

    public Card deal(){
        int r = (int)( Math.random()*4);
        int c = (int)( Math.random()*13);

        while(dec.getCard(r, c) == null){
            r = (int)( Math.random()*4);
            c = (int)( Math.random()*13);
        }

        Card temp = dec.getCard(r, c);
        dec.removeCard(r,c);
        return temp;
    }

}
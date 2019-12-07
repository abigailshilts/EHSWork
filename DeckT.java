import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
public class DeckT{
    
    public static void main (String[] args){
       
        Player p1 = new Player();
        Dealer d1 = new Dealer();
        String continu = "yes";
        Scanner a = new Scanner(System.in);
        while(continu.equals("yes")){
           

            p1.addaCard(d1.deal());
            d1.addaCard(d1.deal());
            p1.addaCard(d1.deal());
            d1.addaCard(d1.deal());
            System.out.println("...");
            System.out.println("Your hand: " + p1.showHand());
            System.out.println("Dealer is showing: " + d1.getFirst().toString());
            String con = "  ";
            if(p1.getTotalPoints()== 21){
                System.out.println("🎉🎉🎉 Congrats you won!!! 🎉🎉🎉");
                System.out.println("dealer had: " + d1.showHand());
            }

            else{
            
                
                while((!con.equals("stay") && p1.getTotalPoints() < 21 )){
                    System.out.println("Would you like to hit? (type stay to stay; hit to hit)");
                    con = a.nextLine();
                    if (con.equals("hit")){
                        p1.addaCard(d1.deal());
                    System.out.println("Your hand: " + p1.showHand() +  "your points = " + p1.getTotalPoints());
                    }
                }
            
                if(p1.getTotalPoints()>21){
                    System.out.println("You lose");
                    System.out.println("dealer had: " + d1.showHand());
                }
           
                else{
                
                    d1.showHand();
                    while(d1.getTotalPoints() < 16){
                        d1.addaCard(d1.deal());
                        d1.showHand();
                    }
                    if(d1.getTotalPoints()> p1.getTotalPoints() && d1.getTotalPoints() < 22)
                        System.out.println(" You loose, " + "dealer had: " + d1.showHand());
                    else if(d1.getTotalPoints()< p1.getTotalPoints() ||  d1.getTotalPoints() > 21)
                        System.out.println("🎉🎉🎉 You Win 🎉🎉🎉" + "   dealer had: " + d1.showHand());
                    else
                        System.out.println("Tie, " + "dealer had: " + d1.showHand());
                }
        
            }
            System.out.println("Would you like to continue?  (yes to  continue)");
            continu = a.nextLine();
            p1.resetHand();
            d1.resetHand();
        
        }
    }
}

/*
  Deck2 j = new Deck2();
        j.setArray();
        j.printer();
        
        String y = "y";
        Scanner a = new Scanner(System.in);


while(y.equals("y")){
            System.out.println("enter location");
            int i = a.nextInt();
            int x = a.nextInt();
            j.removeCard(i, x);
            System.out.println("Continue?");
            String temp = a.nextLine();
            y = a.nextLine();
        }
*/
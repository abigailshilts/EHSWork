import java.util.*;
public class RPS
{
    public static void main (String[] args)
    {
        Scanner a = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        String z;

        do {
            int rock = 1;
            int paper = 2;
            int scissors = 3;

            int b = (int)(1+Math.random()*3);
            System.out.println("Enter a rock, paper, or scissors");
            String c = a.nextLine();

            if (b == 1)
            System.out.println("Computer Chose rock");
            else if (b == 2)
            System.out.println("Computer Chose paper");
            else
            System.out.println("Computer Chose scissors");
            
            System.out.println("you Chose " + c);

            if(b == rock) {
                if (c.equals("paper")) {
                    System.out.println("You win"); 
                    y++;
                } else if (c.equals("rock")) {
                    System.out.println("Tie");
                } else {
                    System.out.println("You Lose");
                    x++;
                }
            } else if (b == paper){ 
                if (c.equals("paper"))
                {
                    System.out.println("Tie"); 
                }
                else if (c.equals("rock"))
                {
                    System.out.println("You Lose");
                    x++;
                }
                else{
                    System.out.println("You Win");
                   y++;
                }
            } else {
                if (c.equals("paper")){
                    System.out.println("You Lose"); 
                    x++;
                }
                else if (c.equals("rock")){
                    System.out.println("You Win");
                    y++;
                }
                else{
                 System.out.println("Tie");
                 }
            }

            System.out.println("Type yes to play again");
            z = a.nextLine();

        } while(z.equals("yes"));
        System.out.println("record; Computer = " + x + " You = " + y);

             
         
    }
}
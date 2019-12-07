import javax.lang.model.util.ElementScanner6;

public class War{
    public static void main (String[] args){
        int[] Player1 = new int[26];
        int[] Player2 = new int[26];

        for(int i = 0; i < 26; i++){
            Player1[i] = (int)(Math.random()*12 +3);
            Player2[i] = (int)(Math.random()*12 +3);
        }

        System.out.println("Player one has:    Player two has:");

        for(int y = 0; y< 26; y++){
            if (Player1[y] < 11)
                System.out.print(Player1[y] + "                 ");
            else{
                if(Player1[y]== 11)
                    System.out.print("Jack              ");
                else if (Player1[y] == 12)
                    System.out.print("Queen             ");
                else if (Player1[y] == 13)
                    System.out.print("King              ");
                else
                    System.out.print("Ace               ");
                }   
            if (Player2[y] < 11)
                System.out.println(Player2[y] + "                   ");
            else{
                if(Player2[y]== 11)
                    System.out.println("Jack");
                else if (Player2[y] == 12)
                    System.out.println("Queen");
                else if (Player2[y] == 13)
                    System.out.println("King");
                else
                    System.out.println("Ace");
                }
        }
        
        int tally1 = 0;
        int tally2 = 0;
        int ties = 0;
        for (int q = 0; q < 26; q++){
            if (Player1[q] <11)
                System.out.println("Player one has: " + Player1[q]);

            else{
                if(Player1[q]== 11)
                    System.out.println("Player one has a Jack");
                else if (Player1[q] == 12)
                    System.out.println("Player one has a Queen");
                else if (Player1[q] == 13)
                    System.out.println("Player one has a King");
                else
                    System.out.println("Player one has an Ace");
                }
            if (Player2[q] <11)
                System.out.println("Player two has: " + Player2[q] + "\n");
        
            else{
                if(Player2[q]== 11)
                    System.out.println("Player two has a Jack \n");
                else if (Player2[q] == 12)
                    System.out.println("Player two has a Queen \n");
                else if (Player2[q] == 13)
                    System.out.println("Player two has a King \n");
                else
                    System.out.println("Player two has an Ace \n");
                }
            if(Player1[q] > Player2[q])
                tally1++;
            else if(Player1[q] < Player2[q])
                tally2++;
            else
                ties++;
            System.out.println("Player one has won: " + tally1 + " times");
            System.out.println("Player two has won: " + tally2 + " times");
            System.out.println("there have been "  + ties + " ties \n \n \n \n \n");
            }
        System.out.println("Player one won: " + tally1 + " times");
        System.out.println("Player two won: " + tally2 + " times");
        System.out.println("there were "  + ties + " ties");
    
        
    
    }
}
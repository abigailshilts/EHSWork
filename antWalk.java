import javax.lang.model.util.ElementScanner6;

public class antWalk{

    public static void main (String[] args){

        int grid[][] = {{0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}, {0,0,0,0,0,0,0,0,0}};
        int r = 4;
        int c = 4;
        int moves = 0;
        while(r < 10 && r>-1 && c >-1 && c <10){
           int direction = (int)( Math.random()*4 +1);
           if (direction == 1)
                r +=1;
            else if (direction == 2 )
                r -=1;
            else if (direction == 3)
                c +=1;
            else
                c-=1;
        
            if(r < 9 && r>-1 && c >-1 && c <9)
            grid[r][c] ++;
            moves++;

        }

        if(r == -1)
            System.out.println("ant fell off to the west");
        else if(r == 10)
            System.out.println("ant fell off to the east");
        else if(c == -1)
            System.out.println("ant fell off to the north");
        else
            System.out.println("ant fell off to the south");

        System.out.println("there where: " + moves + " moves");

        for(int i = 0; i <10; i++){
            for(int y = 0; y< 10; y++){
                System.out.println(grid[i][y]);
            }
        }





    }
}
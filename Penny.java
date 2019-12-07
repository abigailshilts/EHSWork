import javax.lang.model.util.ElementScanner6;

public class Penny{

    public static void main (String[] args){
        int[][] board ={{1, 1, 1, 1, 1}, {1, 2, 2, 2, 1}, {1, 2, 3, 2, 1,}, {1, 2, 2, 2, 1}, {1, 1, 1, 1, 1}};
        int[][] location = new int[2][3];
        int total = 0;
        for(int i = 0; i <3; i++){
            int temporaryRow = (int)( Math.random()*4);
            int temporaryColumn = (int)( Math.random()*4);

            total += board[temporaryRow][temporaryColumn];
            System.out.println("(" + temporaryRow + ", " + temporaryColumn + ")");
        
            if(location[0][0] == temporaryRow && location[1][0] == temporaryColumn)
                i--;

            else if (location[0][1] == temporaryRow && location[1][1] == temporaryColumn)
                i--;

            else if (location[0][2] == temporaryRow && location[1][2] == temporaryColumn)
                i--;

            else{
                location[0][i] = temporaryRow;
                location[1][i] = temporaryColumn;
                

            }
            
        }

        for (int r = 0; r < 5; r++){
            for(int c = 0; c < 5; c++){
                if(location[0][0] == r && location[1][0] == c)
                    System.out.print("p ");
                else if (location[0][1] == r && location[1][1] == c)
                    System.out.print("p ");

                else if (location[0][2] == r && location[1][2] == c)
                    System.out.print("p ");

                else
                    System.out.print(board[r][c] + " ");
            }
            System.out.println();

        }

        System.out.println("your total is: " + total);
   
    }

}
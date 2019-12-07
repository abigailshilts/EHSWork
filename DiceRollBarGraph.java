
public class DiceRollBarGraph{

    public static void main (String[] args){

        String[] graph = {"", "", "", "", "", "", "", "", "", "", ""};

        for (int i = 100; i>0; i--){
            int x = (int)(Math.random()*6 + 1) + (int)(Math.random()*6 + 1);
            if (x== 2)
                graph[0] += "*";

            else if (x ==3)
                graph[1] += "*";
                
            else if (x == 4)
                graph[2] += "*";

            else if (x == 5)
                graph[3] += "*";

            else if (x == 6)
                graph[4] += "*";

            else if (x == 7)
                graph[5] += "*";

            else if (x == 8)
                graph[6] += "*";

            else if (x == 9)
                graph[7] += "*";

            else if (x == 10)
                graph[8] += "*";

            else if (x == 11)
                graph[9] += "*";

            else
                graph[10] += "*";


        }

        System.out.print("  2: " + graph[0] + "\n  3: " + graph[1] + "\n  4: " + graph[2] + "\n  5: " + graph[3] + "\n  6: " + graph[4] + "\n  7: " + graph[5] + "\n  8: " + graph[6] + "\n  9: " + graph[7] + "\n 10: " + graph[8] + "\n 11: " + graph[9] + "\n 12: " + graph[10]);


    }

}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class HangMan
{
    public static void main(String[] args) throws FileNotFoundException 
    {
//////////////Reads In the words from a file into a String of Words////////////////////////////////////
	    Scanner scan = new Scanner(new File("Words.txt"));  // scan is the stream for the file
	    String [] wordList = new String [125];

	    //input loop from file Vote.txt
	    for(int i = 0; i < wordList.length; i++)
	    {
		    if(scan.hasNext())
                wordList[i]=scan.next().toLowerCase();
            //System.out.println(wordList[i]);
	    }
	    scan.close(); 
/////////////TO HERE/////////////////////////////////

        String hidden = wordList[(int)(Math.random()*125)+1];
        
        String Word = "";
        for (int i=0; i<hidden.length(); i++)
            Word += "-";
        System.out.println(Word);
        System.out.println("______________\n|             |\n|             \n|             \n|             \n|             \n|             \n|             \n|             \n______________________________");
        String[] man = {"______________\n|             |\n|             \n|             \n|             \n|             \n|             \n|             \n|             \n______________________________","______________\n|             |\n|             O\n|             \n|             \n|             \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O\n|             |\n|             \n|             \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O\n|            (|\n|             \n|             \n|             \n|             \n|             \n______________________________", "______________\n|             | \n|             O \n|            (|) \n|             \n|             \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O \n|            (|)\n|            ( \n|             \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O \n|            (|)\n|            ( )\n|             \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O \n|            (|)\n|            ( )\n|           -  \n|             \n|             \n|             \n______________________________", "______________\n|             |\n|             O \n|            (|)\n|            ( )\n|           -   -\n|             \n|             \n|             \n______________________________"};
        int hMan = 0;
        int win = 0;
        String wrong = "";
        Scanner a = new Scanner(System.in);
        while(hMan < 8){
            System.out.println("Guess a letter");
            String line = a.nextLine();
            char guess = line.charAt(0);
            int right = 0;
            for (int j = 0; j< hidden.length(); j++){
                if (guess == hidden.charAt(j)){
                    Word = Word.substring(0,j) + guess + Word.substring(j+1);
                    right +=1;
                }
                
            }
            if (right == 0){
                hMan++;
                wrong += guess + ", ";
            }
            System.out.println(man[hMan]);
            System.out.println(Word);
            System.out.println("wrong letters:  " + wrong);

            if(Word.indexOf('-')== -1){
                win++;
                hMan = 8;
            }



        }
        if(win ==1){
            System.out.println("Yay! You win");
            System.out.println("Word was: " + hidden);
        }
        else{
            System.out.println(man[hMan]);
            System.out.println("Loose");
            System.out.println("Word was: " + hidden);
        }                 

    }
}
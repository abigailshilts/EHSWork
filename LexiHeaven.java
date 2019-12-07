import java.util.ArrayList;
import java.util.Scanner;
public class LexiHeaven{
    public static void main (String[] args){
        int num = 0;
        System.out.println("How many words do you want to enter?");
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        String notImportant = a.nextLine();
        ArrayList<String> words = new ArrayList<String>();
        int i = 0;
        while(i < num){
            System.out.println("enter a word");
            String www = a.nextLine();
            words.add(www);
            i++;
        }

        for (String person : words){
        System.out.print(person + " ");
        }

        System.out.println();

        int x = 1;
     while(x != 0){
         x = 0;
         for(int y = 0; y < words.size()-1; y++){
             if(words.get(y).compareTo(words.get(y+1))>0){
                String temp = words.get(y);
                words.remove(y);
                words.add(y+1, temp);
                x++;
             }
             
         }
     }
     for (String person : words){
        System.out.print(person + " ");
        }
     
    
     
     
        // ArrayList<String> newWords = new ArrayList<String>();



        /* int numm = 0;
        int compCount = 0-(words.size()-1);
        int inndex;
        int temp;
        while (compCount != 1){
            for(int j = 0; j < words.size(); j++){
                for(int x = 0; x <words.size(); x++){
                    if(words.get(j).compareTo(words.get(x)) <= 0){
                        numm += -1;
                    }
                   temp = x;
                }
                if(compCount == numm)
                inndex = temp;
            }
           
                newWords.add(words.get(inndex));
                words.remove(inndex);
                compCount += 1;
            
           
            
        }

        for (String neww : newWords){
            System.out.print(neww + " ");
            }
        System.out.println("done");
        */
    }
}
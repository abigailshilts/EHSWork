import java.util.ArrayList;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;

public class GetInLine{
    public static void main (String[] args){

        ArrayList<String> peopleOrder = new ArrayList<String>();
        peopleOrder.add("Andrew");
        peopleOrder.add("Sarah");
        peopleOrder.add("Will");
        peopleOrder.add("Evelyn");
        peopleOrder.add("David");
        
        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        peopleOrder.add("Steven");

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        peopleOrder.remove(3);

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        peopleOrder.add( 1, "Samantha");

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        System.out.print("Will is at position 3");
        System.out.println();

        peopleOrder.add("Jessica");

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        peopleOrder.remove(3);
        peopleOrder.add("Will");

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        System.out.print("person next to the last person is " + peopleOrder.get(peopleOrder.size()-2));
        System.out.println();

        peopleOrder.add(0, peopleOrder.get(peopleOrder.size()-1));
        peopleOrder.remove(peopleOrder.size()-1);
        peopleOrder.add(peopleOrder.get(1));
        peopleOrder.remove(1);
        
        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        int times = 0;
        for (int i = 0; i < peopleOrder.size(); i++)
            if (peopleOrder.get(i).equals("David"))
                times++;
        
        if (times>0)
            System.out.println("There is a David");
        else
            System.out.println("There is not a David");
        
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println( "Enter a name, and position");
        String x = a.nextLine();
        int y = b.nextInt();
        peopleOrder.add(y, x);

        for (String person : peopleOrder){
            System.out.print(person + " ");
        }
        System.out.println();

        for (int i = 0; i < peopleOrder.size(); i++)
            if(peopleOrder.get(i).charAt(0) == 'S')
                peopleOrder.remove(i);
        
        for (String person : peopleOrder){
            System.out.print(person + " ");
            }
        System.out.println();
}
}
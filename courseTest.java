import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
import java.util.*;
public class courseTest{
    public static void main (String[] args){
        ArrayList <course> people = new ArrayList <course>();
        Scanner a = new Scanner(System.in);
        String con = "y";
        String Extra;
        
        String another;
        while(con.equals("y")){
           
            
            System.out.println("enter a coures name ");
            String namez = a.nextLine();
            System.out.println("enter a coures gpa ");
            double g = a.nextDouble();
            if(namez.charAt(0)=='A' && namez.charAt(1)== 'P'){
                people.add(new coureseW(namez, g));
            }
            else{
                people.add(new course(namez, g));
            }
            
            System.out.println("would you  like to continue? of so enter y ");
            Extra = a.nextLine();
            con = a.nextLine();
            
            
        }

        for(int i = 0; i < people.size(); i++){
            System.out.println(people.get(i).toString());
        }
        double av = 0;
        double wav = 0;
        for(int i = 0; i < people.size(); i++){
            av += people.get(i).getGradeN();
            wav += people.get(i).getGrade();

        }
        System.out.println("average : " + av/(people.size() )+ " weighted average: " + wav/(people.size()));
    }
    
}
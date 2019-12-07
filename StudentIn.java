
public class StudentIn{
    public static void main (String[] args){
        person[] people = new person[4];

        people[0] = new person(7, 'f', "Sam");
        people[1] = new StudentGlass(3.4, 14, 'm', "James");
        people[2] = new Teacher(32, 'm', "Gabe", 53000.00, "Science");
        people[3] = new CollegeStudentClass(3.6, 21, 'f', "Racheal", "CompSci", "Junior");

        for(int i = 0; i < 4; i++){
            System.out.println(people[i].toString());
        }

    }

}
public class CollegeStudentClass extends StudentGlass{
    private String major;
    private String grade;

    public CollegeStudentClass(double v, int x, char y, String z, String m, String g){
        super(v, x, y, z);
        major = m;
        grade = g;
    }

    public String toString(){
        String first = super.toString();
        return first + " major: " + major + " Grade: " + grade;
    }
}
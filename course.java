public class course{
    private String name;
    private double grade;

    public course(String x, double y){
        name = x;
        grade = y;
    }

    public double getGradeN(){
        return grade;
    }

    public double getGrade(){
        return grade;
    }

    public String toString(){
        return " name: " + name + " Grade: " + grade;
    }
}
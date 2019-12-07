public class StudentGlass extends person{
    protected double GPA;
    protected int ID;
    private static int IDnum = 1;

    public StudentGlass(double v, int x, char y, String z){
       
        super(x, y, z);
        GPA = v;
        ID = IDnum;
        IDnum += 1;
    }

    public String toString(){
        String first = super.toString();
        return first + " GPA: " + GPA + " ID: " + ID;
    }
}
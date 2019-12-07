public class Teacher extends person{
    protected double salary;
    protected String subject;

    public Teacher(int x, char y, String z, double d, String s){
        super(x, y, z);
        salary = d;
        subject = s;
    }

    public String toString(){
        String first = super.toString();
        return first + " salary: " + salary + " subject: " + subject;
        }
}
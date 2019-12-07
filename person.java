public class person{
    protected int age;
    protected char gender;
    protected String name;

    public person(int x, char y, String z){
        age = x;
        gender = y;
        name = z;
    }

    public String toString(){
       return "name: " + name + " gender: " + gender + " age: " + age;
    }

}
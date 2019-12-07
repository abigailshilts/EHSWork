public class coureseW extends course{
    private double weight;

    public coureseW(String x, double y){
        super(x, y);
        weight = 1.2;
    }


    public double getGrade(){
        return super.getGrade()*weight;
    }

    public String toString(){
        return super.toString() + " weighted version " + this.getGrade();
    }
}
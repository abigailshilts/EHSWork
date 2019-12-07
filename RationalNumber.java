import java.util.*;
public class RationalNumber{

    private int numerator;
    private int denominator;

    public RationalNumber(int n, int d){
        numerator = n;
        denominator = d;
    }
    public int getNum(){
        return numerator;
    }

    public int getDenom(){
        return denominator;
    }

    public RationalNumber add(RationalNumber x){
        int n= numerator*x.getDenom();
        int d = denominator*x.getDenom();
        return new RationalNumber( n+ (x.getNum()*denominator), d);
        }

    public RationalNumber subtract(RationalNumber x){
        int n= numerator*x.getDenom();
        int d = denominator*x.getDenom();
        return new RationalNumber( n- (x.getNum()*denominator), d);
    }

    public RationalNumber mult(RationalNumber x){
        int n = numerator*x.getNum();
        int d = denominator*x.getDenom();
        return new RationalNumber( n, d);

    }

    public RationalNumber div(RationalNumber x){
        int n = numerator*x.getDenom();
        int d = denominator*x.getNum();
        return new RationalNumber(n,d);
    }

    public String toString(){
        return numerator + "/" + denominator + " ";
    }

    public boolean equals(RationalNumber x){
        if(((double)numerator)/denominator == ((double)x.getNum())/x.getDenom()){
            return true;
        }

        else
            return false;
    }

}
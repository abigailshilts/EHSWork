import java.util.*;

public class RNTest {

      public static void main(String[] args) {

      // prompt the user for 2 fraction entries

      Scanner s1 = new Scanner(System.in);


      System.out.print("Enter a numerator: ");

      int x = s1.nextInt();


      System.out.print("Enter a denominator: ");

      int y = s1.nextInt();


      System.out.print("Enter a numerator: ");

      int a = s1.nextInt();


      System.out.print("Enter a denominator: ");

      int b = s1.nextInt();

      

      // create 2 RationalNumber objects

      RationalNumber r1 = new RationalNumber(x,y);
      RationalNumber r2 = new RationalNumber(a,b);

      // print out each Rational Number with the toString method 

            System.out.println("Rational Number 1 is "+r1);

            System.out.println("Rational number 2 is "+r2);

      // add, subtract, multiply, and divide r1 and r2 as follows:

// these will all create and return the answer rational number and it // will call the toString method in the statements below.

            System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));

            System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));

            System.out.println(r1 + " * " + r2 + " = " + r1.mult(r2));

            System.out.println(r1 + " / " + r2 + " = " + r1.div(r2));

// test if they are equal here.        
            System.out.println(r1.equals(r2));


      }

}
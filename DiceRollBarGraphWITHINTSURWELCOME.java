public class DiceRollBarGraphWITHINTSURWELCOME{
    public static void main (String[] args){
        int[] sumOptions = {2,3,4,5,6,7,8,9,10,11,12};
        int[] numberOfEach = new int[11];
        int roll1;
        int roll2;
        int sum;
        for(int i = 1; i<=100; i++){
            roll1 = (int)(Math.random()*6)+1;
            roll2 = (int)(Math.random()*6)+1;
            sum = roll1+roll2;
            numberOfEach[sum-2]++;
        }
        for(int j=0; j<=10; j++){
            System.out.print(sumOptions[j] + ": ");
            for(int z = 1; z<= numberOfEach[j]; z++)
                System.out.print("*");
            System.out.println();
        }
    }

}
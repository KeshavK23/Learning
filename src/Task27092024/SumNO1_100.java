package Task27092024;

public class SumNO1_100 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=100)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of 1 to 100 is "+sum);
    }
}

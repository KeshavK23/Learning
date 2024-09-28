package Task20092024;

public class MaxNo {

    public static void main(String[] args) {
        //Ternary condition
        int a =30;
        int b=20;
        int c=10;

        int max1 = (a > b ? a : b );
        //System.out.println(max1);
        int max = max1 > c ? max1 : c ;
        System.out.println(max);
    }
}

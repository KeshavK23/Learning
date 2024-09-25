package Task25092024;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        for (int i = 2; i <= no; i++) {

            for(int j=1;j<=i;j++){

                if(i%1==0&& i%j==0)
                {
                    System.out.println(i);
                }
            }

        }
    }
}

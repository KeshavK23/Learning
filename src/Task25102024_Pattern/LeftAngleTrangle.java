package Task25102024_Pattern;

import java.util.Scanner;

public class LeftAngleTrangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        for (int i = num; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

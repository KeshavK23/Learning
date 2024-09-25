package Task25092024;

import java.util.Scanner;

public class Tabel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int no = sc.nextInt();
        System.out.println("Table using for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(no*i);

        }
        System.out.println("Table using While loop");
        int n=1;
        while (n<=10){
            System.out.println(no*n);
            n++;
        }
    }
}

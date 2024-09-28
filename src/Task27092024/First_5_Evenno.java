package Task27092024;

import java.util.Scanner;

public class First_5_Evenno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start no to find 5 even no");
        int i= sc.nextInt();
        int count=0;
        do {
            if(i%2==0)
            {
                System.out.println(i);
                count++;
            }
            i++;
        }while(count<5);
    }
}

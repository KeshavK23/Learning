package Task25092024;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int flag=0;
        for (int i = 2; i < no; i++) {
            if(no%i==0)
            {
                //System.out.println(i);
                flag++;
            }
        }
        if(flag==1){
            System.out.println("No is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}

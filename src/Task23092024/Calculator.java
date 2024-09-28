package Task23092024;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Calculator using Switch case

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two no");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter what you do 1.Add, 2.sub, 3.Mul, 4.Div, 5.Mod");
        int choice= sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("addition is "+(num1+num2));
                break;

            case 2:
                System.out.println("Subtraction is "+(num1-num2));
                break;

            case 3:
                System.out.println("Multi is "+(num1*num2));
                break;

            case 4:
                System.out.println("Division is "+(num1/num2));
                break;

            case 5:
                System.out.println("Modules is "+(num1%num2));
                break;

            default:
                System.out.println("Wrong input");
                break;

        }
    }
}

package Task20092024;

import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of 3 triangle sides");
        int side1=sc.nextInt();
        int side2= sc.nextInt();
        int side3=sc.nextInt();
        if(side1==side2 && side1==side3 && side2==side3){
            System.out.println("Trangle is eq");
        } else if (side1==side2 ||side1==side3 || side2==side3) {
            System.out.println("Trangle is isosceles");

        }else {
            System.out.println("Trangle is scalene");
        }

    }
}

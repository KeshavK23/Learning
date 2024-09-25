package Task25092024;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to find Vowels and constant");
        String s = sc.next();
        int vo=0;
        int co=0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E'|| s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
                System.out.println(s.charAt(i));
                vo++;
            }
            else{
                co++;
            }

        }
        System.out.println("In given string "+vo+" Vowels and "+co+" Constant");
    }
}

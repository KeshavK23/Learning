package Task18102024;

public class StringPalindrome {
    public static void main(String[] args) {
        String str="Madam";
        String pali="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            pali=ch+pali;
        }
        System.out.println(str);
        System.out.println(pali);
        if(str.equals(pali)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

package Task18102024;

public class Concatenation {
    public static void main(String[] args) {
        String str1="Keshav";
        String str2="Kadam";
        char ch;
        for(int i=0;i< str2.length();i++)
        {
            ch=str2.charAt(i);
            str1=str1+ch;
        }
        System.out.println("Concatenated string : "+str1);
    }
}

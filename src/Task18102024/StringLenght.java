package Task18102024;

public class StringLenght {
    public static void main(String[] args) {
        //String length without function

//        String str="keshav";
//        int count=0;
//        for(int i=0;i<str.length();i++){
//            count++;
//        }
//        System.out.println("String length is :"+count);
//

        String s="Vision";
        int length=0;
        for(char c : s.toCharArray())
        {
            length++;

        }
        System.out.println("String length is :"+length);
    }
}

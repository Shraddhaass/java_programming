
import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        String s2="",s1,s3,s4,s5;
        int len,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        s1=sc.next();
        StringBuffer sb=new StringBuffer(s1);
        System.out.println("capacity"+sb.capacity());
        System.out.println("Length"+sb.length());
        len=sb.length();
        if(len==0){
            System.out.print("string is empty");
        }
        else{
            for(i=len-1;i>=0;i--){
                s2=s2+s1.charAt(i);

            }
            System.out.println("Reversed string is="+s2);
        }
        s3=s2.toUpperCase();
        System.out.println("Uppercase="+s3);
        System.out.println("Enter second string");
        s4=sc.next();
        StringBuffer sb1=new StringBuffer(s3);
        s5=sb1.append(s4).toString();
        System.out.println("The append string is="+s5);

    }
}

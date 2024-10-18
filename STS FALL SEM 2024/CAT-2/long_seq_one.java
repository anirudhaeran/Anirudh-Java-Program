import java.util.*;
public class long_seq_one{
    public static void main(String[] args) {  
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        int cl=0,pl=0,ml=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            cl++;
            else{
                ml=Math.max(ml,cl+pl+1);
                pl=cl;
                cl=0;
            }
        }
        System.out.println(s);
        ml=Math.max(ml,cl+pl+1);
        System.out.println(ml);
    }
}
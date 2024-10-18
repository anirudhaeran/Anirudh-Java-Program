// package cat-2 revision;
import java.util.*;
public class lon_seq_one_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toBinaryString(n);
        int cl=0,pl=0,ml=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            cl++;
            else{
                ml=Math.max(ml, cl+pl+1);
                pl=cl;
                cl=0;
            }
        }
        ml=Math.max(cl+pl+1, ml);
        System.out.println(ml);
    }
    
}

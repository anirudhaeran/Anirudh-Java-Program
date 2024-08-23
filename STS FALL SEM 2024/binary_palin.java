import java.util.*;
public class binary_palin {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String bin=Integer.toBinaryString(n);

        char ch;
        String rev_bin="";
        for(int i=0;i<bin.length();i++)
        {
            ch=bin.charAt(i);
            rev_bin=ch+rev_bin;
        }
        if(bin.equals(rev_bin))
        System.out.println("yes");
        else
        System.out.println("no");
    }
}

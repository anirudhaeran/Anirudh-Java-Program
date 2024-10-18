import java.util.*;
public class Karatsuba2 {

    public static long K(long x,long y)
    {
        if(x<10&&y<10)
        return x*y;

        long n=Math.max(String.valueOf(x).length(),String.valueOf(y).length());
        long n1=n/2;

        long a=x/(long)Math.pow(10,n1);
        long b=x%(long)Math.pow(10,n1);
        long c=y/(long)Math.pow(10,n1);
        long d=y%(long)Math.pow(10,n1);

        long s1=K(a,c);
        long s2=K(b,d);
        long s3=K(a+b,c+d)-s1-s2;
        long s4=s1*((long)Math.pow(10, 2*n1))+s3*(long)Math.pow(10, n1)+s2;
        return s4;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        long x=sc.nextLong();
        System.out.println("Enter the second number");
        long y=sc.nextLong();
        System.out.println(K(x,y));
    }
}

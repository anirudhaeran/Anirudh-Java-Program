import java.util.*;
public class simple_sieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime[]=new boolean[n+1];
        Arrays.fill(isprime,true);
        
        for(int i=2;i*i<=n;i++)
        {
            if(isprime[i])
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    isprime[j]=false;
                }
            }
        }

        for(int i=2;i<isprime.length;i++)
        {
            if ((isprime[i])) {
                System.out.println(i+" ");
            }
        }
    }
}

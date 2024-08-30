import java.util.Scanner;

public class seive_of_era {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean b[]=new boolean[n+1];
        for(int i=2;(int)i*i<=n;i++)
        {
            for(int j=2*i;j<=n;j+=i)
            {
                b[j]=true;
            }
        }
        for(int i=2;i<b.length;i++)
        {
            if(b[i]==false)
            System.out.print(i+" ");
        }
    }
}

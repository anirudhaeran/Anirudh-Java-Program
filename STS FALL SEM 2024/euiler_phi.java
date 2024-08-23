import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class euiler_phi {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ar=new ArrayList<>();

        int n;
        n=sc.nextInt();

        euiler_phi obj=new euiler_phi();
        // System.out.println(obj.gcd(10,5 ));
        for(int i=1;i<n;i++)
        {
            if((obj.gcd(i,n))==1)
            ar.add(i);
        }
        int sum=0;
        for(int i:ar)
        {
            sum+=i;
        }
        System.out.println(sum);
    }

    public int gcd(int a,int b)
    {
        int n;
        if(a>b)
        n=b;
        else
        n=a;
        
        int max=0;
        for(int i=1;i<=n;i++)
        {
            if(a%i==0 && b%i==0)
            max=i;
        }
        return max;
    }
}

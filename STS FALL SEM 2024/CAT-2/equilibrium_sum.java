import java.util.*;
public class equilibrium_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int index=0;
        if(arr.length==1)
        {
            System.out.println(arr[0]);
        return;
        }
        if(arr.length>=3)
        {
            int sum[]=new int[n];
            int sum1=0;
            for(int i=0;i<n;i++)
            {
                sum1+=arr[i];
                sum[i]=sum1;
            }

            for(int i=1;i<n-1;i++)
            {
                int Lsum=sum[i]-arr[i];
                int Rsum=sum[n-1]-sum[i];
                if(Lsum==Rsum)
                {
                    sum1=Lsum;
                    index=i;
                }
            }
            System.out.println("Sum="+sum1);
            System.out.println("Equi index="+index);
        }
    }
}

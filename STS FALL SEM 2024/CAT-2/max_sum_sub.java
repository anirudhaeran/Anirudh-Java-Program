import java.util.*;
public class max_sum_sub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        int max=Integer.MIN_VALUE; int sum=0;

        int startin=-1;
        int endin=-1;
        int s;
        for(int i=0;i<n;i++)
        {        
            sum+=arr[i];

            if(sum>max)
                max=sum;

            if(sum<0)
            sum=0;
        }


        System.out.println("Max sum="+max);
    }
}

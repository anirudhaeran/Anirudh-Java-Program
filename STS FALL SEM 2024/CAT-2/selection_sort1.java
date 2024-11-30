import java.util.*;
public class selection_sort1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<=n-1;i++) arr[i]=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            int index=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[index])
                    index=j;
            }

            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        for(int i=0;i<n-1;i++) System.out.print(arr[i]+" ");
    }
}

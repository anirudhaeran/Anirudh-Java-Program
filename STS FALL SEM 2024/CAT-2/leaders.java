import java.util.Scanner;

public class leaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        for(int k=0;k<z;k++){
            int n=sc.nextInt();
            int arr[]=new int[n];

            int j=0;
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

            for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++)
                if(arr[j]>arr[i]) break;
            if(j==n)
            System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

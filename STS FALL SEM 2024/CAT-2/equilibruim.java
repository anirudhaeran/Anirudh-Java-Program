import java.util.Scanner;

public class equilibruim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int sum=0;int pref=0;
        for(int i=0;i<n;i++)
        sum+=arr[i];

        for(int i=0;i<n;i++){
            pref+=arr[i];
            if(pref==sum)
            {System.out.println(sum);
            return;}
        sum-=arr[i];
        }
        System.out.print(0);
    }
}

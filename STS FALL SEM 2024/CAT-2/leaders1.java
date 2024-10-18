import java.util.*;
public class leaders1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max){
                l.add(arr[i]);
                max=arr[i];}
        }
        System.out.println();
    }
}

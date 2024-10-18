import java.util.*;
public class blockswap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the positions by which you need to rotate");
        int d=sc.nextInt();
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)a[i]=sc.nextInt();

        int temp1[]=new int[n-d];
        int temp2[]=new int[d];
        int j=0;
        for(int i=0;i<n;i++){
            if(i>=d)
            temp1[i]=a[i];
            else{
            temp2[j]=a[i];
            j++;}}

        int k=0;
        for(int i=0;i<n;i++){
            if(i>n-d)
            a[i]=temp1[i];
            else{
            a[i]=temp2[k];
            k++;}}

        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}

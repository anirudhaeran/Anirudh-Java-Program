import java.util.*;
public class Quicksort{
    static int partition(int a[],int low,int high){
        int pivot = a[low];
        int i=low,j=high;
        while(i<j){
            while(a[i]<=pivot&&i<=high-1) i++;
            while(a[j]>pivot&&j>=low+1) j--;
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;
    }
    static void quicksort(int a[], int low, int high){
        if(low<high){
            int pivotindex=partition(a,low,high);
            quicksort(a,low,pivotindex-1);
            quicksort(a,pivotindex+1,high);
            
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        quicksort(a,0, n-1);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
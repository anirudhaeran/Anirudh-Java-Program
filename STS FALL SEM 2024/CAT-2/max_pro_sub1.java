import java.util.*;
public class max_pro_sub1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int suff=1;int pref=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(pref==0)pref=1;
            if(suff==0)suff=1;
            pref*=arr[i];
            suff*=arr[n-i-1];
            ans=Math.max(ans, Math.max(suff,pref));
        }
        System.out.println(ans);
    }
}

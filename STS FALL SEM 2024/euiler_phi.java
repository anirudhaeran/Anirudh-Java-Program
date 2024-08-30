// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Scanner;

// public class euiler_phi {
    
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer> ar=new ArrayList<>();

//         int n;
//         n=sc.nextInt();

//         euiler_phi obj=new euiler_phi();
//         // System.out.println(obj.gcd(10,5 ));
//         for(int i=1;i<n;i++)
//         {
//             if((obj.gcd(i,n))==1)
//             ar.add(i);
//         }
//         int sum=0;
//         for(int i:ar)
//         {
//             sum+=i;
//         }
//         System.out.println(sum);
//     }

//     public int gcd(int a,int b)
//     {
//         int n;
//         if(a>b)
//         n=b;
//         else
//         n=a;
        
//         int max=0;
//         for(int i=1;i<=n;i++)
//         {
//             if(a%i==0 && b%i==0)
//             max=i;
//         }
//         return max;
//     }
// }

import java.util.*;
public class euiler_phi
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = n;
        int original=n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                n/=i;
                result-=result/i;
            }
        }
        if(n>1)
        result-=result/n;
        System.out.println(result);
        int sum=(result*original)/2;
        System.out.println(sum);
    }
}

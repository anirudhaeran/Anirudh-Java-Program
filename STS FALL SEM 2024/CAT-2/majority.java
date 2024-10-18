import java.util.*;
public class majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        HashMap<Integer,Integer> m= new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int value=m.getOrDefault(arr[i],0);
            m.put(arr[i], value+1);
        }

        for(Map.Entry<Integer,Integer> i: m.entrySet())
        {
            int value=i.getValue();
            if(value>Math.floor(n/2))
            System.out.print("Majority Element:"+i.getKey());
        }
    }
}

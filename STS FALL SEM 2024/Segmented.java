import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Segmented
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int l = sc.nextInt();
        System.out.println("Enter upper limit");
        int h = sc.nextInt();
        int sq = (int) Math.sqrt(h);
        ArrayList<Integer> primes = simplesieve(sq);
        boolean[] isPrime = new boolean[h-l+1];
        Arrays.fill(isPrime, true);
        for(int prime:primes)
        {
            if (l == 1) {
                isPrime[0] = false;
            }
            int sm = Math.max(prime * prime, (l + prime - 1) / prime * prime);
          if(sm<l)
          sm+=l;
          for(int i=sm;i<=h;i+=prime)
          {
            
            isPrime[i-l]=false;
          }
        }
        for(int i=l;i<=h;i++)
        {
            if(isPrime[i-l])
            System.out.print(i+" ");
        }
    }

    public static ArrayList<Integer> simplesieve(int n)
    {
        boolean is_prime []= new boolean[n+1];
        Arrays.fill(is_prime, true);
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=2;i*i<=n;i++)
        {
            if(is_prime[i])
            {
                for(int p=i*i;p<=n;p+=i)
                is_prime[p] = false;
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(is_prime[i])
            prime.add(i);
        }
        return prime;
    }
}
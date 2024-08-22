import java.util.Scanner;
class euclidean {

    static int n1;
    static int n2;

    public void gcd()
    {
        int n;
        if(n1>n2)
        n=n2;
        else
        n=n1;

        int max=0;
        for(int i=1;i<=n;i++)
        {
            if(n1%i==0 && n2%i==0)
                max=i;
        }

        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();

        euclidean obj=new euclidean();
        obj.gcd();
        
    }
}


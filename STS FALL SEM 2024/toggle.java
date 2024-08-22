import java.util.Scanner;

public class toggle {
    int n;
    Scanner sc=new Scanner(System.in);
    
    int tarr[];

    public void accept()
    {
        n=sc.nextInt();
        tarr=new int[n];
        for(int i=0;i<n;i++)
        {
            tarr[i]=1;
        }
    }

    public void toggle_bulb()
    {
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<n;j=j+(i+1))
            {
                if(tarr[j]==1)
                tarr[j]=0;
                else
                tarr[j]=1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(tarr[i]==1)
            sum++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        // 0 means OFF and 1 means ON
        toggle obj=new toggle();
        obj.accept();
        obj.toggle_bulb();
    }    
}

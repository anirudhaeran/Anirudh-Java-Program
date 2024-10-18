import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        for(int j=0;j<c;j++)
        arr[i][j]=sc.nextInt();

        int max=0; int sum=0;
        for(int i=0;i<r-2;i++)
        {
            for(int j=0;j<c-2;j++)
            {
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                arr[i+1][j+1]+
                arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                max=Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}

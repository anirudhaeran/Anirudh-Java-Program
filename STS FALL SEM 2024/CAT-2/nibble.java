import java.util.*;
public class nibble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%16*16+(n/16));
    }
}

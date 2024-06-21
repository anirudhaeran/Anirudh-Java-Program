import java.util.Arrays;
import java.util.Scanner;

class andcode1{

    String part1="";
    String part2="";
    String sorted_part1="";
    public void arrange(String s1)
    {
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            int inch=(int)ch;
            System.out.println(ch);
            if(inch>=65)
                part1+=(char)inch;
            else
            {
                int ch1=Character.getNumericValue(ch);
                sum+=ch1;
            }
        }
        part2=Integer.toString(sum);
    }
    public void sort()
    {
        char[] characters = part1.toCharArray();
        Arrays.sort(characters);
        String sortedString = new String(characters);
        sorted_part1=sortedString;
    }
    public void display()
    {
        String Final=sorted_part1+part2;
        System.out.println(part1);
        System.out.println(part2);
        System.out.println("FINAL STRING: "+Final);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=sc.next();
        s1.toUpperCase();
        andcode1 obj=new andcode1();
        obj.arrange(s1);
        obj.sort();
        obj.display();
    }
}
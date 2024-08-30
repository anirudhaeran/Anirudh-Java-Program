// import java.util.*;
// class strob_number
// {
    
//     public String num_rotate(char num)
//     {
//         if(num=='0')
//             return "0";
//         else if (num=='1')
//             return "1";
//         else if(num=='8')
//             return "8";
//         else if(num=='6')
//             return "9";
//         else
//             return "6";
//     }
//     public void rotate(int n)
//     {
//         String strn=Integer.toString(n);
        
//         String str_new="";
//         for(int i=0;i<strn.length();i++)
//         {
//             char ch=strn.charAt(i);
//             if(ch=='1'|| ch=='0' || ch=='8' || ch=='9' ||ch=='6')
//                 str_new=num_rotate(ch)+str_new;
                
//         }
//         if(strn.equals(str_new))
//             System.out.print(n+" ");
//     }
//     public static void main(String[] args) {
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         n=sc.nextInt();
//         strob_number obj=new strob_number();
//         int start = (int) Math.pow(10, n - 1);
//         int end = (int) Math.pow(10, n);
//         for(int i=start;i<end;i++)
//         {
//             obj.rotate(i);
//         }
        
//     }
// }

import java.util.*;
class strob_number
{
    private static final Map<Character,Character> strob=new HashMap<>();

    static{
        strob.put('0','0');
        strob.put('1','1');
        strob.put('6','9');
        strob.put('8','8');
        strob.put('9','6');
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n))
        System.out.println("yes");
        else
        System.out.println("no");
    }

    public static boolean check(int n)
    {
        String str=Integer.toString(n);
        int left=0;
        int right=str.length()-1;

        while(left<=right)
        {
            char leftnum=str.charAt(left);
            char rightnum=str.charAt(right);

            if(!strob.containsKey(leftnum) || strob.get(leftnum)!=rightnum )
                return false;
            left++;
            right--;
        }
        
        return true;
    } 
}

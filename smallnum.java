import java.io.*;
import java.util.*;
class smallnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        String str=String.valueOf(a);
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        int l=str.length();
        int c=l-b;
        for(int i=0;i<c;i++)
        {
            System.out.print(ch[i]);
        }
    }
}

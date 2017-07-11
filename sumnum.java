import java.io.*;
import java.util.*;
import java.math.*;
class sumnum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String dummy="";
        int sum=1,sum1=0,sum2=0,sum3=0;
        for(int i=0;i<str.length();i++)
        {
        if(Character.isDigit(str.charAt(i)))
        dummy=dummy+str.charAt(i);
        }
        char arr[]=dummy.toCharArray();
       Arrays.sort(arr);
             for(int i=0;i<arr.length;i++)
       {
       sum=sum*(Integer.parseInt(Character.toString(arr[i]))+Integer.parseInt(Character.toString(arr[0])));
       }
              while(sum>0)
       {
           int c=sum%10;
           sum1=sum1+c;
           sum=sum/10;
           if(sum==0 && sum1>9)
           {
               sum=sum1;
               sum1=0;
           }
       }
        for(int i=0;i<arr.length;i++)
       sum2=sum2+(Integer.parseInt(Character.toString(arr[i]))*Integer.parseInt(Character.toString(arr[arr.length-1])));
       while(sum2>0)
       {
           int d=sum2%10;
           sum3=sum3+d;
           sum2=sum2/10;
           if(sum2==0 && sum3>9)
           {
               sum2=sum3;
               sum3=0;
           }
       }
       double sm=Math.min(sum1,sum3);
       System.out.println((int)(sm*sm)); 
    }}

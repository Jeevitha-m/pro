import java.io.*;
import java.util.*;
class gencrypt
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        String str1=s.next();
        int l=str1.length();
        for(int i=0;i<str.length();i++)
        { int n=(int)str.charAt(i)+10;
        if(Character.isLowerCase(str.charAt(i)))
         {
              if(n>(26+96))
              {
             int n5=(96+(10-((26+96)-(int)str.charAt(i))));
         System.out.print((char)n5);
       
              }
              else
           System.out.print((char)n);
         }
         else
         {
         if(n>(26+64))
              {
                     int n5=(64+(10-((26+64)-(int)str.charAt(i))));
         System.out.print((char)n5);
                    }
              else
              System.out.print((char)n);  
              }
        }
        System.out.println(" ");
        System.out.print(str1.charAt(0));
        String str2=str1.substring(1,str1.length()-1);
        for(int i=0;i<str2.length();i++)
          {
              int n1=(int)str2.charAt(i)+10;
              if(Character.isLowerCase(str2.charAt(i)))
              {
              if(n1>(26+96))
              {
               int n3=(96+(10-((26+96)-(int)str2.charAt(i))));
         System.out.print((char)n3);
                      }
              else
              System.out.print((char)n1);
        }
              else
              {
                if(n1>(26+64))
              {
               int n3=(64+(10-((26+64)-(int)str2.charAt(i))));
         System.out.print((char)n3);
                      }
              else
              System.out.print((char)n1);  
              }
          }
        System.out.print(str1.charAt(str1.length()-1));
        
    }
}


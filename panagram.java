import java.io.*;
import java.util.*;
class panagram
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        if(str.length()>=26)
        {
            Set<Character> set=new HashSet<Character>();
            for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));
            if(set.size()==26)
            System.out.println("PANAGRAM");
            else
            System.out.println("NOT A PANAGRAM");
        }
        else
        System.out.println("NOT A PANAGRAM");
    }
    }

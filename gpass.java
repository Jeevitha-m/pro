import java.io.*;
import java.util.*;
class gpass
{
public static void main(String args[])
{ 
String fn="",ln="";
Scanner s=new Scanner(System.in);
String str1=s.next();
String str2=s.next();
int pin=s.nextInt();
int n=s.nextInt();
String arr[]={str1,str2};
Arrays.sort(arr);
int l=str1.length();
int l1=str2.length();
String p1=String.valueOf(pin);
if(n<=p1.length())
{
if(l==l1)
{
fn=arr[1];
ln=arr[0];
}
else if(l<l1)
{
fn=str1;
ln=str2;
}
else if(l>l1)
{
fn=str2;
ln=str1;
}
if(Character.isLowerCase(fn.charAt(0)))
System.out.print((String.valueOf(fn.charAt(0))).toUpperCase());
else
System.out.print((String.valueOf(fn.charAt(0))).toLowerCase());
for(int i=0;i<ln.length();i++)
{
if(Character.isLowerCase(ln.charAt(i)))
System.out.print((String.valueOf(ln.charAt(i))).toUpperCase());
else
System.out.print((String.valueOf(ln.charAt(i))).toLowerCase());
}
System.out.print((int)p1.charAt(n-1)-48);
System.out.print((int)p1.charAt(p1.length()-n)-48);

}
else
System.out.println("PASSWORD CANNOT BE GENERATED");
}}

import java.util.Arrays;
import java.util.Scanner;
public class binary{
public static void main(String args[]) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[] a=new int[n];
int[] b=new int[n];
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
String s=Integer.toBinaryString(a[i]);
//System.out.println(s);
//System.out.println(s.length());
//System.out.println(s.replaceAll("1","").length());
b[i]=s.length()-s.replaceAll("1","").length();
//System.out.println(b[i]);
//while()
}
int[] c=new int[n];
System.arraycopy(b,0,c,0,b.length);
Arrays.sort(b);
for(int j=n-1;j>=0;j--)
{
for(int k=0;k<n;k++)
{
if(b[j]==c[k] && a[k]!=0)
{
System.out.print(a[k]+" ");
a[k]=0;
break;
}
}
}
}
}



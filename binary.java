import java.util.Arrays;
import java.util.Scanner;
public class binary{
  int i;
public static void main(String args[]) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
int brr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
String s=Integer.toBinaryString(arr[i]);
//System.out.println(s);
//System.out.println(s.length());
//System.out.println(s.replaceAll("1","").length());
brr[i]=s.length()-s.replaceAll("1","").length();
//System.out.println(b[i]);
//while()
}
int crr[]=new int[n];
System.arraycopy(brr,0,crr,0,b.length);
Arrays.sort(brr);
for(i=n-1;i>=0;i--)
{
for(int j=0;j<n;j++)
{
if(brr[i]==crr[j] && arr[j]!=0)
{
System.out.print(a[j]+" ");
a[j]=0;
break;
}
}
}
}
}



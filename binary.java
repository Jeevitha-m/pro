import java.io.*;
import java.util.*;
class binary
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int arr[]=new int[n];
String ba[]=new String[n];
for(int i=0;i<n;i++)
{
arr[i]=scan.nextInt();
}
for(i=0;i<n;i++)
{
ba[i]=Integer.toBinaryString(arr[i]);
while(ba[i]>0)
{
int c=ba[i]%10;
sum=sum+c;
ba[i]=ba[i]/10;
}

import java.io.*;
import java.util.*;
public class large
{
public static void main(String args[])
{
int n,i;
int a[]=new int[3];
int large=a[0];
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<a.length;i++)
{
a[i]=sc.nextInt();
if(a[i]>large)
large=a[i];
}
System.out.println(large);
}
}

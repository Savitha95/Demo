import java.io.*;
import java.util.*;
public class primecount
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int count=0;
for(int i=a;i<b;i++)
{
int flag=0;
for(int j=2;j<b;j++)
{
if(b%i==0)
flag++;
}
if(flag==0)
count++;
}
int d=b-count;
System.out.print(d);
}
}

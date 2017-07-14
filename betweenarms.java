import java.io.*;
import java.util.*;
public class betweenarms
{
public static void main(String args[])
{
int x,i;
int n,sum=0,count=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(i=a;i<=b;i++)
{
n=i;
while(n>0)
{
x=n%10;
sum=sum+(x*x*x);
n=n/10;
}
if(sum==i)
{
System.out.println(i+" ");
}
sum=0;
}
}
}
